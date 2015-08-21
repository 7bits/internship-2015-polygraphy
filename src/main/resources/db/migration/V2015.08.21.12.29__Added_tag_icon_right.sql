ALTER TABLE request_on_registration  DROP COLUMN tag RESTRICT;
ALTER TABLE service ADD COLUMN tag varchar(64);
