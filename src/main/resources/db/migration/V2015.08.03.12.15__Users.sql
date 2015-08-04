CREATE TABLE users (
	id serial NOT NULL,
	email varchar(255) NOT NULL,
	password_hash varchar(255) NOT NULL,
	role varchar(255) NOT NULL,
	enabled boolean NOT NULL DEFAULT FALSE
);

ALTER TABLE ONLY users ADD CONSTRAINT users_pkey PRIMARY KEY(id);
