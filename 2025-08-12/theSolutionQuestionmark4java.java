interface Entity { String version(); }
interface World  extends Entity { String status(); }
interface Idea   extends Entity { String type(); }

interface Manifestation extends World { String resource(); }
interface Transformation extends Idea { String purpose(); }

interface Persona {
    World world();    // breit
    Idea  idea();     // breit
}

interface Projection extends Persona {
    @Override Manifestation world();       // kovariant
    @Override Transformation idea();       // kovariant
}

interface Port extends Projection { String contentType(); }
interface View extends Transformation { String selfDescription(); }

interface Perspective extends Projection {
    @Override Manifestation world();    // Manifestation is the return type in Projection
    @Override View idea();              // View <: Transformation → erlaubt
}

interface System extends Port {
    String uId();
    java.util.List<Manifestation> elements();
}

interface Service extends System { }
interface NanoService extends Service { }