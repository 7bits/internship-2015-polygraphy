INSERT INTO polygraphy (id, name, payment_cash, payment_credit_card, 		delivery_pickup, delivery_courier, writes_the_check, 		order_by_email)
VALUES
	(1,'IQ дизайн-бюро', true, true, true, false, false, true),
	(2,'Оригинал', true, true, true, false, true, true),
	(3,'Крафтлайн', true, true, true, true, true, true),
	(4,'Изба-принт', true, true, true, false, true, false),
	(5,'futbolkaprint', true, true, true, true, true, true),
	(6,'Принт Экспресс', true, false, true, false, true, false),
	(7,'КАЙРОС', true, true, true, false, true, true),
	(8,'Селбс', true, true, true, true, true, true),
	(9,'Марка', true, true, true, false, true, true),
	(10,'55Print', true, true, true, true, true, true);

INSERT INTO service (id, name, rating)
VALUES 
	(1, 'печать на футболках', 1),
	(2, 'печать на кружках', 2),
	(3, 'изготовление значков', 0),
	(4, 'широкоформатная печать', 3),
	(5, 'изготовление блокнотов', 0),
	(6, 'изготовление календарей', 4),
	(7, 'изготовление магнитов', 6),
	(8, 'изготовление наклеек', 5);

INSERT INTO polygraphies_services(polygraphy_id, service_id)
VALUES 
	(1,4),
	(1,5),
	(1,6),
	(1,7),
	(2,4),
	(2,5),
	(2,6),
	(2,7),
	(3,2),	
	(3,3),
	(3,5),
	(3,6),
	(3,7),
	(4,4),
	(5,1),
	(6,4),
	(6,5),
	(6,6),
	(6,7),
	(7,3),
	(8,1),
	(8,2),
	(8,4),
	(8,5),
	(8,6),
	(8,7),
	(9,4),
	(9,6),
	(10,4),
	(10,6);

INSERT INTO contacts(polygraphy_id, addres, email, website, phone)
VALUES
	(1, 'ул. Масленникова, 28, офис 409', 'mail@901201.ru', 'http://www.dbiq.ru/', 3812901201);

