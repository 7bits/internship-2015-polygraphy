#!/bin/bash

gulp js:build
ssh polygraphy@192.168.200.109 -A "cd public/; git pull origin develop"
