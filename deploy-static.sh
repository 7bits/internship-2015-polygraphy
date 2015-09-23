#!/bin/bash

ssh polygraphy@192.168.200.109 -A "rm -R /home/polygraphy/public; exit"
scp -r src/main/resources/public polygraphy@192.168.200.109:/home/polygraphy