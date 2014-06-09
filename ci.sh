#!/bin/sh
cd $(dirname $0)

function build {
    ./$1/ci.sh
    ret=$?
    if [ $ret -ne 0 ]; then
        exit $ret
    fi
}

build lite-device-delegating-view-resolver
build lite-device-delegating-view-resolver-jsp
build archive/java-configuration/lite-device-delegating-view-resolver-jc
build archive/java-configuration/lite-device-delegating-view-resolver-jc-thymeleaf
build archive/xml-configuration/lite-device-delegating-view-resolver-xml
build lite-device-resolver
build archive/java-configuration/lite-device-resolver-jc
build archive/xml-configuration/lite-device-resolver-xml
build lite-site-preference-handler
build archive/java-configuration/lite-site-preference-handler-jc
build archive/java-configuration/lite-site-switcher-handler-jc-mdot
build archive/java-configuration/lite-site-switcher-handler-jc-urlpath

exit
