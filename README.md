# SpringBoot-MVC-Project

## Om applikationen Billionaires

En komplett webbapplikation skrivet i SpringBoot MVC ramverket som hanterar lagring av biljonärer i en H2 in-memory DB.
Applikationen är i huvudsak en RESTful applikation med olika REST endpoints webbtjänster som en klient
kan interagera med, med hjälp av t ex en API testverktyg som Postman för att få åtkomst till och manipulera data som finns lagrat på backend.

Själva projektet använder sig av Maven byggautomationsverktyg för hantering av de API:er som krävs för att kunna exevera applikationen.

Applikationen har även JUnit 5 inkluderat för att kunna bygga upp och köra olika enhetstester i applikationen som ett led i kvalitetssäkringsprocessen.


## Installation och exekvering av applikationen

För att kunna dra igång och köra applikationen så krävs det att man importerar projektet i sitt IDE genom att välja att importera Maven projekt där man pekar
på foldern med pom.xml-filen och sedan triggar igång importen.

Driver-klassen i applikationen är ExercisesApplication.java som kör igång projektet på port 8080.







