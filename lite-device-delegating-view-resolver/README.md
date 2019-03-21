# lite-device-delegating-view-resolver

A [Spring Mobile] sample application demonstrating many of the capabilities of the Spring Mobile Device module, including:

* "Lite" device resolution through the use of DeviceResolverHandlerInterceptor 
* Site preference management via SitePreferenceHandlerInterceptor
* View resolution with LiteDeviceDelegatingViewResolver
* Spring Boot auto-configuration
* Thymeleaf views


## Auto-configuration

[Spring Boot] support is enabled through a property defined in `application.properties`. By default `LiteDeviceDelegatingViewResolver` is disabled in Spring Mobile auto-configuration. If the following property is not declared or is set to false, then this feature will be disabled.

`src/main/resources/application.properties`
```
spring.mobile.devicedelegatingviewresolver.enabled: true
```


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

    > **Note**: access the site from your browser, Android emulator or iOS simulator to demonstrate the functionality.


## License

[Spring Mobile] is released under version 2.0 of the [Apache License].


[Spring Mobile]: https://projects.spring.io/spring-mobile
[Spring Boot]: https://projects.spring.io/spring-boot
[Apache License]: https://www.apache.org/licenses/LICENSE-2.0
