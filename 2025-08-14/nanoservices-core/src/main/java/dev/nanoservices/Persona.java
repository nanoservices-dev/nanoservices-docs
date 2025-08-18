// Auto-generated for nanoServices core — Persona
// Generated 2025-08-14T18:58:24.211131

package dev.nanoservices;

/** Bridge-line: Persona (ttl: nano:Persona ⊑ Entity). */
public abstract class Persona extends Entity {
    private World enriches;             // nano:enriches (domain Persona → World)
    private Manifestation manifests;    // nano:manifests (domain Persona → Manifestation)

    protected Persona() { super(); }
    protected Persona(String version, World enriches, Manifestation manifests) {
        super(version);
        this.enriches = enriches;
        this.manifests = manifests;
    }

    public World enriches() { return enriches; }
    public void setEnriches(World w) { this.enriches = w; }

    public Manifestation manifests() { return manifests; }
    public void setManifests(Manifestation m) { this.manifests = m; }
}
