// Auto-generated for nanoServices core — World
// Generated 2025-08-14T18:58:24.210475

package dev.nanoservices;

/** World-line root (ttl: nano:World ⊑ Entity). */
public abstract class World extends Entity {
    private String status; // xsd:string (ttl: nano:status)

    protected World() { super(); }
    protected World(String version, String status) {
        super(version);
        this.status = status;
    }

    public String status() { return status; }
    public void setStatus(String status) { this.status = status; }
}
