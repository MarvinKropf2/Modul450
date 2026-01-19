## Übung 1

Für automatisierte Tests der REST-Schnittstelle setze ich auf **Postman**. Damit lassen sich Requests in Collections organisieren, Skripte für wiederholbare Checks hinterlegen und die Ausführung automatisieren. Zusätzlich habe ich einen schlanken **Newman-CLI-Workflow** vorbereitet, um die Postman-Collection in einer CI/CD-Pipeline laufen zu lassen.

So werden die Schnittstellen kontinuierlich überprüft und die API-Integration bleibt stabil. Als Alternative für Last- und Performancetests könnte auch **JMeter** eingesetzt werden.


## Übung 2 
Cypress-Tests (E2E) sind geplant, um die Anwendung im Browser-End-to-End durchzuspielen.

## Übung 3
### Testumgebung
- **Tool**: Postman
- **Backend-URL**: `http://localhost:8081/`
- **Endpoints getestet**:
    - `GET /students`
    - `POST /students`

## Testkonfiguration
- **Iterationsanzahl**: 100
- **Body für POST**:
  ```json
  {
    "id": 10,
    "name": "Max Muster",
    "email": "max.muster@example.com"
  }
  ```

## Bonus Aufgabe

## Feature-Beschreibung

### Frontend
- **Eingabefeld**: Nutzer-ID aufnehmen, die gelöscht werden soll.
- **Button**: "Delete" löst die Löschung aus.
- **Validierungen**:
  - ID muss größer als 0 sein.
  - Zeigt Bestätigung oder Fehlermeldung je nach Serverantwort.

### Backend
- **Endpoint**:
  - `DELETE /students/{id}`: Entfernt einen Nutzer anhand der ID.
- **Validierung**:
  - Prüft, ob die ID existiert.
  - Liefert eine Fehlermeldung, falls kein Eintrag gefunden wird.
