FROM openjdk:17
WORKDIR /app
COPY ./target/Dockerize-0.0.1-SNAPSHOT.jar /app
EXPOSE 9000
CMD ["java", "-jar", "Dockerize-0.0.1-SNAPSHOT.jar"]