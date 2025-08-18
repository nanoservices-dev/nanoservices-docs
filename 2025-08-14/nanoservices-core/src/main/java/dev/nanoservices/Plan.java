// Auto-generated for nanoServices core — Plan
// Generated 2025-08-14T18:58:24.215087

package dev.nanoservices;

/** Idea-line: Plan (ttl: subClassOf Contract). */
public abstract class Plan extends Contract {
    private Service describes;   // nano:describes (domain Plan → Service)
    private Schedule schemes;    // nano:schemes   (domain Plan → Schedule)

    protected Plan() { super(); }
    protected Plan(String version, String type, Double priority,
                   String purpose, Double entropy,
                   Manifestation assumes, Projection instantiates,
                   String language, String location, String checksum,
                   Port requires, Perspective concretizes,
                   System restricts, Policy justifies,
                   Service describes, Schedule schemes) {
        super(version, type, priority, purpose, entropy, assumes, instantiates,
              language, location, checksum, requires, concretizes, restricts, justifies);
        this.describes = describes;
        this.schemes = schemes;
    }

    public Service describes() { return describes; }
    public void setDescribes(Service s) { this.describes = s; }

    public Schedule schemes() { return schemes; }
    public void setSchemes(Schedule s) { this.schemes = s; }
}
