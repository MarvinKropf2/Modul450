# Grundlagen Testing und Testing im Vorgehensmodell

## Aufgabe 1 
In der IT existiert eine Vielzahl an Testarten, um Software zu prüfen. Drei Varianten, die mir in Projekten häufig begegnen:

**1. Unit-Tests**

Mit Unit-Tests wird kontrolliert, ob einzelne Komponenten oder Funktionen isoliert wie vorgesehen laufen. Sie werden automatisiert und parallel zur Entwicklung ausgeführt.

**2. Integrationstests**

Integrationstests stellen sicher, dass die verschiedenen Bausteine einer Anwendung zusammen funktionieren, etwa die Anbindung zwischen Backend und Datenbank.

**3. End-to-End-Tests**

Hier wird das Gesamtsystem in realistischen Nutzungsszenarien durchgespielt, um zu prüfen, ob alle Anforderungen erfüllt sind und die Anwendung stabil bleibt.

## Aufgabe 2 

**- Softwarefehler (Bug)**

Eine App stürzt beim Öffnen eines bestimmten Menüpunkts ab, weil an einer Stelle im Code falsch gearbeitet wird. Dadurch können Nutzer die App nicht vollständig verwenden.

**- Softwaremangel**

Eine Online-Banking-App bietet keine Zwei-Faktor-Authentifizierung. Das steigert das Risiko unbefugter Zugriffe und schwächt die Sicherheit.

**- Beispiel für hohen Schaden bei Softwarefehler**

Eine Event-Ticket-App berechnet Tickets doppelt. Das führt zu finanziellen Schäden, Reklamationen und einem massiven Imageverlust.

## Aufgabe 3

Umsetzung der `calculatePrice`-Methode und eines kurzen Tests:

```java

public class PriceCalculator {
    
    public double calculatePrice(double baseprice, double specialprice, double extraprice, int extras, double discount) {
        double addon_discount;
        
        // Höhe des Zusatzrabatts ermitteln
        if (extras >= 5) {
            addon_discount = 15;
        } else if (extras >= 3) {
            addon_discount = 10;
        } else {
            addon_discount = 0;
        }
        
        // Bester (höherer) Rabatt gewinnt 
        if (discount > addon_discount) {
            addon_discount = discount;
        }
        
        // Endpreis berechnen
        double result = baseprice * (1 - discount / 100.0) 
                        + specialprice 
                        + extraprice * (1 - addon_discount / 100.0);
        
        return result;
    }
}

```

**Test:**

```java

public class PriceCalculatorTest {
    
    public static void main(String[] args) {
        boolean result = test_calculate_price();
        if (result) {
            System.out.println("Tests erfolgreich.");
        } else {
            System.out.println("Mindestens ein Test ist fehlgeschlagen.");
        }
    }
    
    public static boolean test_calculate_price() {
        PriceCalculator calculator = new PriceCalculator();
        boolean test_ok = true;
        
        double price1 = calculator.calculatePrice(1000, 200, 300, 4, 5); 
        double expectedPrice1 = 1000 * 0.95 + 200 + 300 * 0.9; // erwarteter Preis bei den gewählten Werten
        
        if (price1 != expectedPrice1) {
            System.out.println("Test 1 fehlgeschlagen. Erwarteter Preis: " + expectedPrice1 + ", Erhaltener Preis: " + price1);
            test_ok = false;
        }

        return test_ok;
    }
}

```

## Aufgabe 3 Bonus

Im Code steckt ein logischer Fehler bei der Rabattprüfung:

```java

if (extras >= 3) 
    addon_discount = 10;
else if (extras >= 5)
    addon_discount = 15;
else 
    addon_discount = 0;

```

Die Abfrage `extras >= 3` greift immer zuerst, sobald mindestens drei Extras gewählt werden. Der 15%-Rabatt für fünf oder mehr Zusatzausstattungen kommt dadurch nie zum Zug.
