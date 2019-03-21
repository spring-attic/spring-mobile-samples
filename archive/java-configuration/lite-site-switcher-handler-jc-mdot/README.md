# lite-site-switcher-handler-mdot

A [Spring Mobile] sample application demonstrating the [`mDot`] Site Switcher strategy of the Spring Mobile Device module.


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

3. Configure your hosts file to include the following mappings:

	```sh
	127.0.0.1	testdomain.com
	127.0.0.1	m.testdomain.com
	```

4. Access the sample application at the following URL:

    [http://testdomain.com:8080/lite-site-switcher-handler-mdot]()

    > **Note**: access the site from your browser, Android emulator or iOS simulator to demonstrate the functionality.


## License

[Spring Mobile] is released under version 2.0 of the [Apache License].


[`mDot`]: https://docs.spring.io/spring-mobile/docs/1.1.x/reference/html/device.html#site-switcher-handler-interceptor-mdot
[Spring Mobile]: https://projects.spring.io/spring-mobile
[Apache License]: https://www.apache.org/licenses/LICENSE-2.0
