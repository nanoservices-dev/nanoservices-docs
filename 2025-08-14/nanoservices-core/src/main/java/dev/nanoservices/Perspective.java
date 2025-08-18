// Auto-generated for nanoServices core — Perspective
// Generated 2025-08-14T18:58:24.213469

package dev.nanoservices;

/** Bridge-line: Perspective (ttl: subClassOf Transformation; here continues bridge chain). */
public abstract class Perspective extends Projection {
    private Port secures;   // nano:secures (domain Perspective → Port)
    private View ranges;    // nano:ranges  (domain Perspective → View)

    protected Perspective() { super(); }
    protected Perspective(String version, World enriches, Manifestation manifests,
                          String contentType, String scope,
                          Manifestation simplifies, Transformation abstractsTo,
                          Port secures, View ranges) {
        super(version, enriches, manifests, contentType, scope, simplifies, abstractsTo);
        this.secures = secures;
        this.ranges = ranges;
    }

    public Port secures() { return secures; }
    public void setSecures(Port p) { this.secures = p; }

    public View ranges() { return ranges; }
    public void setRanges(View v) { this.ranges = v; }
}
