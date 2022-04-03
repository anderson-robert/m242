# M242 Morse Code

## Reflexionen
### Daniel di Benedetto
#### Was habe ich gelernt?
- Mbed Studio kennengelernt
- C++ Erste Grundlagen
- http request C++
- arbeiten mit IoTKit

#### Was verlief schlecht?
Bei der Cloud Anbindung hatten wir einige Schwierigkeiten mit der Zeit, da es länger dauerte als erwartet, da die approval bei Azure ziemlich lange ging. Keiner von uns hatte vorher mit C++ jemals etwas gemacht, was natürlich Schwierigkeiten aufbringt bei einem Projekt mit C++. Dort brauchte ich etwas Zeit, um es zu verstehen und zu wissen wie ich das mit der request machen muss. Mit Mbed Studio habe ich auch das erste Mal gearbeitet, weshalb ich auch dort manchmal mit der Importierung der Libraries Schwierigkeiten hatte. Es gibt auch recht wenig Dokumentation zu der Programmierung im Mbed Studio.

#### Was verlief gut?
Das Frontend für unser Projekt hatten wir sehr schnell fertig und ohne viel Komplikationen. Die Verbindung mit dem Backend und dem Frontend verlief ziemlich reibungslos und ohne viele Probleme. Die Zusammenarbeit im Team war ziemlich gut, da wir uns alle zusammen gut unterstützen konnten bei Problemen. Zudem haben wir alle einige neue Sachen gelernt, mit denen wir vorher nicht in Berührung kamen.

### Livio Ambrogini
#### Was habe ich gelernt?
- Mbed Studios kennengelernt
- http Request mit Typescript Fetch
- C++ Einführung

#### Was verlief gut?
Die Cloud-Anbindung dauerte leider länger als wir geplant haben, im Frontend hatte ich Schwierigkeiten mit den Requests und das Programmieren mit C++ hat sich schwieriger herausgestellt als wir geahnt hätten.

#### Was verlief schlecht?
Auch wenn diese LB schwieriger im Vergleich zu anderen war, habe ich viel gelernt und konnte mir einiges neues Wissen aneignen.

### Robert Anderson
#### Was habe ich gelernt?
-	Mbed Studio aufsetzen
-	VM in Azure erstellen und verwalten
-	Mit einem Mikrokontroller arbeiten
-	http requests mit c++

#### Was verlief gut?
Wir haben uns für einen komplizierteren Aufgabe als wir für den Projekt machen mussten. Dies hat sich einige Schwierigkeiten mitgebracht. Ausserdem habe ich noch nie einen Cloud Service wie Azure oder AWS benutzt. Es dauerte länger als wir erwartet haben, bis mein Konto bei Azure validiert wurde, was unsere Arbeit mit dem VM um eine Woche verspätet hat. Wir mussten auch deswegen unser vorheriger Plan mit dem Morse Code Umwandlung dieses Mal rauslassen aus Zeitgründen.

#### Was verlief schlecht?
Wir hatten ziemlich schnell unseres Front- und Backend fertig. Die Verbindung davon lief auch praktisch ohne Fehler. Wir haben auch gut als Team gearbeitet, was unsere lernen von die vielen neue Sachen und Technologien geholfen hat.

## Requirements

Folgende Schritte sind notwendig um die Applikation zu erstellen und zu starten: 
1. Stellen Sie sicher, dass OpenJDK 11 oder höher installiert und JAVA_HOME korrekt gesetzt ist.  
2. Installieren Sie (falls noch nicht vorhanden) Apache Maven 3.8.1 oder höher
3. Installieren Sie Quarkus CLI
4. Wechseln Sie auf der Kommandozeile in den Ordner dieser Applikation. 
`cd m242/`
4. Starten Sie die Applikation mit 
```shell script
quarkus dev
```

Datenimport unter `/src/main/resources/import.sql`

Folgende Dienste stehen während der Ausführung im Profil dev zur Verfügung:

Swagger API: http://localhost:8080/q/swagger-ui/

H2 Console: http://localhost:8080/h2/ 
Datenquelle: jdbc:h2:mem:morse
Benutzername: morse
Passwort: morse
