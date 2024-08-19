FROM openjdk:17-slim as base
EXPOSE 8080
ADD target/hello-0.0.1-SNAPSHOT.jar hello-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "/hello-0.0.1-SNAPSHOT.jar"]