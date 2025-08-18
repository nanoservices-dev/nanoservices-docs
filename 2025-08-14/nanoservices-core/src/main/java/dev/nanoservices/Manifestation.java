// Auto-generated for nanoServices core — Manifestation
// Generated 2025-08-14T18:58:24.211367

package dev.nanoservices;

import java.time.Instant;

/** World-line: Manifestation (ttl: subClassOf World; also Persona in ttl, modeled via field). */
public abstract class Manifestation extends World {
    private Instant time;    // xsd:dateTimeStamp (ttl: nano:time)
    private String resource; // xsd:anyURI        (ttl: nano:resource)

    private Persona reflects;            // nano:reflects (domain Manifestation → Persona)
    private Transformation projects;     // nano:projects (domain Manifestation → Transformation)
    private Projection throwsTo;         // nano:throws   (domain Manifestation → Projection)

    protected Manifestation() { super(); }
    protected Manifestation(String version, String status,
                            Instant time, String resource,
                            Persona reflects, Transformation projects, Projection throwsTo) {
        super(version, status);
        this.time = time;
        this.resource = resource;
        this.reflects = reflects;
        this.projects = projects;
        this.throwsTo = throwsTo;
    }

    public Instant time() { return time; }
    public void setTime(Instant time) { this.time = time; }

    public String resource() { return resource; }
    public void setResource(String resource) { this.resource = resource; }

    public Persona reflects() { return reflects; }
    public void setReflects(Persona reflects) { this.reflects = reflects; }

    public Transformation projects() { return projects; }
    public void setProjects(Transformation projects) { this.projects = projects; }

    public Projection throwsTo() { return throwsTo; }
    public void setThrowsTo(Projection p) { this.throwsTo = p; }
}
