# nanoServices core (Java abstract model)

- Package: `dev.nanoservices`
- All classes are **abstract**.
- Data properties and object relations are aligned with `nanoServices-core.ttl` (attributes placed by `rdfs:domain`).
- Single inheritance follows your three lines:
  - **World** → Manifestation → Port → System → Service → NanoService → Process
  - **Idea** → Transformation → View → Contract → Plan → Task → Motivation
  - **Kante/Bridge** → Persona → Projection → Perspective → Policy → Schedule → Message → Instruction
- At pair boundaries, references are modeled via fields according to the TTL object properties
  (e.g., `Port.allows(View)`, `System.serves(Contract)`, `Message.belongsTo(NanoService)`, etc.).
- `Message` includes `public abstract Message process(Message input);` for your handler pattern.

Note: OWL multiple inheritance (e.g., `Port ⊑ Manifestation, Projection`) is represented
by **single inheritance + fields** in Java.