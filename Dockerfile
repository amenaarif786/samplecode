From openjdk:8
copy ./target/sampleapp-0.0.1-SNAPSHOT.jar sampleapp-0.0.1-SNAPSHOT.jar
CMD ["java","-jar","sampleapp-0.0.1-SNAPSHOT.jar"]