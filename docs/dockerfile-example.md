# Dockerfile Example

This is an example of a `Dockerfile` that compiles the code into a `.jar` file and
configures the container to run the application in `production mode`. However, I do not
recommend using it as-is. It would be better to adapt it to your project's specific
requirements and configurations. You can use it as a starting point for creating your own
`Production Docker Image`.

```Dockerfile
# Stage 1: Build
FROM maven:3.9.9-amazoncorretto-17 AS build

WORKDIR /app

COPY pom.xml .
COPY src/ ./src

RUN mvn clean package -DskipTests

# Stage 2: Run
FROM amazoncorretto:17-alpine

WORKDIR /app

COPY --from=build /app/target/*.jar app.jar

RUN addgroup -S appuser && adduser -S appuser -G appuser
USER appuser

ENTRYPOINT ["java", "-jar", "app.jar"]

EXPOSE 8080
```
