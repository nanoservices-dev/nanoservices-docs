// Auto-generated for nanoServices core — Task
// Generated 2025-08-14T18:58:24.216397

package dev.nanoservices;

/** Idea-line: Task (ttl: subClassOf Plan). */
public abstract class Task extends Plan {
    private NanoService defines; // nano:defines (domain Task → NanoService)
    private Message reports;     // nano:reports (domain Task → Message)

    protected Task() { super(); }
    protected Task(String version, String type, Double priority,
                   String purpose, Double entropy,
                   Manifestation assumes, Projection instantiates,
                   String language, String location, String checksum,
                   Port requires, Perspective concretizes,
                   System restricts, Policy justifies,
                   Service describes, Schedule schemes,
                   NanoService defines, Message reports) {
        super(version, type, priority, purpose, entropy, assumes, instantiates,
              language, location, checksum, requires, concretizes, restricts, justifies, describes, schemes);
        this.defines = defines;
        this.reports = reports;
    }

    public NanoService defines() { return defines; }
    public void setDefines(NanoService n) { this.defines = n; }

    public Message reports() { return reports; }
    public void setReports(Message m) { this.reports = m; }
}
