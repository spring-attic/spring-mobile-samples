# lite-site-preference-handler

A [Spring Mobile] sample application demonstrating many of the capabilities of the Spring Mobile Device module, including:

* "Lite" device resolution through the use of DeviceResolverHandlerInterceptor 
* Site preference management via SitePreferenceHandlerInterceptor
* JSP views
* Spring Boot autoconfiguration


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

    [http://localhost:8080/]()



## License

[Spring Mobile] is released under version 2.0 of the [Apache License].


[Spring Mobile]: http://projects.spring.io/spring-mobile
[Apache License]: http://www.apache.org/licenses/LICENSE-2.0
