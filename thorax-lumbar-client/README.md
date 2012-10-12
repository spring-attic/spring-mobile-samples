thorax-lumbar-client
====================
This sample demonstrates the use of Spring Mobile to direct requests coming from a variety of devices
to device-specific content that is created as the result of building a Thorax project with Lumbar.

From the description on its website (http://walmartlabs.github.com/lumbar/), Lumbar is a js-build tool 
that takes a general codebase and list of platforms to generate modular platform specific applications.
What that means is that Lumbar pulls together commons HTML, JavaScript, CSS, and other resources along
with resources that are specific to distinct platforms and creates an individual platform-specific
application for each platform defined in its build file (lumbar.json).

Thorax (http://walmartlabs.github.com/thorax/) is another project from WalmartLabs that extends the
popular Backbone JavaScript framework to be more opinionated and offer more features.

Spring Mobile is well-suited for directing requests to platform-specific URLs and Lumbar is well-
suited for created platform-spefific application websites. This seems like a natural match and is what
is demonstrated in this sample.

Build Instructions
------------------
In order to build this application, you must have Lumbar installed. You do not need to install Thorax
unless you intend to use the Thorax command-line tool to further extend the sample.

To install Lumbar use the node package manager:

   npm install -g lumbar
   
Or, to install Thorax along with Lumbar:

   npm install -g lumbar thorax
   
Although you can run the "lumbar" command at the command line to build only the Thorax portion of
the application, we've added tasks to the Gradle build to incorporate the Lumbar build into the Spring
Mobile project. To run *only* the Lumbar portion of the build:

   gradlew lumbar
   
Or, to create a WAR file that includes the Spring MVC/Mobile application and the Lumbar-built
platform-specific artifacts:

   gradlew build
   
The build task will run the lumbar task prior to packaging the application in a WAR file.

You may also run the application in Tomcat using the Tomcat Gradle pluing:

   gradlew tomcatRunWar

Then point your browser at http://localhost:8080/thorax-client

Depending on whether your browser is a regular, tablet, or mobile client, you'll be redirected
to the platform-specific version of the application.

Note that it is important that you run Gradle with the tomcatRunWar task and not the tomcatRun
task. The tomcatRunWar task will ensure that the Lumbar build has taken place and will include the
Lumbar-built artifacts in the running application.

