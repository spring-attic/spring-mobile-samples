#!/bin/sh
cd $(dirname $0)

function wrapper {
    cd ./$1
    ./gradlew wrapper
    cd ../
}

wrapper lite-device-delegating-view-resolver
wrapper lite-device-delegating-view-resolver-thymeleaf
wrapper lite-device-delegating-view-resolver-xml
wrapper lite-device-resolver
wrapper lite-device-resolver-xml
wrapper lite-site-preference-handler
wrapper lite-site-switcher-handler-mdot
wrapper lite-site-switcher-handler-urlpath

exit