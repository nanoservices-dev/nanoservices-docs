// Auto-generated for nanoServices core — Port
// Generated 2025-08-14T18:58:24.212199

package dev.nanoservices;

/** World-line: Port (ttl: subClassOf Manifestation & Projection; here we stay on World-line and link to Kante). */
public abstract class Port extends Manifestation {
    private String uid;      // nano:uid UniqueIdentifier (modeled as String)

    private View allows;         // nano:allows (domain Port → View)
    private Perspective opens;   // nano:opens  (domain Port → Perspective)

    protected Port() { super(); }
    protected Port(String version, String status, java.time.Instant time, String resource,
                   Persona reflects, Transformation projects, Projection throwsTo,
                   String uid, View allows, Perspective opens) {
        super(version, status, time, resource, reflects, projects, throwsTo);
        this.uid = uid;
        this.allows = allows;
        this.opens = opens;
    }

    public String uid() { return uid; }
    public void setUid(String uid) { this.uid = uid; }

    public View allows() { return allows; }
    public void setAllows(View v) { this.allows = v; }

    public Perspective opens() { return opens; }
    public void setOpens(Perspective p) { this.opens = p; }
}
