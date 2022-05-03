FROM openjdk:8
EXPOSE 8080
ADD target/pipeline-github-pring.jar pipeline-github-pring.jar
ENTRYPOINT ["java","-jar","/pipeline-github-pring.jar"]