FROM openjdk:17
VOLUME /tmp
COPY target/pagination-0.0.1-SNAPSHOT.jar pagination.jar
ENTRYPOINT ["java", "-jar", "/pagination.jar"]
