# Spring Mobile Samples

[Spring Mobile] is an extension to [Spring MVC] that aims to simplify the development of mobile web applications. This repository contains sample projects illustrating usage of Spring Mobile. See [Spring Mobile on GitHub] for more information about building from source.


## Sample Applications

The following sample applications demonstrate the capabilities of [Spring Mobile] for server-side device detection and handling. See the README within each sample project for more information and additional instructions.

* [lite-device-resolver] - illustrates DeviceResolver functionality and usage.

* [lite-site-preference-handler] - illustrates SitePreferenceHandler functionality.

* [lite-site-switcher-handler] - illustrates SiteSwitcherHandler functionality.

* [lite-device-delegating-view-resolver] - example showing view names adjusted based on device.

* [lite-device-delegating-view-resolver-xml] - example using XML based configuration, showing view names adjusted based on device.

* [lite-showcase] - combines all features of Spring Mobile to showcase the use of the "urlPath" site switching.

* [thorax-lumbar-client] - showcases the use of Spring Mobile with JavaScript libraries


## Build and Deploy

Most of the sample apps can be built and run using the following commands from within the sample's folder.

1. Build the app:

    ```sh
    $ mvn clean package
    ```

2. Deploy the .war to a Servlet 3 ServletContainer using Maven:

    ```sh
    $ mvn tomcat7:run
    ```

    > **Note**: you may also import the project into your IDE and deploy to a Servlet 3 container such as Tomcat 7.


## Contribute

[Pull requests] are welcome. See the [contributor guidelines] for details.


## Additional Resources

See a [screencast demonstration] based on [Spring Mobile 1.0.0.M2].


## License

[Spring Mobile] is released under version 2.0 of the [Apache License].


[Spring Mobile]: http://www.springsource.org/spring-mobile
[Spring MVC]: http://static.springsource.org/spring/docs/current/spring-framework-reference/html/mvc.html
[Spring Mobile on GitHub]: https://github.com/SpringSource/spring-mobile
[lite-device-resolver]: ./lite-device-resolver
[lite-site-preference-handler]: ./lite-site-preference-handler
[lite-site-switcher-handler]: ./lite-site-switcher-handler
[lite-device-delegating-view-resolver]: ./lite-device-delegating-view-resolver
[lite-device-delegating-view-resolver-xml]: ./lite-device-delegating-view-resolver-xml
[lite-showcase]: ./lite-showcase
[thorax-lumbar-client]: ./thorax-lumbar-client
[Pull requests]: http://help.github.com/send-pull-requests
[contributor guidelines]: https://github.com/SpringSource/spring-mobile/wiki/Contributor-Guidelines
[screencast demonstration]: http://s3.springsource.org/MVC/spring-mobile-1.0.0.M2-screencast.mov
[Spring Mobile 1.0.0.M2]: http://www.springsource.org/spring-mobile/news/1.0.0.m2-released
[Apache license]: http://www.apache.org/licenses/LICENSE-2.0
