FROM openjdk:8
COPY ./target/classes/com/example/StringSorter /tmp
WORKDIR /tmp
ENTRYPOINT ["java","Main"]