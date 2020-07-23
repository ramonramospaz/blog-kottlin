ARG VERSION=8u151

FROM openjdk:${VERSION}-jdk as BUILD

COPY . /src
WORKDIR /src
RUN ./gradlew

FROM openjdk:${VERSION}-jre

COPY --from=BUILD /src/build/libs/step-by-step-kotlin-all.jar /bin/runner/run.jar
WORKDIR /bin/runner

CMD ["java","-jar","run.jar"]