// Auto-generated for nanoServices core — Motivation
// Generated 2025-08-14T18:58:24.218015

package dev.nanoservices;

/** Idea-line: Motivation (ttl: subClassOf Task). */
public abstract class Motivation extends Task {
    private Process triggers; // nano:triggers (domain Motivation → Process)

    protected Motivation() { super(); }
    protected Motivation(String version, String type, Double priority,
                         String purpose, Double entropy,
                         Manifestation assumes, Projection instantiates,
                         String language, String location, String checksum,
                         Port requires, Perspective concretizes,
                         System restricts, Policy justifies,
                         Service describes, Schedule schemes,
                         NanoService defines, Message reports,
                         Process triggers) {
        super(version, type, priority, purpose, entropy, assumes, instantiates,
              language, location, checksum, requires, concretizes, restricts, justifies, describes, schemes,
              defines, reports);
        this.triggers = triggers;
    }

    public Process triggers() { return triggers; }
    public void setTriggers(Process p) { this.triggers = p; }
}
