// Auto-generated for nanoServices core — Idea
// Generated 2025-08-14T18:58:24.210849

package dev.nanoservices;

/** Idea-line root (ttl: nano:Idea ⊑ Entity). */
public abstract class Idea extends Entity {
    private String type;     // xsd:string (ttl: nano:type)
    private Double priority; // nano:UnitInterval ~ [0,1] (ttl: nano:priority)

    protected Idea() { super(); }
    protected Idea(String version, String type, Double priority) {
        super(version);
        this.type = type;
        this.priority = priority;
    }

    public String type() { return type; }
    public void setType(String type) { this.type = type; }

    public Double priority() { return priority; }
    public void setPriority(Double priority) { this.priority = priority; }
}
