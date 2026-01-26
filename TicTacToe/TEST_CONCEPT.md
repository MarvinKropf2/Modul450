# Test Konzept

## Teststrategie
Wir verfolgen eine **Pyramiden-Teststrategie** mit einem starken Fokus auf Unit-Tests, da die Logik (Gewinnbedingungen, Spielzüge) gut isolierbar ist.

### 1. Unit Tests (JUnit 5)
Diese Tests überprüfen einzelne Klassen isoliert.
- **BoardTest**: Testet alle Methoden von `Board` (Siegprüfung, Unentschieden, Feld belegen). Dies ist der Kern unserer Logik.
- **GameTest**: Testet den Spielablauf. Hier wird **Mockito** verwendet, um `Player` zu mocken. So können wir deterministisch ganze Spielverläufe simulieren, ohne auf User Input via Konsole angewiesen zu sein.

### 2. Mocking (Mockito)
Da `HumanPlayer` auf `Scanner` (User Input) angewiesen ist, wäre ein echten Integrationstest schwierig und langsam.
Wir mocken das `Player` Interface:
```java
when(playerX.makeMove(board)).thenReturn(new int[]{0,0});
```
So können wir testen: "Wenn Spieler X auf 0,0 setzt, passiert Y".

### 3. Code Coverage (JaCoCo)
Unser Ziel ist eine Code-Coverage von >80%.
Der Report wird bei jedem Build via Maven generiert (`mvn verify`) und in der Pipeline als Artefakt gespeichert.

## Manuelle Tests
Nur für die UI/UX (Konsolenausgabe, Fehleingaben) führen wir kurze manuelle Tests durch, um sicherzustellen, dass das Spiel für den Benutzer verständlich ist.
