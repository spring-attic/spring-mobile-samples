# lite-device-resolver

A [Spring Mobile] sample app demonstrating the Device Resolver capabilities of the Spring Mobile Device module.


## Build and Deploy

1. Build the app:

		$ mvn clean install

2. Deploy the .war to a Servlet 2.5 or > ServletContainer. This can be done via Maven on the command-line by running:

		$ mvn tomcat:run

	_Note: Alternatively, you may import the project into your IDE and deploy to a Servlet 2.5 or > container such as Tomcat 6 or 7._

3. Access the project at the following URL:

	[http://localhost:8080/lite-device-resolver]

	_Note: Accessing this URL from your browser versus an Android emulator or iOS simulator will demonstrate the functionality_


## License

[Spring Mobile] is released under version 2.0 of the [Apache License].


[http://localhost:8080/lite-device-resolver]: http://localhost:8080/lite-device-resolver
[Spring Mobile]: http://www.springsource.org/spring-mobile
[Apache License]: http://www.apache.org/licenses/LICENSE-2.0