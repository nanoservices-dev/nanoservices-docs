# nanoServices Short-Run Pattern
**Principle:** 1 Task = 1 Orchestration Activity = 1 Workflow run. No waiting. Temporal covers retries/timeouts; the workflow ends immediately after a single activity call.

## Roles
- **Service (Worker):** hosts NanoService Activities (Task executors) on queues.
- **NanoService (Activity):** atomic operation.
- **TaskWorkflow:** short-lived wrapper that calls exactly one `OrchestratorActivity.oneTask(...)`.
- **OrchestratorActivity:** interprets TaskSpec + Grounding and invokes the appropriate NanoService/HTTP/etc.

## Flow
1. External **Plan Interpreter** selects next TaskSpec (Idea world).
2. It starts a **TaskWorkflow** with `taskSpecId` and input payload.
3. Workflow calls **OrchestratorActivity.oneTask** once, returns result.
4. Interpreter updates state and starts the next TaskWorkflow (if any).

## Signals
Signals are only used for `update()` or entity lifecycle hooks (policy-driven). No workflow waits for signals.
