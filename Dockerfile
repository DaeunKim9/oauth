# build
FROM openjdk:17 AS build
RUN git clone https://github.com/6-people/findclothes.git
WORKDIR findclothes
RUN chmod 700 gradlew
RUN ./gradlew clean build
ARG JAR_FILE=./build/libs/*.jar
RUN cp %{JAR_FILE} /app.jar

# run
FROM openjdk:17
ARG JAR_FILE=./build/libs/*.jar
ADD --from=build /add.jar /add.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]