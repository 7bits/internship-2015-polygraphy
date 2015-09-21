#!/bin/bash

ssh polygraphy@192.168.200.109 -A "cd public/; git pull origin develop; gulp js:build"

mvn clean -Dmaven.test.skip=true -Dmaven.tomcat.url=http://192.168.200.109:8080/manager/text tomcat7:redeploy

