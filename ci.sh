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
build lite-device-delegating-view-resolver-jc
build lite-device-delegating-view-resolver-jc-thymeleaf
build lite-device-delegating-view-resolver-xml
build lite-device-resolver
build lite-device-resolver-jc
build lite-device-resolver-xml
build lite-site-preference-handler
build lite-site-preference-handler-jc
build lite-site-switcher-handler-jc-mdot
build lite-site-switcher-handler-jc-urlpath

exit
