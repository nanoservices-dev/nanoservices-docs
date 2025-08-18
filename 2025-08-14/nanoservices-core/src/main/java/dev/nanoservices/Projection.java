// Auto-generated for nanoServices core — Projection
// Generated 2025-08-14T18:58:24.211837

package dev.nanoservices;

/** Bridge-line: Projection (ttl: subClassOf Idea; here extends Persona-chain as requested). */
public abstract class Projection extends Persona {
    private String contentType; // xsd:string (ttl: nano:contentType)
    private String scope;       // xsd:string (ttl: nano:scope)

    private Manifestation simplifies;   // nano:simplifies (domain Projection → Manifestation)
    private Transformation abstractsTo; // nano:abstracts  (domain Projection → Transformation)

    protected Projection() { super(); }
    protected Projection(String version, World enriches, Manifestation manifests,
                         String contentType, String scope,
                         Manifestation simplifies, Transformation abstractsTo) {
        super(version, enriches, manifests);
        this.contentType = contentType;
        this.scope = scope;
        this.simplifies = simplifies;
        this.abstractsTo = abstractsTo;
    }

    public String contentType() { return contentType; }
    public void setContentType(String ct) { this.contentType = ct; }

    public String scope() { return scope; }
    public void setScope(String scope) { this.scope = scope; }

    public Manifestation simplifies() { return simplifies; }
    public void setSimplifies(Manifestation m) { this.simplifies = m; }

    public Transformation abstractsTo() { return abstractsTo; }
    public void setAbstractsTo(Transformation t) { this.abstractsTo = t; }
}
