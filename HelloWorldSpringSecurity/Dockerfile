FROM java:8
WORKDIR /getting-started
ADD ./target/HelloWorldSpringBoot-0.0.1-SNAPSHOT.jar /getting-started/HelloWorldSpringBoot-0.0.1-SNAPSHOT.jar
RUN chmod +x HelloWorldSpringBoot-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","HelloWorldSpringBoot-0.0.1-SNAPSHOT.jar"]
