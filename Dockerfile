# Use an official Java runtime as a parent image
FROM openjdk:11-jre-slim

# Set the working directory in the container
WORKDIR /app

# Copy the JAR file into the container
COPY target/JenkisPipeline-0.0.1-SNAPSHOT.jar /app/JenkisPipeline.jar

# Run the JAR file
ENTRYPOINT ["java", "-jar", "myapp.jar"]

# Expose port 8080 to the outside world
EXPOSE 8080
