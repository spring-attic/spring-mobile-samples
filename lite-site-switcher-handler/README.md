# lite-site-switcher-handler

A [Spring Mobile] sample app demonstrating many of the Site Switcher capabilities of the Spring Mobile Device module.


## Build and Deploy

1. Build the app:

		$ mvn clean install

2. Deploy the .war to a Servlet 2.5 or > ServletContainer. This can be done via Maven on the command-line by running:

		$ mvn tomcat:run

	_Note: Alternatively, you may import the project into your IDE and deploy to a Servlet 2.5 or > container such as Tomcat 6 or 7._

3. Access the project at the following URL:

	[http://localhost:8080/lite-site-switcher-handler]

	_Note: Accessing this URL from your browser versus an Android emulator or iOS simulator will demonstrate the functionality_


## License

[Spring Mobile] is released under version 2.0 of the [Apache License].


[http://localhost:8080/lite-site-switcher-handler]: http://localhost:8080/lite-site-switcher-handler
[Spring Mobile]: http://www.springsource.org/spring-mobile
[Apache License]: http://www.apache.org/licenses/LICENSE-2.0