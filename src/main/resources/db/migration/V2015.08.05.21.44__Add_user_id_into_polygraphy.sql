ALTER TABLE polygraphy ADD COLUMN user_id int;
ALTER TABLE ONLY polygraphy ADD CONSTRAINT polygraphy_user_id_fkey FOREIGN KEY (user_id) REFERENCES users(id);
