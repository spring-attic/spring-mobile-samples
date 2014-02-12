#!/bin/sh
cd $(dirname $0)

gradle wrapper
./gradlew clean build
ret=$?
if [ $ret -ne 0 ]; then
  exit $ret
fi
rm -rf build
