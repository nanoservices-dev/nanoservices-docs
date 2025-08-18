// Auto-generated for nanoServices core — Instruction
// Generated 2025-08-14T18:58:24.218626

package dev.nanoservices;

/** Bridge-line tail: Instruction (ttl: subClassOf Task; paired with Process). */
public abstract class Instruction extends Message {
    private Process needs; // nano:needs (domain Instruction → Process)

    protected Instruction() { super(); }
    protected Instruction(String version, World enriches, Manifestation manifests,
                          String contentType, String scope,
                          Manifestation simplifies, Transformation abstractsTo,
                          Port secures, View ranges,
                          System rules, Contract mirrors,
                          Service registers, Plan separates,
                          NanoService belongsTo, Task represents,
                          Process needs) {
        super(version, enriches, manifests, contentType, scope, simplifies, abstractsTo, secures, ranges, rules, mirrors, registers, separates, belongsTo, represents);
        this.needs = needs;
    }

    public Process needs() { return needs; }
    public void setNeeds(Process p) { this.needs = p; }
}
