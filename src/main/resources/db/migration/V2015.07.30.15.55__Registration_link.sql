CREATE TABLE registration_link(
	hash varchar(256) NOT NULL
);

ALTER TABLE ONLY registration_link ADD CONSTRAINT registration_link_pkey PRIMARY KEY(hash);
