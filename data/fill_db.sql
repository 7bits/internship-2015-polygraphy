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
	(10,'55Print', true, true, true, true, true, true),
	(11,'Ретранс', true, true, true, false, true, false),
	(12,'Компаньон', true, false, true, false, true, false),
	(13,' Принт сервис', true, true, true, false, true, true),
	(14,'Аванта', true, true, true, false, true, false),
	(15,'Акула', true, true, true, false, true, false),
	(16,'Алвест', true, true, true, false, true, false),
	(17,'Алые паруса', true, true, true, false, true, true),
	(18,'АЛЬФА-ПРИНТ', true, true, true, false, true,true),
	(19,'АНТАРЕС', true, true, true, false, true, false),
	(20,'АрТ-РЕКЛАМА, ООО Карбуш', true, false, true, false, true, false),
        (21,'А3+', true, true, true, false, true, false),
	(22,'Бумеранг', true, false, true, false, true, true),
	(23,'Всемайки.ру',true, true, true, true, true, true),
	(24,'Глобал Принт', true, true, true, false, true, false),
	(25,'Дизайн-Проект', true, false, true, false, true, false),
	(26,'ДимАрт', true, true, true, true, true, true),
	(27,'Золотой тираж', true, true, true, false, true, false),
	(28,'Мегаполис PRINT', true, true, true, false, true, false),
	(29,'Медиаплюс', true, false, true, false, true, false),
	(30,'Образование Информ', true, true, true, false, true, false),
	(31,'ОмПАК', false, true, true, true, true, true),
	(32,'Омская картографическая фабрика', true, false, true, false, true, true),
	(33,'Отдел 55', true, false, true, false, true, false),
	(34,'Офисная полиграфия и комфорт', true, true, true, false, true, false),
	(35,'Печатное дело', true, true, true, false, true, true),
	(36,'ПечатьPremier', true, true, true, true, true, true),
	(37,' Полиграф', true, true, true, false, true, true),
	(38,' Пульсар-98', true, true, true, false, true, false),
	(39,'Рекламщик', false, true, true, false, true, true),
	(40,'Сибирь', true, true, true, false, true, false),
	(41,'Синяя Птица', true, true, true, false, true, true),
	(42,'СКАЙ ПРИНТ', true, true, true, true, true, false),
	(43,'Советская Сибирь, ОАО, типография', true, true, true, false,  true, false),
	(44,'Стиль фирмы, ООО, полиграфическая компания', false, true, true, false, true, true),
	(45,'ТИСА, ООО, типография', true, true, true, false, true, false),
	(46,'Тритон Плюс, ООО, рекламно-производственная компания', false, true, true, false, true, false),
	(47,'Фото-М, фотоцентр', true, true, true, false, true, false),
	(48,'Центр Рекламы, рекламно-полиграфическое агентство', true, false, true, false, true,true);
	

INSERT INTO service (id, name, rating)
VALUES 
	(1, 'печать на футболках', 1),
	(2, 'печать на кружках', 2),
	(3, 'изготовление значков', 0),
	(4, 'широкоформатная печать', 3),
	(5, 'изготовление блокнотов', 0),
	(6, 'изготовление календарей', 4),
<<<<<<< HEAD
	(7, 'изготовление магнитов',6),
=======
	(7, 'изготовление магнитов', 6),
