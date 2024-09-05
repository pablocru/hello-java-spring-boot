# How to create a Basic Spring Boot Project Using Spring Initializr

Set up a new Spring Boot project from scratch, ensuring that all the necessary
configurations and dependencies are correctly in place to start building a Spring-based
application.

## Instructions

1. Set Up the Project:
    - Go to [Spring Initializr](https://start.spring.io/).
    - Configure the project as follows:
        - **Project**: Maven Project
        - **Language**: Java
        - **Spring Boot Version**: Select the latest stable version (e.g., 2.7.0 or 3.0.0)
        - **Project Metadata**:
            - **Group**: com.example
            - **Artifact**: demo
            - **Name**: Demo
            - **Description**: Demo project for Spring Boot
            - **Package** Name: com.example.demo
            - **Packaging**: Jar
            - **Java Version**: 17 (or your preferred version)
        - **Dependencies**:
            - Add `Spring Web` dependency to enable web functionalities.
    - Click "Generate" to download the project as a `.zip` file.

1. Import the Project:
    - Extract the downloaded .zip file.
    - Open your IDE (VSCode, IntelliJ, or Eclipse).
    - Import the extracted project as a Maven project.

1. Run the Application:
    - Open the `DemoApplication.java` file in `src/main/java/com/example/demo/`.
    - Ensure the class is annotated with `@SpringBootApplication`.
    - Run the application using the IDE's run configuration or by executing `mvn
      spring-boot:run` from the terminal.

1. Test the Application:
    - Open your web browser or use a tool like Postman.
    - Go to <http://localhost:8080/>.
    - Since no specific controller is defined yet, you should see an error page indicating
      that no mapping was found. This indicates the application is running correctly.

1. Optional - Customize the Application:
    - Open `src/main/resources/application.properties`.
    - Add the following line to change the server port:

        ```txt
        server.port=8081
        ```

    - Rerun the application and verify it is now running on <http://localhost:8081/>.

```txt
Whitelabel Error Page

This application has no explicit mapping for /error, so you are seeing this as a fallback.
Fri Aug 30 12:21:40 CEST 2024
There was an unexpected error (type=Not Found, status=404).
```
