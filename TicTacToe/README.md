# Tic Tac Toe (TDD Project)

## Projektbeschreibung
Dieses Projekt ist eine Implementierung des klassischen Spiels "Tic Tac Toe" in Java. Es wurde unter strenger Anwendung von **Test Driven Development (TDD)** entwickelt, um hohe Code-Qualität und Testabdeckung zu gewährleisten.

## Lernziele
- Anwendung von TDD (Red-Green-Refactor).
- Aufbau einer CI/CD Pipeline (GitLab CI / Maven).
- Code Reviews und Pull Requests im Team.
- Mocking von Abhängigkeiten (Mockito).

## Tech Stack
- **Sprache**: Java 17
- **Build Tool**: Maven
- **Testing**: JUnit 5
- **Mocking**: Mockito
- **Coverage**: JaCoCo

## Ausführen
1. Projekt klonen.
2. Build ausführen:
   ```bash
   mvn clean install
   ```
3. Spiel starten:
   Führen Sie die `App.java` Klasse aus oder nutzen Sie Maven:
   ```bash
   mvn exec:java -Dexec.mainClass="ch.tbz.tictactoe.App"
   ```

## Reports
Die Test-Reports und Coverage-Reports werden automatisch durch die CI-Pipeline generiert und via GitLab Pages veröffentlicht.
Lokal finden Sie den Coverage Report unter: `target/site/jacoco/index.html`.
