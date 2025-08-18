// Auto-generated for nanoServices core — Service
// Generated 2025-08-14T18:58:24.214828

package dev.nanoservices;

/** World-line: Service (ttl: subClassOf System & Policy; here extends System). */
public abstract class Service extends System {
    private Plan fulfills;       // nano:fulfills (domain Service → Plan)
    private Schedule works;      // nano:works    (domain Service → Schedule)

    protected Service() { super(); }
    protected Service(String version, String status, java.time.Instant time, String resource,
                      Persona reflects, Transformation projects, Projection throwsTo,
                      String uid, View allows, Perspective opens,
                      Contract serves, Policy respects,
                      Plan fulfills, Schedule works) {
        super(version, status, time, resource, reflects, projects, throwsTo, uid, allows, opens, serves, respects);
        this.fulfills = fulfills;
        this.works = works;
    }

    public Plan fulfills() { return fulfills; }
    public void setFulfills(Plan p) { this.fulfills = p; }

    public Schedule works() { return works; }
    public void setWorks(Schedule s) { this.works = s; }
}
