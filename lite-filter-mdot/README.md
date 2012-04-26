# Spring Mobile Lite Showcase

## Overview

This sample app demonstrates many of the capabilities of the Spring Mobile Device module, including:

* "Lite" device resolution through the use of the DeviceResolverHandlerFilter
* Site preference management
* Site switching configured for the mDot strategy

## Build and Run the Sample Application

1. Build the app:

		$ mvn clean install

2. Deploy the .war to a Servlet 2.5 or > ServletContainer. This can be done via Maven on the command-line by running:

		$ mvn tomcat:run

	_Note: Alternatively, you may import the project into your IDE and deploy to a Servlet 2.5 or > container such as Tomcat 6 or 7._

3. Access the project at the following URL:

		http://localhost:8080/lite-filter-mdot

	_Note: Accessing this URL from your browser versus an Android emulator or iOS simulator will demonstrate the functionality_

## Configure your Hosts file

In order for the site switcher demonstration to work in a local test environment, you will need to add the following to your hosts file; for example, /etc/hosts on Unix and OS X systems:

	127.0.0.1    testdomain.com 
	127.0.0.1    m.testdomain.com
