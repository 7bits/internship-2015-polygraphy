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
	(11,'Ретранс', true, true, true, false, true, false),
	(12,'Компаньон', true, false, true, false, true, false),
	(13,' Принт сервис', true, true, true, false, true, true),
	(14,'Аванта', true, true, true, false, true, false),
	(15,'Акула', true, true, true, false, true, false),
	(16,'Алвест', true, true, true, false, true, false),
	(17,'Алые паруса', true, true, true, false, true, true),
	(18,'АЛЬФА-ПРИНТ', true, true, true, false, true,true),
	(19,'АНТАРЕС', true, true, true, false, true, false),
	(20,'АрТ-РЕКЛАМА, ООО Карбуш', true, false, true, false, true, false);
        (21,'А3+', true, true, true, false, true, false),
	(22,'Бумеранг', true, false, true, false, true, true),
	(23,'Всемайки.ру',true, true, true, true, true, true),
	(24,'Глобал Принт', true, true, true, false, true, false),
	(25,'Дизайн-Проект', true, false, true, false, true, false),
	(26,'ДимАрт', true, true, true, true, true, true),
	(27,'Золотой тираж', true, true, true, false, true, false),
	(28,'Мегаполис PRINT', true, true, true, false, true, false),
	(29,'Медиаплюс', true, false, true, false, true, false),
	(30,'Образование Информ', true, true, true, false, true, false);
	(31,'ОмПАК', false, true, true, true, true, true),
	(32,'Омская картографическая фабрика', true, false, true, false, true, true),
	(33,'Отдел 55', true, false, true, false, true, false),
	(34,'Офисная полиграфия и комфорт', true, true, true, false, true, false),
	(35,'Печатное дело', true, true, true, false, true, true),
	(36,'ПечатьPremier', true, true, true, true, true, true),
	(37,' Полиграф', true, true, true, false, true, true),
	(38,' Пульсар-98', true, true, true, false, true, false),
	(39,'Рекламщик', false, true, true, false, true, true),
	(40,'Сибирь', true, true, true, false, true, false);
	(41,'Синяя Птица', true, true, true, false, true, true),
	(42,'СКАЙ ПРИНТ', true, true, true, true, true, false),
	(43,'Советская Сибирь, ОАО, типография', true, true, true, false,  true, false),
	(44,'Стиль фирмы, ООО, полиграфическая компания', false, true, true, false, true, true),
	(45,'ТИСА, ООО, типография', true, true, true, false, true, false),
	(46,'Тритон Плюс, ООО, рекламно-производственная компания', false, true, true, false, true, false),
	(47,'Фото-М, фотоцентр', true, true, true, false, true, false),
	(48,'Центр Рекламы, рекламно-полиграфическое агентство', true, false, true, false, true,true),
	

INSERT INTO service (id, name, rating)
VALUES 
	(1, 'печать на футболках', 1),
	(2, 'печать на кружках', 2),
	(3, 'изготовление значков', 0),
	(4, 'широкоформатная печать', 3),
	(5, 'изготовление блокнотов', 0),
	(6, 'изготовление календарей', 4),
	(7, 'изготовление магнитов',6);
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
	(6,8);
	(7,3),
	(8,1),
	(8,2),
	(8,4),
	(8,5),
	(8,6),
	(8,7),
	(9,4),
	(9,6),
	(9,8);
	(10,4),
	(10,6);
	(12,1);
	(12,2);
	(12,3);
	(12,4);
	(12,5);
	(12,6);
	(12,7);
	(12,8);
	(13,1);
	(13,2);
	(13,4);
	(13,5);
	(13,6);
	(14,1);
	(14,4);
	(14,5);
	(15,1);
	(15,2);
	(15,3);
	(15,4);
	(15,5);
	(15,6);
	(15,8);
	(16,1);
	(16,2);
	(16,3);
	(16,4);
	(16,6);
	(16,8);
	(17,1);
	(17,2);
	(17,3);
	(17,5);
	(17,6);
	(17,7);
	(18,4);
	(19,1);
	(19,2);
	(19,4);
	(19,5);
	(19,6);
	(19,7);
	(20,1);
	(20,2);
	(20,4);
	(20,6);
	(20,7);
	(21,1);
	(21,2);
	(21,3);
	(21,4);
	(21,7);
	(22,1);
	(22,2);
	(22,3);
	(22,5);
	(22,6);
	(22,7);
	(22,8);
	(23,1);
	(24,4);
	(24,5);
	(24,6);
	(24,8);
	(25,7);
	(26,4);
	(26,5);
	(26,6);
	(26,7);
	(27,2);
	(27,4);
	(27,5);
	(27,6);
	(28,1);
	(28,2);
	(28,3);
	(28,4);
	(28,5);
	(28,6);
	(28,7);
	(29,4);
	(29,5);
	(29,6);
	(30,4);
	(30,5);
	(30,6);
	(30,8);
	(31,2);
	(31,3);
	(31,4);
	(31,6);
	(31,8);
	(32,4);
	(33,1);
	(33,2);
	(33,4);
	(33,7);
	(34,5);
	(34,6);
	(36,5);
	(36,6);
	(37,2);
	(37,3);
	(37,5);
	(37,6);
	(37,7);
	(37,8);
	(38,1);
	(38,2);
	(38,6);
	(39,1);
	(39,4);
	(39,5);
	(39,6);
	(40,2);
	(40,3);
	(40,5);
	(40,6);
	(40,7);
	(40,8);
	(41,1);
	(41,2);
	(41,4);
	(41,5);
	(41,6);
	(42,5);
	(42,6);
	(42,7);
	(43,4);
	(43,5);
	(43,6);
	(44,1);
	(44,2);
	(44,3);
	(44,5);
	(44,6);
	(44,7);
	(45,4);
	(45,5);
	(45,6);
	(45,8);
	(46,1,);
	(46,2);
	(46,5);
	(46,8);
	(47,1);
	(47,2);
	(47,7);
	(47,8);
	(48,4);
	(48,5);
	(48,6);



















































INSERT INTO contacts(polygraphy_id, addres, email, website, phone)
VALUES
	(1, 'ул. Масленникова, 28, офис 409', 'mail@901201.ru', 'http://www.dbiq.ru/', 3812901201);

