// Auto-generated for nanoServices core — Message
// Generated 2025-08-14T18:58:24.216934

package dev.nanoservices;

/** Bridge-line: Message (paired with NanoService/Task). */
public abstract class Message extends Schedule {
    private NanoService belongsTo; // nano:belongsTo (domain Message → NanoService)
    private Task represents;       // nano:represents (domain Message → Task)

    protected Message() { super(); }
    protected Message(String version, World enriches, Manifestation manifests,
                      String contentType, String scope,
                      Manifestation simplifies, Transformation abstractsTo,
                      Port secures, View ranges,
                      System rules, Contract mirrors,
                      Service registers, Plan separates,
                      NanoService belongsTo, Task represents) {
        super(version, enriches, manifests, contentType, scope, simplifies, abstractsTo, secures, ranges, rules, mirrors, registers, separates);
        this.belongsTo = belongsTo;
        this.represents = represents;
    }

    public NanoService belongsTo() { return belongsTo; }
    public void setBelongsTo(NanoService n) { this.belongsTo = n; }

    public Task represents() { return represents; }
    public void setRepresents(Task t) { this.represents = t; }

    /** For concrete handlers to implement. */
    public abstract Message process(Message input);
}
