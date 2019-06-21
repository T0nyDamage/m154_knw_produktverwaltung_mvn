FROM openjdk:8u191-jdk-alpine3.9

EXPOSE 7171

WORKDIR /usr/local/bin

COPY /target/mvn_m154-crm-business-0.0.1-SNAPSHOT-shaded.jar docker.jar

CMD ["java", "-jar", "docker.jar"]