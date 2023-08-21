FROM openjdk:11-jre-slim
EXPOSE 9090
ADD target/hello-docker.jar hello-docker.jar
ENTRYPOINT [ "java","-jar","/hello-docker.jar" ]