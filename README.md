# Alumni LinkedIn Profile Searcher

Spring Boot REST API with PostgreSQL persistence. Uses port **8081** to avoid conflicts with other apps on 8080.

## Setup
1. Ensure PostgreSQL is running and create database `alumni_db` if needed.
2. Open `src/main/resources/application.properties` and replace `change-me` with your local PostgreSQL password. Alternatively set `DB_PASSWORD` as an environment variable.
3. Use Java 21+ and Maven. From the project root run `mvn spring-boot:run` (or use Maven wrapper if available).

## Endpoints
- `GET http://localhost:8081/api/alumni/health`
- `GET http://localhost:8081/api/alumni/all`
- `POST http://localhost:8081/api/alumni/search`
- `POST http://localhost:8081/api/alumni/profiles` to save a test profile

Example search JSON:
```json
{"university":"BMS College of Engineering","designation":"Data Analyst","passoutYear":2024}
```

Example save-profile JSON:
```json
{"name":"Example Alumni","currentRole":"Data Analyst","university":"BMS College of Engineering","location":"Bengaluru","linkedinHeadline":"Data Analyst | SQL | Python","passoutYear":2024}
```

**Important:** `/api/alumni/search` currently searches profiles already stored in PostgreSQL. Live LinkedIn discovery through PhantomBuster is not activated in this ZIP because it requires your configured agent and authorized API credentials. The configuration keys are prepared in `application.properties`. Do not commit passwords or API keys to GitHub; follow LinkedIn and PhantomBuster terms.
