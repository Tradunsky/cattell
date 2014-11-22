#!/bin/sh
export M2_HOME=/usr/share/maven2
cd ../

mvn clean package
echo "Start copy kettell.war to webaps"
cp -up target/kettell.war /home/o111o1oo/dev/soft/java/servers/jetty/webapps/
echo "End copy kettell.war to webaps"