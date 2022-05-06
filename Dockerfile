FROM openjdk:8
EXPOSE 8086
ADD target/pipeline-github-pring.jar pipeline-github-pring.jar
ENTRYPOINT ["java","-jar","/pipeline-github-pring.jar"]