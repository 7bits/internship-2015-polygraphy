#!/bin/bash

PGPASSWORD=polygraphy psql -U polygraphy < data/delete_db.sql
PGPASSWORD=polygraphy psql -U polygraphy < data/polygraphy_db.sql
PGPASSWORD=polygraphy psql -U polygraphy < data/fill_db.sql