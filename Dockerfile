FROM openjdk:17
EXPOSE 8080
ADD target/monitoring-service.jar monitoring-service.jar
ENTRYPOINT ["java" , "-jar" , "monitoring-service.jar"]