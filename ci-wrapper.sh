#!/bin/sh
cd $(dirname $0)

function wrapper {
    cd ./$1
    ./gradlew wrapper
    cd ../
}

wrapper lite-device-delegating-view-resolver
wrapper lite-device-delegating-view-resolver-jsp
wrapper archive/java-configuration/lite-device-delegating-view-resolver-jc
wrapper archive/java-configuration/lite-device-delegating-view-resolver-jc-thymeleaf
wrapper archive/xml-configuration/lite-device-delegating-view-resolver-xml
wrapper lite-device-resolver
wrapper archive/java-configuration/lite-device-resolver-jc
wrapper archive/xml-configuration/lite-device-resolver-xml
wrapper lite-site-preference-handler
wrapper archive/java-configuration/lite-site-preference-handler-jc
wrapper archive/java-configuration/lite-site-switcher-handler-jc-mdot
wrapper archive/java-configuration/lite-site-switcher-handler-jc-urlpath

exit