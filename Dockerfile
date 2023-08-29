FROM openjdk:17-alpine


COPY target/docker-kube-java.jar docker-kube-java.jar

EXPOSE 8010

ENTRYPOINT [ "java", "-jar", "docker-kube-java.jar" ]
