FROM openjdk:11-jre-slim
EXPOSE 9090
ADD target/hello-world-docker.jar hello-world-docker.jar
ENTRYPOINT [ "java","-jar","/hello-world-docker.jar" ]
