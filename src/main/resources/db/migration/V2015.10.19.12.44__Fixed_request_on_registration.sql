ALTER TABLE request_on_registration ADD CONSTRAINT request_on_registration_email UNIQUE (email);
ALTER TABLE request_on_registration ADD CONSTRAINT request_on_registration_hash UNIQUE (hash);