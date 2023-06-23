FROM ubuntu:rolling

# Install OpenJDK 17
RUN apt-get update && apt-get install -y openjdk-17-jdk

# Copy the application WAR file to the container
COPY target/azurespringbootapp1-0.0.1-SNAPSHOT.jar /app/

# Set the working directory to /app
WORKDIR /app

# Run the application using the java command
ENTRYPOINT ["java", "-jar", "/app/azurespringbootapp1-0.0.1-SNAPSHOT.jar"]
