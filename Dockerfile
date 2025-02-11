#FROM eclipse-temurin:17
FROM openjdk:17-jdk-alpine
RUN addgroup -S spring && adduser -S spring -G spring
USER spring:spring
ARG JAR_FILE=target/*.jar
COPY target target
RUN ls -al
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]