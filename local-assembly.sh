#!/bin/bash

sudo npm install
gulp build
mvn clean spring-boot:run -Dspring.profiles.active=development