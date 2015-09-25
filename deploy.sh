#!/bin/bash

mvn clean -Dmaven.test.skip=true -Dmaven.tomcat.url=http://192.168.200.109:8080/manager/text tomcat7:redeploy