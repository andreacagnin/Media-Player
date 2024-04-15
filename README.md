# Media Player

## Descrizione del progetto
Il progetto consiste nella riproduzione di video/filmati su un client, il quale si connette ad un server con il relativo database, la comunicazione tra client-server viene effettuata con l'uso della libreria JAXB.

### Descrizione dettagliata
All'avvio dell'applicazione del client, viene spedita una richiesta al server per visualizzare tutti i film presenti nel database 

----- IMG -----

Successivamente il client scegliera' il film che desidera guardare, a questo punto viene inoltrata un altra richiesta al server, la cui risposta sara' una completa descrizione del film

----- IMG -----

Ora il client puo' gustarsi il suo film!

## Architettura del progetto
### Descrizione dell'architettura
Il progetto si basa sull'architettura client/server:
- **Client**: Il client rappresenta l'applicazione che interagisce con l'utente e gestisce la riproduzione video grazie all'uso della libreria javafx-web
- **Server**: Il server gestisce le richieste del client, interagendo con il database
- **Database**: Il database contiene le tabelle con i film, i registi, e tutti i paesi

### Componenti chiave
- **HttpHandler**: Classe per gestire le richieste client -> server
- **JAXB methods**: I metodi utilizzati sono il marshaller() per la trasformazioni dei dati JAVA -> XML, e l'unmarshaller() per traformare i dati XML -> JAVA

### Interazione tra i componenti
Abbiamo utilizzato le librerie di <a href="https://openjfx.io/">JavaFX</a> per l'interazione dei componenti grafici e il modulo JavaFX-WEB per la riproduzione dei video

#### Diagramma riproduzione video
<img src="https://i.ibb.co/X3vFSZz/Immagine-2024-04-09-181132.png" alt="Immagine-2024-04-09-181132" border="0">

## Web service

### Scopo del web service
Lo scopo principale del nostro web service e' di rispondere alle richieste del client inviando i dati richiesti

### Parametri di input
L'unico parametro di input richiesto e' quello del id del film. Viene richiesto dal server per l'identificazione del singolo film, in modo da consentire l'invio dati del film richiesto. Il parametro di input viene inviato tramite il methodo GET

### Esempi di richieste
Richiesta e risposta degli header dei film

----- IMG -----

<img src="https://i.ibb.co/ZJ4764n/films-request.png" alt="films-request" border="0">

Richiesta e risposta di un singolo film

----- IMG -----

<img src="https://i.ibb.co/37mWtyY/film-request.png" alt="film-request" border="0">

## Implementazione

### Linguaggi di programmazione e librerie utilizzate
**Client:** 
- Java 21.0.2
- JavaFX
- Maven
- JAXB
- Dotenv

**Server:**
- PHP

**Database:**
- MySQL

## Deployment e gestione progetto
Per il deployment abbiamo usato GitHub, abbiamo suddiviso il progetto in varie branches per lavorare in parallelo tra server e client:
- main 
- app-desktop (client)
- web-service (server)
- database
- documentazione

## Conclusioni

## Appendici

### Riferimenti e link
- <a href="https://it.wikipedia.org/wiki/Java_Architecture_for_XML_Binding">JAXB</a>
- <a href="https://openjfx.io/javadoc/11/javafx.web/module-summary.html">JavaFX-WEB</a>
- <a href="https://github.com/cdimascio/dotenv-java">Java DotEnv</a>