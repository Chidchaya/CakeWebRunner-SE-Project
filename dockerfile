FROM openjdk:11-jdk-slim
COPY target/cakeRunnerWeb-0.0.1-SNAPSHOT.jar restaurant.jar
EXPOSE 8090
ENTRYPOINT ["java","-jar","/restaurant.jar"]
