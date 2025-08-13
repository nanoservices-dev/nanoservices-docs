// Episodic lifecycle step (default): executes exactly one transition then exits
import io.temporal.workflow.WorkflowMethod;

public interface LifecycleStepWorkflow {
  @WorkflowMethod void apply(String entityId, String transitionId, byte[] ctx);
}

// Implementation would:
// 1) Load state & policy, 2) resolve PlanSpec/TaskSpec, 3) call OrchestratorActivity.oneTask(...),
// 4) persist new state, 5) schedule follow-ups. Ends immediately.
