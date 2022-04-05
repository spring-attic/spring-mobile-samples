# lite-device-resolver

A [Spring Mobile] sample application demonstrating the Device Resolver capabilities of the Spring Mobile Device module, including:

* "Lite" device resolution through the use of DeviceResolverHandlerInterceptor 
* Spring Boot auto-configuration
* Thymeleaf views


## Build and Deploy

1. Build with Gradle:

    ```sh
    $ ./gradlew build
    ```
    Or Maven:

    ```sh
    $ mvn clean package
    ```

2. Run Spring Boot with Gradle:

    ```sh
    ./gradlew bootRun
    ```

    Or Maven:

    ```sh
    $ mvn spring-boot:run
    ```

3. View the sample application at the following URL:

    [http://localhost:8080/](http://localhost:8080/)


## License

[Spring Mobile] is released under version 2.0 of the [Apache License].


[Spring Mobile]: https://projects.spring.io/spring-mobile
[Spring Boot]: https://projects.spring.io/spring-boot
[Apache License]: https://www.apache.org/licenses/LICENSE-2.0
