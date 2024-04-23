# Use a base image with Java and Alpine Linux
FROM openjdk:17-jdk-slim
# Set the working directory inside the container
WORKDIR /app

# Copy the Spring Boot executable JAR file into the container
COPY build/libs/jenkins-learning-0.0.1-SNAPSHOT.jar /app/app.jar

# Specify the command to run on container startup
CMD ["java", "-jar", "app.jar"]
