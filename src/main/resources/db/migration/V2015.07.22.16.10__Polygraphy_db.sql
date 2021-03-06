CREATE TABLE polygraphy(
	id serial NOT NULL,
	name varchar(128) NOT NULL,
	writes_the_check boolean,
	order_by_email boolean
);

ALTER TABLE ONLY polygraphy ADD CONSTRAINT polygraphy_pkey PRIMARY KEY(id);


CREATE TABLE service(
	id serial NOT NULL,
	name varchar(128) NOT NULL,
	rating int NOT NULL DEFAULT 0
);

ALTER TABLE ONLY service ADD CONSTRAINT service_pkey PRIMARY KEY(id);


CREATE TABLE polygraphies_services(
	polygraphy_id int,
	service_id int
);

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

ALTER TABLE ONLY contacts ADD CONSTRAINT contacts_polygraphy_id_fkey FOREIGN KEY (polygraphy_id) REFERENCES polygraphy(id);
ALTER TABLE ONLY contacts ADD CONSTRAINT contacts_pkey PRIMARY KEY(polygraphy_id);


CREATE TABLE payment_method(
	id serial NOT NULL,
	name varchar(128) NOT NULL
);

ALTER TABLE ONLY payment_method ADD CONSTRAINT payment_method_pkey PRIMARY KEY(id);


CREATE TABLE polygraphies_payment_methods(
	polygraphy_id int,
	payment_method_id int
);

ALTER TABLE ONLY polygraphies_payment_methods ADD CONSTRAINT polygraphies_payment_methods_polygraphy_id_fkey FOREIGN KEY (polygraphy_id) REFERENCES polygraphy(id);
ALTER TABLE ONLY polygraphies_payment_methods ADD CONSTRAINT polygraphies_payment_methods_payment_method_id_fkey FOREIGN KEY (payment_method_id) REFERENCES payment_method(id);
ALTER TABLE ONLY polygraphies_payment_methods ADD CONSTRAINT polygraphies_payment_methods_pkey PRIMARY KEY(polygraphy_id,payment_method_id);


CREATE TABLE delivery_method(
	id serial NOT NULL,
	name varchar(128) NOT NULL
);

ALTER TABLE ONLY delivery_method ADD CONSTRAINT delivery_method_pkey PRIMARY KEY(id);


CREATE TABLE polygraphies_delivery_methods(
	polygraphy_id int,
	delivery_method_id int
);


ALTER TABLE ONLY polygraphies_delivery_methods ADD CONSTRAINT polygraphies_delivery_methods_polygraphy_id_fkey FOREIGN KEY (polygraphy_id) REFERENCES polygraphy(id);
ALTER TABLE ONLY polygraphies_delivery_methods ADD CONSTRAINT polygraphies_delivery_methods_delivery_method_id_fkey FOREIGN KEY (delivery_method_id) REFERENCES delivery_method(id);
ALTER TABLE ONLY polygraphies_delivery_methods ADD CONSTRAINT polygraphies_delivery_methods_pkey PRIMARY KEY(polygraphy_id,delivery_method_id);