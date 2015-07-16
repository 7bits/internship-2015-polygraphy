CREATE TABLE polygraphy(
	id serial NOT NULL,
	name varchar(128) NOT NULL,
	payment_cash boolean,
	payment_credit_card boolean,
	payment_on_account boolean,
	delivery_pickup boolean,
	delivery_courier boolean,
	delivery_post boolean,
	writes_the_check boolean,
	order_by_email boolean
);

ALTER TABLE public.polygraphy OWNER TO polygraphy;
ALTER TABLE ONLY polygraphy ADD CONSTRAINT polygraphy_pkey PRIMARY KEY(id);

CREATE TABLE service(
	id serial NOT NULL,
	name varchar(128) NOT NULL,
	rating int NOT NULL DEFAULT 0
);

ALTER TABLE public.service OWNER TO polygraphy;
ALTER TABLE ONLY service ADD CONSTRAINT service_pkey PRIMARY KEY(id);

CREATE TABLE polygraphies_services(
	polygraphy_id int,
	service_id int
);

ALTER TABLE public.polygraphies_services OWNER TO polygraphy;
ALTER TABLE ONLY polygraphies_services ADD CONSTRAINT polygraphies_services_polygraphy_id_fkey FOREIGN KEY (polygraphy_id) REFERENCES polygraphy(id);
ALTER TABLE ONLY polygraphies_services ADD CONSTRAINT polygraphies_services_service_id_fkey FOREIGN KEY (service_id) REFERENCES service(id);
ALTER TABLE ONLY polygraphies_services ADD CONSTRAINT polygraphies_services_pkey PRIMARY KEY(polygraphy_id,service_id);

CREATE TABLE contacts(
	polygraphy_id serial NOT NULL,
	addres varchar(256),
	email varchar(256),
	website varchar(256),
	phone varchar(12)
);

ALTER TABLE public.contacts OWNER TO polygraphy;
ALTER TABLE ONLY contacts ADD CONSTRAINT contacts_polygraphy_id_fkey FOREIGN KEY (polygraphy_id) REFERENCES polygraphy(id);
ALTER TABLE ONLY contacts ADD CONSTRAINT contacts_pkey PRIMARY KEY(polygraphy_id);


