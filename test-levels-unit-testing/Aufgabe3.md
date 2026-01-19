# Aufgabe 3: Junit Tests

## Aufgabe 1 Maven Simpler Rechner
Hier wird eine `Calculator`-Klasse mit den Grundrechenarten (Addition, Subtraktion, Multiplikation, Division) gebaut. Danach folgen Unit-Tests mit JUnit 5, die Methoden werden sowohl in der IDE als auch via Maven auf der Kommandozeile ausgeführt.

## Aufgabe 2: JUnit Zusammenfassung

### 1. Assertions
- Dienen zur Prüfung, ob die Ergebnisse stimmen.
- Beispiel: `assertEquals(expected, actual)` vergleicht Erwartung und tatsächlichen Wert.

### 2. Annotations
- Steuern, wann und wie Tests laufen.
- Beispiele: 
  - `@Test` markiert eine Methode als Test.
  - `@BeforeEach` führt vorbereitenden Code vor jedem Test aus.

### 3. Beispiel: Test für die `add`-Methode des Rechners
```java
@Test
void testAdd() {
    Calculator calculator = new Calculator();
    assertEquals(5, calculator.add(2, 3));
}

```

## Aufgabe 3 Übersicht
Die Bank-Simulation ist eine Java-Anwendung, die Konten und Bankaktionen verwaltet. Das Projekt wird als Maven-Projekt geführt.

---

## Hauptbestandteile

### Bank
- Zentrale Einstiegsklasse.
- Verwalten von Konten, u. a. über:
  - `createPromoYouthSavingsAccount()`
  - `createSalaryAccount(double salary)`

### **Konten**
- **SavingsAccount:** Standard-Sparkonto.
- **SalaryAccount:** Konto für Gehaltszahlungen.
- **PromoYouthSavingsAccount:** Jugendkonto mit Spezialkonditionen.

### Comparatoren
- Sortieren Konten anhand des Kontostands.

### Hilfsmethoden
- `BankUtils` liefert Hilfsfunktionen für Berechnungen und Datenaufbereitung.

---

## Ablauf
1. Eine Bank-Instanz erzeugen.
2. Konten anlegen.
3. Aktionen wie Ein- und Auszahlungen durchführen.
4. Konten sortieren oder Daten abrufen.

---

## Fazit
Die Simulation ist modular aufgebaut und lässt sich unkompliziert erweitern; sie bietet ein Fundament für grundlegende Bankfunktionen.
