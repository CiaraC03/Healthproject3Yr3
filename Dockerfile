FROM openjdk:17

WORKDIR /app

COPY target/HealthProject3-0.0.1-SNAPSHOT.jar /app

EXPOSE 8082

CMD ["java", "-jar", "HealthProject3-0.0.1-SNAPSHOT.jar"]