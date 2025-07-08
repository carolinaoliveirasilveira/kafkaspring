FROM openjdk:17
VOLUME /tmp
WORKDIR /app
COPY target/kafkaspring-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]
