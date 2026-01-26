# Testkonzept (vertieft)

Vertieftes Testkonzept angelehnt an IEEE 829 mit pragmatischem Fokus für Softwareprojekte.

## 1. Zweck und Scope
- Ziel: Risiken früh erkennen, Qualität transparent machen.
- Gültig für: aktuelle Release-Linie (Scope klar abgrenzen), inkl. funktionale und relevante nicht-funktionale Aspekte.
- Out of Scope: explizit nennen (z. B. Lasttests, wenn nicht vorgesehen).

## 2. Hintergrund
- Kurze Beschreibung der Applikation und Haupt-Use-Cases.
- Abhängigkeiten (z. B. externe APIs, Datenbanken, Services).

## 3. Test Items
- Liste der zu prüfenden Komponenten/Module (inkl. Version/Branch).
- Big Picture/Architektur-Skizze referenzieren, damit klar ist, was enthalten ist.

## 4. Features to be tested
- Funktionale Features je Item (z. B. Auth, Payment, Reporting).
- Relevante nicht-funktionale Anforderungen (z. B. Sicherheit, Logging, Recovery).

## 5. Features not to be tested
- Was wird bewusst ausgelassen (z. B. Performance, selten genutzte Legacy-Flows).
- Begründung festhalten, damit Risiken sichtbar bleiben.

## 6. Approach
- Teststufen: Unit (Dev), Integration, System/E2E, ggf. UAT/Exploratives Testen.
- Methoden: TDD/BDD, Äquivalenzklassen, Grenzwertanalyse, Entscheidungsbäume, Fehlerkataloge.
- Datenstrategie: Factory/Builder, anonymisierte Produktionsdaten, Mocks/Stubs/Fakes.
- Automation: Wo automatisiert, wo manuell und warum.

## 7. Pass/Fail-Kriterien
- Erfolg: definierte Akzeptanzkriterien erfüllt, keine Blocker/Kritisch offen.
- Misserfolg: Blocker oder Kritisch offen, oder Mindestabdeckung/Akzeptanzkriterien nicht erreicht.
- Defektklassen (Beispiel): Gering, Mittel, Kritisch; klare Beispiele pro Klasse.

## 8. Test Deliverables
- Testkonzept/Testplan, Testfälle (skriptet), Explorationsnotizen/Charters.
- Automations-Repo/CI-Jobs, Testdaten-Beschreibung, Testrapporte/Defektlisten.

## 9. Testing Tasks und Stufen
- Aufgaben pro Stufe (Design, Implementierung, Review, Ausführung, Reporting).
- Definition of Ready/Done für Testfälle und Automationsskripte.

## 10. Environment & Tooling
- Testumgebungen (HW/SW), Versionen, Basisdaten, Reset-Strategie.
- Tools: z. B. Postman/Newman, Cypress/Playwright, JUnit, Mock-Server, Monitoring/Logging.

## 11. Schedule
- Geplanter Zeitverlauf je Stufe (Milestones, Cutoff-Dates).
- Einbindung in CI/CD (Gate-Kriterien pro Pipeline-Stufe).

## 12. Rollen & Verantwortlichkeiten
- Wer schreibt/reviewt Testfälle?
- Wer betreibt die Umgebung?
- Eskalationspfade bei Blockern.

## 13. Risiken & Mitigation
- Beispiele: instabile Umgebung, fehlende Testdaten, enge Deadlines.
- Gegenmaßnahmen und Eigentümer pro Risiko.

## 14. Metriken & Reporting
- Abdeckung (funktional, Risiko-basiert), Testfortschritt, Defekt-Trends, MTTR.
- Reporting-Frequenz und -Form (Dashboard, Daily/Weekly).

## 15. Traceability
- Anforderungen → Testfälle → Automationsläufe → Defekte.
- Wie Nachverfolgbarkeit gepflegt wird (Tickets, Tags, IDs).

## 16. Abnahmen
- Wer gibt Testkonzept frei?
- Abnahmekriterien für Go/No-Go (z. B. keine kritischen Defekte offen, Mindestabdeckung erreicht).
