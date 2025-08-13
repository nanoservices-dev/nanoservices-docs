// Minimal pattern: 1 Task = 1 Workflow = 1 OrchestratorActivity (then workflow ends)
import io.temporal.workflow.Workflow;
import io.temporal.workflow.WorkflowMethod;
import io.temporal.activity.ActivityInterface;
import io.temporal.activity.ActivityMethod;
import io.temporal.activity.ActivityOptions;
import java.time.Duration;

public interface TaskWorkflow {
  @WorkflowMethod byte[] run(String taskSpecId, byte[] input);
}

@ActivityInterface
interface OrchestratorActivities {
  @ActivityMethod StepResult oneTask(String taskSpecId, byte[] input);
}

class StepResult {
  public boolean done;
  public byte[] finalResult;
  public static StepResult done(byte[] out) { StepResult r = new StepResult(); r.done = true; r.finalResult = out; return r; }
}

public class TaskWorkflowImpl implements TaskWorkflow {
  private final OrchestratorActivities orch = Workflow.newActivityStub(
      OrchestratorActivities.class,
      ActivityOptions.newBuilder()
        .setStartToCloseTimeout(Duration.ofMinutes(5))
        .build());

  @Override
  public byte[] run(String taskSpecId, byte[] input) {
    StepResult r = orch.oneTask(taskSpecId, input);
    if (!r.done) { throw new IllegalStateException("OrchestratorActivity must finish the task in one call."); }
    return r.finalResult;
  }
}
