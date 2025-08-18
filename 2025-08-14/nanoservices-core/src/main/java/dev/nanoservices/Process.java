// Auto-generated for nanoServices core — Process
// Generated 2025-08-14T18:58:24.217300

package dev.nanoservices;

/** World-line: Process (ttl: subClassOf NanoService & Message; here extends NanoService). */
public abstract class Process extends NanoService {
    private String pid;            // nano:pid UniqueIdentifier (modeled as String)
    private Motivation targets;    // nano:targets (domain Process → Motivation)
    private Instruction runs;      // nano:runs    (domain Process → Instruction)

    protected Process() { super(); }
    protected Process(String version, String status, java.time.Instant time, String resource,
                      Persona reflects, Transformation projects, Projection throwsTo,
                      String uid, View allows, Perspective opens,
                      Contract serves, Policy respects,
                      Plan fulfills, Schedule works,
                      Task executes, Message sends,
                      String pid, Motivation targets, Instruction runs) {
        super(version, status, time, resource, reflects, projects, throwsTo, uid, allows, opens, serves, respects, fulfills, works, executes, sends);
        this.pid = pid;
        this.targets = targets;
        this.runs = runs;
    }

    public String pid() { return pid; }
    public void setPid(String pid) { this.pid = pid; }

    public Motivation targets() { return targets; }
    public void setTargets(Motivation m) { this.targets = m; }

    public Instruction runs() { return runs; }
    public void setRuns(Instruction i) { this.runs = i; }
}
