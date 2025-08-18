// Auto-generated for nanoServices core — Contract
// Generated 2025-08-14T18:58:24.214163

package dev.nanoservices;

/** Idea-line: Contract (ttl: subClassOf View). */
public abstract class Contract extends View {
    private System restricts; // nano:restricts (domain Contract → System)
    private Policy justifies; // nano:justifies (domain Contract → Policy)

    protected Contract() { super(); }
    protected Contract(String version, String type, Double priority,
                       String purpose, Double entropy,
                       Manifestation assumes, Projection instantiates,
                       String language, String location, String checksum,
                       Port requires, Perspective concretizes,
                       System restricts, Policy justifies) {
        super(version, type, priority, purpose, entropy, assumes, instantiates,
              language, location, checksum, requires, concretizes);
        this.restricts = restricts;
        this.justifies = justifies;
    }

    public System restricts() { return restricts; }
    public void setRestricts(System s) { this.restricts = s; }

    public Policy justifies() { return justifies; }
    public void setJustifies(Policy p) { this.justifies = p; }
}
