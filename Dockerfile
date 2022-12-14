FROM openjdk:17-alpine


COPY target/docker-kube-java.jar docker-kube-java.jar


ENTRYPOINT [ "java", "-jar", "docker-kube-java.jar" ]
