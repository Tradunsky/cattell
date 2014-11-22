#!/bin/bash
export CONTAINER=/home/o111o1oo/dev/soft/java/servers/jetty/webapps/
cd ../

echo "Start copy static to container"
cp -rup static ${CONTAINER}
echo "End copy static to container"
