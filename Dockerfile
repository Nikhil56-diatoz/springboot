FROM openjdk:8-jdk-alpine
ADD pa.jar pa.jar
EXPOSE 8084
ENTRYPOINT ["java","-jar","pa.jar"]