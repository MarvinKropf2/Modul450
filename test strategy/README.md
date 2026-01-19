# Teststrategie

## Aufgabe 1: Rabattregel-Testfälle

### 1.1 Abstrakte Testfälle

| Testfall-ID | Voraussetzung                             | Erwartetes Resultat |
|-------------|-------------------------------------------|---------------------|
| TF1         | Kaufpreis `< 15'000`                      | Kein Rabatt         |
| TF2         | Kaufpreis `>= 15'000` und `<= 20'000`     | 5% Rabatt           |
| TF3         | Kaufpreis `> 20'000` und `< 25'000`       | 7% Rabatt           |
| TF4         | Kaufpreis `>= 25'000`                     | 8.5% Rabatt         |

### 1.2 Konkrete Testfälle

| Testfall-ID | Kaufpreis (CHF) | Erwartetes Resultat |
|-------------|-----------------|---------------------|
| TF1         | 14'999          | Kein Rabatt         |
| TF2         | 15'000          | 5% Rabatt           |
| TF3         | 20'000          | 5% Rabatt           |
| TF4         | 20'001          | 7% Rabatt           |
| TF5         | 24'999          | 7% Rabatt           |
| TF6         | 25'000          | 8.5% Rabatt         |

## Aufgabe 2: Black-Box-Tests für eine Autovermietung

### 2.1 Funktionale Black-Box-Tests

| ID  | Beschreibung                                                    | Erwartetes Resultat                                      | Effektives Resultat       | Status       | Mögliche Ursache                |
|-----|-----------------------------------------------------------------|----------------------------------------------------------|---------------------------|--------------|---------------------------------|
| 1   | Login mit gültigen Benutzerdaten                                | Benutzer wird angemeldet                                 | Login erfolgreich         | Erfolgreich  | -                               |
| 2   | Suche nach einem Fahrzeug mit gültigen Parametern               | Liste mit verfügbaren Fahrzeugen                         | Fahrzeuge werden angezeigt| Erfolgreich  | -                               |
| 3   | Reservierung eines Fahrzeuges mit gültigen Daten                | Reservierung wird erstellt                               | Reservierung erfolgreich  | Erfolgreich  | -                               |
| 4   | Stornierung einer bestehenden Reservierung                      | Reservierung wird gelöscht                               | Stornierung schlägt fehl  | Fehler       | API-Aufruf nicht erfolgreich    |
| 5   | Anzeige der Rechnung nach Abschluss einer Fahrzeugvermietung    | Korrekte Rechnung erscheint                              | Fehlerhafte Rechnung      | Fehler       | Logikfehler in der Berechnung   |

## Aufgabe 3: Banksoftware-Tests

### 3.1 Denkbare **Black-Box** Testfälle

Die Testideen orientieren sich an Benutzeraktionen; der Code selbst bleibt eine Black Box.

Bei der Eingabe ist nicht ersichtlich, dass neben Menübuchstaben auch Zahlen akzeptiert werden. Eine klarere Anweisung im Menü würde hier helfen.

**Kontenerstellung**
- Konto mit gültigem Namen, Währung und Startguthaben eröffnen.
- Fehlerszenarien prüfen (leere Namen, ungültige Währungen).

**Wechselkursabfrage**
- Wechselkurs zwischen zwei erlaubten Währungen abfragen.
- Nicht unterstützte Währungen oder fehlerhafte Eingaben testen.

**Benutzerinteraktion**
- Menüführung durchspielen und Reaktionen je Option prüfen.
- Ungültige Eingaben provozieren (nicht vorgesehene Buchstaben oder Zeichen).

---

### 3.2 Denkbare **White-Box** Testfälle

**`Account`-Klasse**
- `withdraw()` und `deposit()` auf korrekte Berechnung testen.
- `pseudoDeleteAccount()` prüfen, ob Felder sauber zurückgesetzt werden.

**`Bank`-Klasse**
- `createAccount()` und `deleteAccount()` kontrollieren, ob Konten hinzugefügt bzw. entfernt werden.
- `getAccount(int nr)` testen, ob Konten per ID gefunden werden.

**`Counter`-Klasse**
- `chooseAccount()` nutzen und sicherstellen, dass Benutzereingaben richtig verarbeitet werden.
- `transferAmount()` auf korrekte Umrechnungen mit Wechselkursen testen.

**`ExchangeRateOkhttp`**
- `getExchangeRate()` verifizieren, dass die API-Abfrage funktioniert.
- Fehlerfälle wie ungültige Antworten oder Netzwerkprobleme simulieren.

---

#### Code-Verbesserungen und Best Practices

**Fehlerbehandlung**
- `System.out.println` durch ein einheitliches Logging ersetzen.
- Robustere Fehlerbehandlung einbauen, besonders bei der API-Abfrage in `ExchangeRateOkhttp`.

**Modularisierung**
- Lange Methoden in kleinere, lesbare Bausteine teilen, z. B. in der `Counter`-Klasse.

**API-Key-Schutz**
- Den API-Key in `ExchangeRateOkhttp` nicht hart codieren, sondern über Umgebungsvariablen oder eine sichere Konfiguration laden.
