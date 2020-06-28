FROM adoptopenjdk/openjdk11:alpine-jre

MAINTAINER kimi.qian.min@gmail.com

COPY target/docker-demo-1.0.3.jar /docker-demo.jar

#ENTRYPOINT ["java", "-jar", "/docker-demo.jar", "--mysql.address=192.168.1.218"]

ENTRYPOINT ["java", "-jar", "/docker-demo.jar"]

EXPOSE 8080