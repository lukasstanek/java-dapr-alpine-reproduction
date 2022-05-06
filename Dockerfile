FROM openjdk:17-alpine
#FROM openjdk:17-slim-buster

COPY build/libs/shadow-1.0-SNAPSHOT-all.jar /app/app.jar

CMD ["java", "-jar", "/app/app.jar"]

