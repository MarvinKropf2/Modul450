# Reflexion: TDD & Code Reviews

## Test Driven Development (TDD)
### Ablauf
Wir haben den **Red-Green-Refactor** Zyklus angewendet:
1.  **Red**: Zuerst wurde z.B. `testCheckWin()` geschrieben. Da die Methode `checkWin` noch leer oder nicht existent war, schlug der Test fehl.
2.  **Green**: Die minimal nötige Logik wurde implementiert (z.B. Prüfung der Zeilen/Spalten).
3.  **Refactor**: Der Code wurde bereinigt (Doublizierter Code bei der Prüfung entfernt).

### Erkenntnisse
- **Vorteile**: Man denkt vor dem Coden genau über die API und Edge-Cases nach. Das Debugging entfällt fast komplett, da man sofort Feedback hat.
- **Herausforderungen**: Es fühlt sich anfangs langsamer an. Manchmal ist man verleitet, "schnell mal" weiter zu coden ohne Test.

## Code Reviews
Durch Pull Requests (PRs) haben wir sichergestellt, dass 4-Augen-Prinzip gilt.
**Learnings**:
- Kleine PRs sind besser als riesige Features.
- Kommentare sollten konstruktiv sein ("Hast du an Edge Case X gedacht?" statt "Das ist falsch").
- Clean Code (Namensgebung, Methoden-Länge) wird durch Reviews effektiv durchgesetzt.

## Fazit
Die Kombination aus TDD und CI/CD gibt uns extreme Sicherheit. Wir können jederzeit refactorn, ohne Angst zu haben, etwas kaputt zu machen.
