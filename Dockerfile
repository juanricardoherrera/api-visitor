FROM openjdk:8
COPY target/api-visitors-1.0-SNAPSHOT.jar /app.jar
EXPOSE 7001/tcp 9001/tcp
ENTRYPOINT ["java", "-jar", "/app.jar"]