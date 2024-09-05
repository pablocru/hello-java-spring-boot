# Spring Boot Project Structure

- `src/main/java`: Contains the source code, including the main application class.
- `src/main/resources`:
  - `application.properties`: This file is used to configure various settings for your
      Spring Boot application, such as server port, database connection, logging, etc.
  - `static/`: Place for static content like HTML, CSS, JavaScript, images, etc.
  - `templates/`: Holds template files (e.g., Thymeleaf, FreeMarker, Mustache) for dynamic
      web content.
- `src/test/java`: Holds test classes for your application.
- `pom.xml`: It stands for `Project Object Model` file. Is the Maven configuration file.
  - `project metadata`: Project name and version, output file type (JAR or WAR) and so on.
  - `dependencies`: Lists all the libraries and dependencies required by your project.
  - `build`: Specifies build configuration, plugins, and goals for Maven.
  - `project coordinates`: Uniquely identify a project. Also referred as `GAV` (Group id,
    Artifact id and version).
    - `group id`: Organization name. It is a convention to use reverse domain name:
      `com.my-org`
    - `artifact id`: Name of the project.
    - `version`: The specific release version.

## Explore the Main Application Class

Open the DemoApplication.java file located in the `src/main/java/com/example/demo` folder.
It is the entry point of your Spring Boot application and contains the
`@SpringBootApplication` annotation, which combines three crucial annotations:

- `@Configuration`:
  - This annotation indicates that the class can be used by the Spring Inversion of
    Control (IoC) container as a source of bean definitions. It's a core part of the
    Spring framework for defining beans and configuring the application context.

  - Used to mark a class as a configuration class, which can contain bean definitions.
    This class can be processed by the Spring container to generate bean definitions and
    service requests for those beans.

  ```java
  @Configuration

  public class AppConfig {
      @Bean
      public MyBean myBean() {
          return new MyBean();
      }
  }
  ```

- `@EnableAutoConfiguration`:
  - This annotation is used to enable Spring Boot’s auto-configuration feature. It
    automatically configures your Spring application based on the dependencies on the
    `classpath`. For example, if you have a database driver on the `classpath`, Spring
    Boot will automatically configure a DataSource for you.

  - This is a powerful feature of Spring Boot that reduces the need for manual
    configuration and setup. It is based on the `META-INF/spring.factories` file, which
    contains a list of auto-configuration classes.

  - You typically don’t use `@EnableAutoConfiguration` directly; it's included in
    `@SpringBootApplication` to enable it.

  ```java
  @SpringBootApplication
  public class DemoApplication {
      public static void main(String[] args) {
          SpringApplication.run(DemoApplication.class, args);
      }
  }
  ```

- `@ComponentScan`:
  - This annotation is used to specify the packages to scan for Spring components. It is
    responsible for discovering and registering beans in the Spring application context.
    By default, it scans the package of the main application class and its sub-packages.

  - Allows you to specify which packages to search for annotated components (`@Component`,
    `@Service`, `@Repository`, `@Controller`, etc.). If your components are in different
    packages, you can use `@ComponentScan` to specify them.

  ```java
  @ComponentScan(basePackages = "com.example.myapp")
  public class AppConfig {
  }
  ```

Here’s how these annotations come together in a typical Spring Boot application:

```java
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}
```