>>>>>>> 872f0ad126d479d34cb2b8d1081ef2b986a32bfc
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
	(6,8),
	(7,3),
	(8,1),
	(8,2),
	(8,4),
	(8,5),
	(8,6),
	(8,7),
	(9,4),
	(9,6),
	(9,8),
	(10,4),
	(10,6),
	(12,1),
	(12,2),
	(12,3),
	(12,4),
	(12,5),
	(12,6),
	(12,7),
	(12,8),
	(13,1),
	(13,2),
	(13,4),
	(13,5),
	(13,6),
	(14,1),
	(14,4),
	(14,5),
	(15,1),
	(15,2),
	(15,3),
	(15,4),
	(15,5),
	(15,6),
	(15,8),
	(16,1),
	(16,2),
	(16,3),
	(16,4),
	(16,6),
	(16,8),
	(17,1),
	(17,2),
	(17,3),
	(17,5),
	(17,6),
	(17,7),
	(18,4),
	(19,1),
	(19,2),
	(19,4),
	(19,5),
	(19,6),
	(19,7),
	(20,1),
	(20,2),
	(20,4),
	(20,6),
	(20,7),
	(21,1),
	(21,2),
	(21,3),
	(21,4),
	(21,7),
	(22,1),
	(22,2),
	(22,3),
	(22,5),
	(22,6),
	(22,7),
	(22,8),
	(23,1),
	(24,4),
	(24,5),
	(24,6),
	(24,8),
	(25,7),
	(26,4),
	(26,5),
	(26,6),
	(26,7),
	(27,2),
	(27,4),
	(27,5),
	(27,6),
	(28,1),
	(28,2),
	(28,3),
	(28,4),
	(28,5),
	(28,6),
	(28,7),
	(29,4),
	(29,5),
	(29,6),
	(30,4),
	(30,5),
	(30,6),
	(30,8),
	(31,2),
	(31,3),
	(31,4),
	(31,6),
	(31,8),
	(32,4),
	(33,1),
	(33,2),
	(33,4),
	(33,7),
	(34,5),
	(34,6),
	(36,5),
	(36,6),
	(37,2),
	(37,3),
	(37,5),
	(37,6),
	(37,7),
	(37,8),
	(38,1),
	(38,2),
	(38,6),
	(39,1),
	(39,4),
	(39,5),
	(39,6),
	(40,2),
	(40,3),
	(40,5),
	(40,6),
	(40,7),
	(40,8),
	(41,1),
	(41,2),
	(41,4),
	(41,5),
	(41,6),
	(42,5),
	(42,6),
	(42,7),
	(43,4),
	(43,5),
	(43,6),
	(44,1),
	(44,2),
	(44,3),
	(44,5),
	(44,6),
	(44,7),
	(45,4),
	(45,5),
	(45,6),
	(45,8),
	(46,1),
	(46,2),
	(46,5),
	(46,8),
	(47,1),
	(47,2),
	(47,7),
	(47,8),
	(48,4),
	(48,5),
	(48,6);

