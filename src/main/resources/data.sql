INSERT INTO users (id, active, birth_date, date_initial, email, surname, name, password, phone, user_name)
VALUES (1,1,'2022-05-08','2022-05-08','admin@gmail.com','admin','admin','$2a$04$UWl44lyROes50n/qHGQKbu.3JwDMXkZZSaL1Tz5V7IF4EORU6p2fG','956783542','admin'),
       (2,1,'2022-05-08','2022-05-08','emingora@gmail.com','emingora','emingora','$2a$04$UWl44lyROes50n/qHGQKbu.3JwDMXkZZSaL1Tz5V7IF4EORU6p2fG','956783541','emingora'),
       (3,0,'2022-05-08','2022-05-08','emingora@gmail.com','nonactiveuser','nonactiveuser','$2a$04$5sT3dri6bOOG2b9P1LETEujUeYMR46G/OVybuBjxBAohlEtDsxmi2','956783540','nonactiveuser'),
       (4,1,'2022-05-08','2022-05-08','pepe@gmail.com','Garcia Rodriguez','Pepe','$2a$04$5sT3dri6bOOG2b9P1LETEujUeYMR46G/OVybuBjxBAohlEtDsxmi2','956783542','pepe'),
       (5,1,'2022-05-08','2022-05-08','daniel@gmail.com','Perez Callejo','Daniel','$2a$04$5sT3dri6bOOG2b9P1LETEujUeYMR46G/OVybuBjxBAohlEtDsxmi2','956783541','daniel'),
       (6,1,'2022-05-08','2022-05-08','antonio@gmail.com','Peralta Castillo','Antonio','$2a$04$5sT3dri6bOOG2b9P1LETEujUeYMR46G/OVybuBjxBAohlEtDsxmi2','956783540','antonio'),
       (7,1,'2022-05-08','2022-05-08','laura@gmail.com','Martinez Ruiz','Laura','$2a$04$5sT3dri6bOOG2b9P1LETEujUeYMR46G/OVybuBjxBAohlEtDsxmi2','956783540','laura'),
       (8,1,'2022-05-08','2022-05-08','enrique@gmail.com','Lopez Gomez','Enrique','$2a$04$5sT3dri6bOOG2b9P1LETEujUeYMR46G/OVybuBjxBAohlEtDsxmi2','956783540','enrique');
INSERT INTO users (id, user_name, password, date_initial, active)
VALUES (99999,'default','$2a$04$5sT3dri6bOOG2b9P1LETEujUeYMR46G/OVybuBjxBAohlEtDsxmi2','2022-05-08',1);

INSERT INTO role (id, role_name)
VALUES
	  (1,'ROLE_ADMIN'),
	  (2,'ROLE_USER'),
	  (3,'ROLE_DOGWALKER'),
      (4,'ROLE_DAYCARE'),
      (5,'ROLE_ANONYMOUS');

INSERT INTO user_role (user_id, role_id)
VALUES
--ADMINISTRADOR CON TODOS LOS ROLES
    (1,1),
    (1,2),
    (1,3),
    (1,4),
-- ROLE_USER
    (2,2),
    (3,2),
 --ROLE_USER + ROLE_DOGWALKER
    (4,2),
    (4,3),
    (5,2),
    (5,3),
 --ROLE_USER + ROLE DAYCARE
    (6,2),
    (6,4),
    (7,2),
    (7,4),
--ROLE ANONYMOUS
    (99999,5);

-- Menu
INSERT INTO menu (id, description, app_order, active, url)
VALUES
    (1,'Home',0, 1, '/'),
    (2,'Tasks',1, 1, '/tasks'),
    (3,'Admin',10, 1, '/admin'),
    (4,'Daycare',20, 1, '/Daycare'),
    (5,'DogWalker',30, 1, '/Dogwalker'),
    (9,'Login',1000, 1, '/login');

INSERT INTO menu_role(menu_id, role_id)
VALUES
--HOME -> TODOS
    (1,1),
    (1,2),
    (1,3),
    (1,4),

--TASK -> TODOS
    (2,1),
    (2,2),
    (2,3),
    (2,4),
--ADMIN -> ADMIN
    (3,1),
--DAYCARE -> ADMIN Y USER
    (4,1),
    (4,2),
--DOGWALKER -> ADMIN Y USER
    (5,1),
    (5,2),
--ANONYMOUS
    (1,5),
    (9,5);



INSERT INTO dog (id, age, allergies, compatible, gender, inf_additional, microchip, name, race, sterilized, weight_kg)
VALUES
( 1, 2, 'yes',1,'F','X', 1,'Federica', 'dalmatian',1, 20),
( 2, 4, 'no',1,'M','X', 1,'Estanislao','bull dog',1,10),
( 3, 1, 'no',1,'M','My dog bite', 1,'Sigofredo','Chihuahua',1,3),
( 4, 7, 'yes',1,'F','X', 1,'Don Dog','beagle',1, 14),
( 5, 8, 'no',1,'F','X', 1,'Juanita','galgo', 1,18);

INSERT INTO daycare (id,name,night_price,phone,email,ranking,address)
VALUES
  ( 1, 'pets junior',25,'666777888','pruebaguarderia@gmail.com', 7,'cipreses 124'),
  ( 2, 'pets seniors',23,'666777888','pruebaguarderia@gmail.com', 7,'malaga 90'),
  ( 3, 'dogs seniors',15,'666777888','pruebaguarderia@gmail.com', 7,'cinturon 66'),
  ( 4, 'dogs junios',10,'666777888','pruebaguarderia@gmail.com', 7,'alcorcon 39'),
  ( 5, 'pipi junios',5,'666777888','pruebaguarderia@gmail.com', 7,'sevilla 8');

UPDATE users SET dog_id = 1 WHERE id = 1 AND id = 5;
UPDATE users SET dog_id = 2 WHERE id = 3;
UPDATE users SET dog_id = 3 WHERE id = 6;
UPDATE users SET dog_id = 4 WHERE id = 8;
UPDATE users SET dog_id = 5 WHERE id = 2;

commit;