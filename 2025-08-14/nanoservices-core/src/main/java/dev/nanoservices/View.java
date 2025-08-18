// Auto-generated for nanoServices core — View
// Generated 2025-08-14T18:58:24.212937

package dev.nanoservices;

/** Idea-line: View (ttl: subClassOf Transformation). */
public abstract class View extends Transformation {
    private String language; // xsd:language (ttl: nano:language, BCP-47)
    private String location; // xsd:string
    private String checksum; // xsd:token

    private Port requires;          // nano:requires (domain View → Port)
    private Perspective concretizes; // nano:concretizes (domain View → Perspective)

    protected View() { super(); }
    protected View(String version, String type, Double priority,
                   String purpose, Double entropy,
                   Manifestation assumes, Projection instantiates,
                   String language, String location, String checksum,
                   Port requires, Perspective concretizes) {
        super(version, type, priority, purpose, entropy, assumes, instantiates);
        this.language = language;
        this.location = location;
        this.checksum = checksum;
        this.requires = requires;
        this.concretizes = concretizes;
    }

    public String language() { return language; }
    public void setLanguage(String language) { this.language = language; }

    public String location() { return location; }
    public void setLocation(String location) { this.location = location; }

    public String checksum() { return checksum; }
    public void setChecksum(String checksum) { this.checksum = checksum; }

    public Port requires() { return requires; }
    public void setRequires(Port p) { this.requires = p; }

    public Perspective concretizes() { return concretizes; }
    public void setConcretizes(Perspective p) { this.concretizes = p; }
}
