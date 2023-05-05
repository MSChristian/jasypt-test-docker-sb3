FROM amazoncorretto:17-alpine3.17 as builder

WORKDIR /app

COPY .mvn/ .mvn
COPY mvnw pom.xml ./
COPY src ./src
RUN chmod +x mvnw

RUN ./mvnw clean package

FROM eclipse-temurin:17-jre-alpine
COPY --from=builder /app/target/jasypt-test.jar jasypt-test.jar
ENTRYPOINT ["java","-jar","/jasypt-test.jar"]
