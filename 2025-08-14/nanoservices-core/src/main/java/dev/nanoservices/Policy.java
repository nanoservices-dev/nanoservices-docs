// Auto-generated for nanoServices core — Policy
// Generated 2025-08-14T18:58:24.214527

package dev.nanoservices;

/** Bridge-line: Policy (ttl: subClassOf View; here continues bridge chain). */
public abstract class Policy extends Perspective {
    private System rules;     // nano:rules (domain Policy → System)
    private Contract mirrors; // nano:mirrors (domain Policy → Contract)

    protected Policy() { super(); }
    protected Policy(String version, World enriches, Manifestation manifests,
                     String contentType, String scope,
                     Manifestation simplifies, Transformation abstractsTo,
                     Port secures, View ranges,
                     System rules, Contract mirrors) {
        super(version, enriches, manifests, contentType, scope, simplifies, abstractsTo, secures, ranges);
        this.rules = rules;
        this.mirrors = mirrors;
    }

    public System rules() { return rules; }
    public void setRules(System s) { this.rules = s; }

    public Contract mirrors() { return mirrors; }
    public void setMirrors(Contract c) { this.mirrors = c; }
}
