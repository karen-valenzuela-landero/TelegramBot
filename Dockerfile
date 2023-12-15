FROM amazoncorretto:17-alpine-jdk
MAINTAINER KVL
VOLUME /tmp
COPY out/artifacts/TelegramBot_jar/*.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
EXPOSE 8080
