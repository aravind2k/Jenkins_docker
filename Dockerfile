FROM openjdk:8
EXPOSE 8092
ADD target/Jenkins-docker-0.0.1-SNAPSHOT.jar Jenkins-docker-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/Jenkins-docker-0.0.1-SNAPSHOT.jar"]