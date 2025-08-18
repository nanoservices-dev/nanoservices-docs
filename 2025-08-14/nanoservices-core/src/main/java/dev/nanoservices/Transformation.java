// Auto-generated for nanoServices core — Transformation
// Generated 2025-08-14T18:58:24.211542

package dev.nanoservices;

/** Idea-line: Transformation (ttl: subClassOf Idea). */
public abstract class Transformation extends Idea {
    private String purpose;  // xsd:string (ttl: nano:purpose)
    private Double entropy;  // nano:UnitInterval (ttl: nano:entropy)

    private Manifestation assumes;  // nano:assumes (domain Transformation → Manifestation)
    private Projection instantiates; // nano:instantiates (domain Transformation → Projection)

    protected Transformation() { super(); }
    protected Transformation(String version, String type, Double priority,
                             String purpose, Double entropy,
                             Manifestation assumes, Projection instantiates) {
        super(version, type, priority);
        this.purpose = purpose;
        this.entropy = entropy;
        this.assumes = assumes;
        this.instantiates = instantiates;
    }

    public String purpose() { return purpose; }
    public void setPurpose(String purpose) { this.purpose = purpose; }

    public Double entropy() { return entropy; }
    public void setEntropy(Double entropy) { this.entropy = entropy; }

    public Manifestation assumes() { return assumes; }
    public void setAssumes(Manifestation m) { this.assumes = m; }

    public Projection instantiates() { return instantiates; }
    public void setInstantiates(Projection p) { this.instantiates = p; }
}
