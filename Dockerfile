FROM adoptopenjdk:17-jdk-hotspot

WORKDIR /app

COPY target/TechnicTestApplication.jar TechnicTestApplication.jar

EXPOSE 8080

CMD ["java", "-jar", "TechnicTestApplication.jar"]
