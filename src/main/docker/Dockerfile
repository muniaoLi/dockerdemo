FROM java:8

VOLUME /tmp

COPY dockerdemo-1.0.0-SNAPSHOT.jar dockerdemo.jar

RUN bash -c "touch /dockerdemo.jar"

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "dockerdemo.jar", "--spring.profiles.active=test", "--server.port=8080", "> /log/dockerdemo.log"]
