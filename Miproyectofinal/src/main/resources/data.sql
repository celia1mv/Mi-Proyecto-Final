INSERT INTO `user` (`id`, `active`, `birth_date`, `date`, `email`, `first_surname`, `last_surname`, `name`, `password`, `phone`, `user_name`)
VALUES (1,1,'2022-05-08','2022-05-08','admin@gmail.com','admin','admin','admin','$2a$04$5sT3dri6bOOG2b9P1LETEujUeYMR46G/OVybuBjxBAohlEtDsxmi2','956783542','admin'),
       (2,1,'2022-05-08','2022-05-08','emingora@gmail.com','emingora','emingora','emingora','$2a$04$5sT3dri6bOOG2b9P1LETEujUeYMR46G/OVybuBjxBAohlEtDsxmi2','956783541','emingora'),
       (3,0,'2022-05-08','2022-05-08','emingora@gmail.com','nonactiveuser','nonactiveuser','nonactiveuser','$2a$04$5sT3dri6bOOG2b9P1LETEujUeYMR46G/OVybuBjxBAohlEtDsxmi2','956783540','nonactiveuser');

INSERT INTO `user` (`id`, `active`, `birth_date`, `date`, `email`, `first_surname`, `last_surname`, `name`, `password`, `phone`, `user_name`)
VALUES
    (4,1,'2022-05-08','2022-05-08','pepe@gmail.com','Garcia','Rodriguez','Pepe','$2a$04$5sT3dri6bOOG2b9P1LETEujUeYMR46G/OVybuBjxBAohlEtDsxmi2','956783542','pepe'),
    (5,1,'2022-05-08','2022-05-08','daniel@gmail.com','Perez','Callejo','Daniel','$2a$04$5sT3dri6bOOG2b9P1LETEujUeYMR46G/OVybuBjxBAohlEtDsxmi2','956783541','daniel'),
    (6,1,'2022-05-08','2022-05-08','antonio@gmail.com','Peralta','Castillo','Antonio','$2a$04$5sT3dri6bOOG2b9P1LETEujUeYMR46G/OVybuBjxBAohlEtDsxmi2','956783540','antonio'),
    (7,1,'2022-05-08','2022-05-08','laura@gmail.com','Martinez','Ruiz','Laura','$2a$04$5sT3dri6bOOG2b9P1LETEujUeYMR46G/OVybuBjxBAohlEtDsxmi2','956783540','laura'),
    (8,1,'2022-05-08','2022-05-08','enrique@gmail.com','Lopez','Gomez','Enrique','$2a$04$5sT3dri6bOOG2b9P1LETEujUeYMR46G/OVybuBjxBAohlEtDsxmi2','956783540','enrique');

INSERT INTO `role` (`id`, `role_name`)
VALUES
	(1,'ROLE_ADMIN'),
	(2,'ROLE_USER');

INSERT INTO `user_roles` (`users_id`, `roles_id`)
VALUES
	(1,1),
	(1,2),
	(2,2),
	(3,2),
    (4,2),
    (5,2),
    (6,2),
    (7,2),
    (8,2);


-- Menu
INSERT INTO `menu` (`id`, `description`, `app_order`, `active`, `url`)
VALUES
	(1,'Home',0, 1, '/'),
	(2,'Tasks',1, 1, '/tasks'),
	(3,'Admin',10, 1, '/admin'),
	(4,'Books',20, 1, '/books'),
	(5,'Books read',30, 1, '/booksread'),
	(6,'Books sold',40, 1, '/bookssolds');

INSERT INTO `menu_roles` (`menus_id`, `roles_id`)
VALUES
	(1,1),
	(1,2),
	(2,1),
	(2,2),
	(3,1),
    (4,1),
    (4,2),
    (5,1),
    (5,2),
    (6,1),
    (6,2);


INSERT INTO doggo.dog
(id,
age,
allergies,
compatible,
gender,
inf_additional,
microchip,
name,
race,
sterilized,
weight_kg)
VALUES
( 1, 2, 'yes',1,'F','X', 1,'Federica', 'dalmatian',1, 20),
( 2, 4, 'no',1,'M','X', 1,'Estanislao','bull dog',1,10),
( 3, 1, 'no',1,'M','My dog bite', 1,'Sigofredo','Chihuahua',1,3),
( 4, 7, 'yes',1,'F','X', 1,'Don Dog','beagle',1, 14),
( 5, 8, 'no',1,'F','X', 1,'Juanita','galgo', 1,18);

commit;