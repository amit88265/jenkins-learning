# Use a base image with Java and Alpine Linux
FROM adoptopenjdk/openjdk17:alpine
# Set the working directory inside the container
WORKDIR /app

# Copy the Spring Boot executable JAR file into the container
COPY build/libs/jenkins-learning-0.0.1-SNAPSHOT.jar /app/app.jar

# Expose the port that the Spring Boot application uses (default is 8080)
EXPOSE 7878

# Specify the command to run on container startup
CMD ["java", "-jar", "app.jar"]
