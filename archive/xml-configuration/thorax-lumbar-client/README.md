# thorax-lumbar-client

A [Spring Mobile] sample application demonstrating the use of Spring Mobile to direct requests coming from a variety of devices to device-specific content that is created as the result of building a Thorax project with Lumbar.


## Overview

From the description on its website, [Lumbar] is a js-build tool that takes a general codebase and list of platforms to generate modular platform specific applications. What that means is that Lumbar pulls together commons HTML, JavaScript, CSS, and other resources along with resources that are specific to distinct platforms and creates an individual platform-specific application for each platform defined in its build file (lumbar.json).

[Thorax] is another project from [WalmartLabs] that extends the popular [Backbone] JavaScript framework to be more opinionated and offer more features. 

[Spring Mobile] is well-suited for directing requests to platform-specific URLs and Lumbar is well-suited for created platform-specific application web sites. This seems like a natural match and is what is demonstrated in this sample.


##Build and Deploy

In order to build this application, you must have Lumbar installed. You do not need to install Thorax unless you intend to use the Thorax command-line tool to further extend the sample.

1. Install Lumbar using the node package manager:

    ```sh
    $ npm install -g lumbar
    ```
   
	Or, install Thorax along with Lumbar:

    ```sh
    $ npm install -g lumbar thorax
    ```
   
2. Although you can run the "lumbar" command at the command line to build only the Thorax portion of the application, we've added tasks to the [Gradle] build to incorporate the Lumbar build into the Spring Mobile project. To run *only* the Lumbar portion of the build:

    ```sh
    $ ./gradlew lumbar
    ```
   
	Alternatively, you may create a WAR file that includes the Spring MVC/Mobile application and the Lumbar-built platform-specific artifacts:

    ```sh
    $ ./gradlew build
    ```
   
    > **Note**: The build task will run the lumbar task prior to packaging the application in a WAR file.

3. Deploy and run the application in Tomcat using the Tomcat Gradle plugin:

    ```sh
    $ ./gradlew tomcatRunWar
    ```

4. Access the project at the following URL:

	[http://localhost:8080/thorax-client][app-url]

	Depending on whether your browser is a normal, mobile, or tablet client, you will be redirected to the platform-specific version of the application.

	> **Note**: it is important that you run Gradle with the tomcatRunWar task and not the tomcatRun task. The tomcatRunWar task will ensure that the Lumbar build has taken place and will include the Lumbar-built artifacts in the running application.


## License

[Spring Mobile] is released under version 2.0 of the [Apache License].


[Spring Mobile]: https://projects.spring.io/spring-mobile
[Lumbar]: https://walmartlabs.github.com/lumbar/
[Thorax]: https://walmartlabs.github.com/thorax/
[WalmartLabs]: https://www.walmartlabs.com/
[Backbone]: https://backbonejs.org/
[Gradle]: https://www.gradle.org/
[app-url]: http://localhost:8080/thorax-client
[Apache License]: https://www.apache.org/licenses/LICENSE-2.0
