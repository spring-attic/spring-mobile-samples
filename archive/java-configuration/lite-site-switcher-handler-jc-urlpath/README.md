# lite-site-switcher-handler-urlpath

A [Spring Mobile] sample application demonstrating many of the capabilities of the Spring Mobile Device module, including:

* "Lite" device resolution through the use of DeviceResolverHandlerInterceptor 
* Site preference management
* Site switching configured for the [`urlPath`] strategy


## Build and Deploy

1. Build with Gradle:

    ```sh
    $ ./gradlew build
    ```

    Or Maven:

    ```sh
    $ mvn clean package
    ```

2. Deploy the .war to a Servlet 3 ServletContainer using Gradle:

    ```sh
    $ ./gradlew tomcatRun
    ```

    Or Maven:

    ```sh
    $ mvn tomcat7:run
    ```

3. Access the sample application at the following URL:

    [http://localhost:8080/lite-site-switcher-handler-urlpath]()

    > **Note**: access the site from your browser, Android emulator or iOS simulator to demonstrate the functionality.


## License

[Spring Mobile] is released under version 2.0 of the [Apache License].


[`urlPath`]: https://docs.spring.io/spring-mobile/docs/1.1.x/reference/html/device.html#site-switcher-handler-interceptor-urlpath
[Spring Mobile]: https://projects.spring.io/spring-mobile
[Apache License]: https://www.apache.org/licenses/LICENSE-2.0
