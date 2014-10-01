#!/bin/sh
cd $(dirname $0)

function wrapper {
    cd ./$1
    ./gradlew wrapper
    cd ../
}

wrapper lite-device-resolver
wrapper lite-site-preference-handler-jsp
wrapper lite-device-delegating-view-resolver
wrapper lite-device-delegating-view-resolver-jsp

exit