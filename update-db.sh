#!/bin/bash

ssh polygraphy@192.168.200.109 -A
"cd public/;
git pull origin develop;
cp -Rf data /home/polygraphy;
cd ..;
psql -U polygraphy < data/delete_db.sql;
psql -U polygraphy < data/polygraphy_db.sql;
psql -U polygraphy < data/fill_db.sql"