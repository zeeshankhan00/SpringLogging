FROM eclipse-temurin
ADD target/SpringLogging.jar /tmp/SpringLogging.jar
ENTRYPOINT [ "java", "-jar", "/tmp/SpringLogging.jar"]

