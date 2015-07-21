#!/bin/bash

ssh polygraphy@192.168.200.109 -A "cd public/;
git pull origin develop;
cp -Rf data /home/polygraphy;
cd ..;
PGPASSWORD=polygraphy psql -U polygraphy < data/delete_db.sql;
PGPASSWORD=polygraphy psql -U polygraphy < data/polygraphy_db.sql;
PGPASSWORD=polygraphy psql -U polygraphy < data/fill_db.sql"