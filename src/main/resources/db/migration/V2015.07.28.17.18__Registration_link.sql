CREATE TABLE registration_links(
	link varchar(256) NOT NULL
);

ALTER TABLE ONLY registration_links ADD CONSTRAINT registration_links_pkey PRIMARY KEY(link);
