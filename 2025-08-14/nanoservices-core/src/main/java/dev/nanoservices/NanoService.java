// Auto-generated for nanoServices core — NanoService
// Generated 2025-08-14T18:58:24.215733

package dev.nanoservices;

/** World-line: NanoService (ttl: subClassOf Service & Schedule; here extends Service). */
public abstract class NanoService extends Service {
    private Task executes;    // nano:executes (domain NanoService → Task)
    private Message sends;    // nano:sends    (domain NanoService → Message)

    protected NanoService() { super(); }
    protected NanoService(String version, String status, java.time.Instant time, String resource,
                          Persona reflects, Transformation projects, Projection throwsTo,
                          String uid, View allows, Perspective opens,
                          Contract serves, Policy respects,
                          Plan fulfills, Schedule works,
                          Task executes, Message sends) {
        super(version, status, time, resource, reflects, projects, throwsTo, uid, allows, opens, serves, respects, fulfills, works);
        this.executes = executes;
        this.sends = sends;
    }

    public Task executes() { return executes; }
    public void setExecutes(Task t) { this.executes = t; }

    public Message sends() { return sends; }
    public void setSends(Message m) { this.sends = m; }
}
