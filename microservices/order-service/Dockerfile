# Use an official Java runtime as a parent image
FROM openjdk:17.0.2-slim

# Set the working directory in the container
WORKDIR /app

# Copy the application JAR into the container
COPY target/order-service-1.0-SNAPSHOT.jar .

# Run the application when the container starts
CMD ["java", "-jar", "order-service-1.0-SNAPSHOT.jar"]