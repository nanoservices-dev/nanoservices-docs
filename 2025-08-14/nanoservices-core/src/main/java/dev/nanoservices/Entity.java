// Auto-generated for nanoServices core — Entity
// Generated 2025-08-14T18:58:24.210069

package dev.nanoservices;

/** Base class (ttl: nano:Entity). */
public abstract class Entity {
    private String version; // xsd:string (ttl: nano:version)

    protected Entity() {}
    protected Entity(String version) {
        this.version = version;
    }

    public String version() { return version; }
    public void setVersion(String version) { this.version = version; }
}
