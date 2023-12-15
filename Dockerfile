FROM azul/zulu-openjdk:17-latest
VOLUME /tmp
COPY out/artifacts/TelegramBot_jar/*.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
EXPOSE 8080
