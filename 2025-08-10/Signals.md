# Signal & Event Types (suggestion)
- Life.Update — generic state update (payload: partial state)
- Life.Event.<Domain> — domain events (e.g., Life.Event.VisitBooked)
- Life.Timer.Due — timer due (corrId = timer-id)
- Life.Admin.Suspend / Life.Admin.Resume — administrative lifecycle ops

SignalWithStart:
- If workflow (entity-id) exists → signal
- Else → start + signal (idempotent via correlation id)
