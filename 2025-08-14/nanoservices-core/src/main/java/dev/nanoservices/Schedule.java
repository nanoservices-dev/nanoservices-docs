// Auto-generated for nanoServices core — Schedule
// Generated 2025-08-14T18:58:24.215329

package dev.nanoservices;

/** Bridge-line: Schedule (ttl: subClassOf Contract; here continues bridge chain). */
public abstract class Schedule extends Policy {
    private Service registers; // nano:registers (domain Schedule → Service)
    private Plan separates;    // nano:separates (domain Schedule → Plan)

    protected Schedule() { super(); }
    protected Schedule(String version, World enriches, Manifestation manifests,
                       String contentType, String scope,
                       Manifestation simplifies, Transformation abstractsTo,
                       Port secures, View ranges,
                       System rules, Contract mirrors,
                       Service registers, Plan separates) {
        super(version, enriches, manifests, contentType, scope, simplifies, abstractsTo, secures, ranges, rules, mirrors);
        this.registers = registers;
        this.separates = separates;
    }

    public Service registers() { return registers; }
    public void setRegisters(Service s) { this.registers = s; }

    public Plan separates() { return separates; }
    public void setSeparates(Plan p) { this.separates = p; }
}