INSERT INTO contacts(polygraphy_id, addres, email, website, phone)
VALUES
	(1, 'ул. Масленникова, 28, офис 409', 'mail@901201.ru', 'http://www.dbiq.ru/', 3812901201),
	(2, 'Учебная, 83 - 311 офис; 3 этаж', 'original-omsk@yandex.ru', 'http://www.prostranstwo.blogspot.com', '3812510980'),
	(3, 'Индустриальная, 5а - 3 офис; 3 этаж', 'kraftline@mail.ru', 'http://www.kraftline.ru', '3812536241'),
	(4, 'Учебная, 79', 'zakaz@izbaprint.ru', 'http://www.izbaprint.ru/', '3812408889'),
	(5, 'ул. Ватутина 13а', 'futbolkaprint@mail.ru', 'http://www.futbolkaprint.com/', '3812740824'),
	(6, 'Краснофлотская, 24, этаж 2, офис 108', 'pxpomsk@gmail.com', 'http://www.print-x-press.ru/', '3812913903'),
	(7, 'ул. 2-я Солнечная, 31', 'office@kairos-firm.ru', 'http://www.kairos-firm.ru', '3812713617'),
	(8, '22 Партсъезда, 98 - 2 этаж', 'market@selbs.ru', 'http://www.selbs.ru', '661234'),
	(9, 'Комарова проспект, 2/2 - 521 бутик; 5 этаж; ТК МАЯК', 'markaomsk@yandex.ru', 'http://www.markaomsk.ru', '3812907531'),
	(10, '20 лет РККА, 300/14', '55print@mail.ru', 'http://www.55print.okis.ru', '3812294089'),
	(11, '10 лет Октября, 76 - 305 офис; 2 этаж', '282405@retrans55.ru', 'http://www.retrans55.ru', '3812563744'),
	(12, 'Декабристов, 45/1', 'first@companion55.ru', 'http://www.companion-omsk.ru', '3812399009'),
	(13, 'Гагарина, 8/1 - цокольный этаж', 'print55@list.ru', 'http://www.printservis-omsk.ru', ' 3812200714'),
	(14, 'Карла Маркса проспект, 18/4', 'avantaomsk@mail.ru', 'http://www.avantaomsk.com', '3812496377'),
	(15, 'Степанца, 10/4 - 401 офис; 4 этаж', 'info@omska.net', 'http://www.akula-reklama.ru', '9039276366'),
	(16, 'Красный Путь, 89 - 5 офис; 3 этаж', 'omsk@alvest.ru', 'http://www.alvest.ru', '3812799733'),
	(17, 'Карла Маркса проспект, 41 - 321 офис; 3 этаж', 'parus@nt55.ru', 'http://www.parusa55.ru', '3812 397746'),
	(18, 'Кемеровская, 1а', 'lfa-zakaz@inbox.ru', 'http://www.alfaprint55.ru', '9533999070'),
	(19, 'Красный Путь, 82а', 'vodniki2@yandex.ru', 'http://www.antares55.ru', '3812220548'),
	(20, '70 лет Октября, 25/2', 'wwwztatyana@mail.ru', 'http://wwwartcompany.blizko.ru', '9503371223'),
	(21, 'Карла Маркса проспект, 82 - 3п кабинет; 1 этаж; вход со двора', 'a3plus@bk.ru', 'http://а3плюс.рф', '3812417739'),
	(22, 'Фрунзе, 1 к1 - цокольный этаж', 'info.bumerang@mail.ru', 'http://www.bumerang55.ru', '207707'),
	(23, 'Ленинградская площадь, 1', 'print.omsk@vsemayki.ru', 'http://www.vsemayki.ru', '3812291220'),
	(24, 'Тарская, 13а - 1 этаж; ОЦ На Тарской', 'glprint@mail.ru', 'http://www.glprint.ru', '3812948343'),
	(26, '19 Партсъезда, 5 - 6а офис; 3 этаж', 'print@dimart55.ru', 'http://www.dimart55.ru', '638426'),
	(27, 'Орджоникидзе, 34', 'zakaz@omskblankizdat.ru', 'http://www.ztomsk.ru', '212111'),
	(28, 'Пушкина, 115 - 314 офис; 3 этаж', 'polisprint@mail.ru', 'http://www.polisprint.ru', '511575'),
	(29, 'Госпитальная, 24 - 2 этаж', 'info@mediaplus-omsk.ru', 'http://www.mediaplus-omsk.ru', '340634'),
	(30, 'Серова, 13 - 1 этаж', '400345@mail.ru', 'http://www.omskreklama.ru', '3812453245'),
	(31, 'Орджоникидзе, 45', 'zakaz@ompak.ru', 'http://www.ompak.ru', '212145'),
	(32, 'Куйбышева, 32', 'okf55@mail.ru', 'http://okf55.ru', '3812569609'),
	(33, 'Карла Маркса проспект, 29а - 55 отдел; цокольный этаж; центр Голубой огонек', 'grafion55@mail.ru', 'http://www.grafion.ru', '377981'),
	(34, '10 лет Октября, 127 - 406 офис; 4 этаж', 'officepol@mail.ru', 'http://www.officepol.nx0.ru', '3812320717'),
	(35, 'Карла Маркса проспект, 18/8 - 1 этаж', 'delo-print@yandex.ru', 'http://deloprint.com', '3812396418'),
	(36, 'Пушкина, 67 к1 - цокольный этаж; вход со двора', 'pechatpre@mail.ru', 'http://www.printomsk.ru', '9131485034'),
	(37, 'Карла Маркса проспект, 41/56 - 108 офис; 1 этаж', 'polygraph@omsknet.ru', 'http://www.polygraph-omsk.ru', '510039'),
	(38, 'Герцена, 65а - 1 этаж; вход с ул. Герцена', 'pulsar@sfko.ru', 'http://www.pulsar98.ru', '3812247853'),
	(39, '10 лет Октября, 127 - 406 офис; 4 этаж', 'zakaz@rekm.ru', 'http://www.рекламщик.рф', '591915'),
	(40, 'Суровцева, 30', 'tip-sib@mail.ru', 'http://www.tipsib.ru', '374224'),
	(41, 'Северная 24-я, 165', 'ofis325@mail.ru', 'http://www.suvenir55.ru', '212412'),
	(42, 'Маршала Жукова, 72 к1 - 407 офис; 4 этаж; БЦ Золотая миля', 'op@499363.ru', 'http://www.499363.ru', '9083153357'),
	(44, 'Химиков, 6/5', 'stil_55@mail.ru', 'http://www.stil55.com', '273327'),
	(45, 'Магистральный, Строителей, 7/1 - левое крыло; вход с торца', 'info@tisaomsk.ru', 'http://www.tisaomsk.ru', '309988'),
	(46, '10 лет Октября, 141', 'info@tritonplus.ru', 'http://www.tritonplus.ru', '489150'),
	(47, '10 лет Октября, 141а - 203 офис; 2 этаж; комплекс Статус 2009', 'fotom55@mail.ru', 'http://www.фото-эм.рф', '9040778818'),
	(48, 'Маршала Жукова, 72 к1 - цокольный этаж; центр Золотая миля', 'ra.cr@mail.ru', 'http://www.cr55.ru', '9502189427');

INSERT INTO contacts(polygraphy_id, addres, website, phone)
VALUES

	(25, 'Мира проспект, 34 - цокольный этаж', 'http://www.dizainproekt.nethouse.ru', '599809'),
	(43, 'Карла Маркса проспект, 39 - 318 офис; 3 этаж', 'http://sovsib.ru', '310745');
