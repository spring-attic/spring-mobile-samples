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
build lite-device-delegating-view-resolver-thymeleaf
build lite-device-delegating-view-resolver-xml
build lite-device-resolver
build lite-device-resolver-xml
build lite-site-preference-handler
build lite-site-switcher-handler-mdot
build lite-site-switcher-handler-urlpath

exit
