SELECT id, name, addres, phone FROM polygraphy AS p LEFT JOIN contacts AS c ON p.id=c.polygraphy_id WHERE name='Оригинал';
