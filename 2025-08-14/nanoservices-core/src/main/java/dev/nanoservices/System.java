// Auto-generated for nanoServices core — System
// Generated 2025-08-14T18:58:24.213901

package dev.nanoservices;

/** World-line: System (ttl: subClassOf Port & Perspective; here extends Port). */
public abstract class System extends Port {
    private Contract serves;  // nano:serves (domain System → Contract)
    private Policy respects;  // nano:respects (domain System → Policy)

    protected System() { super(); }
    protected System(String version, String status, java.time.Instant time, String resource,
                     Persona reflects, Transformation projects, Projection throwsTo,
                     String uid, View allows, Perspective opens,
                     Contract serves, Policy respects) {
        super(version, status, time, resource, reflects, projects, throwsTo, uid, allows, opens);
        this.serves = serves;
        this.respects = respects;
    }

    public Contract serves() { return serves; }
    public void setServes(Contract c) { this.serves = c; }

    public Policy respects() { return respects; }
    public void setRespects(Policy p) { this.respects = p; }
}
