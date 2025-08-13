// Long-running LifecycleWorkflow (optional, continuous) for a Patient-like entity
import io.temporal.workflow.Workflow;
import io.temporal.workflow.WorkflowMethod;
import io.temporal.workflow.SignalMethod;
import java.util.concurrent.atomic.AtomicInteger;

public interface PatientLifecycleWorkflow {
  @WorkflowMethod void start(String patientId);
  @SignalMethod  void onEvent(String type, String corrId, byte[] payload);
}

public class PatientLifecycleWorkflowImpl implements PatientLifecycleWorkflow {
  private final AtomicInteger events = new AtomicInteger(0);
  private String patientId;

  @Override
  public void start(String patientId) {
    this.patientId = patientId;
    // Park until first signal arrives
    Workflow.await(() -> false);
  }

  @Override
  public void onEvent(String type, String corrId, byte[] payload) {
    // 1) Read current state from RDF store by patientId
    // 2) Decide next Transition (LifecycleSpec), derive PlanSpec/TaskSpec
    // 3) Execute one Task (short-run) via OrchestratorActivity or TaskWorkflow
    // 4) Persist new state to RDF, (de)register due schedules
    if (events.incrementAndGet() >= 500) {
      Workflow.continueAsNew(patientId);
    }
  }
}
