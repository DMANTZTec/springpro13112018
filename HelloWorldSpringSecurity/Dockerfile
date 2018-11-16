FROM java:8
WORKDIR /getting-started
ADD ./target/HelloWorldSpringBoot-0.0.1-SNAPSHOT.jar /getting-started/HelloWorldSpringBoot-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/HelloWorldSpringBoot-0.0.1-SNAPSHOT.jar"]

