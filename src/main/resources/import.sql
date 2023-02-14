-- This file allow to write SQL commands that will be emitted in test and dev.
-- The commands are commented as their support depends of the database
-- insert into myentity (id, field) values(nextval('hibernate_sequence'), 'field-1');
-- insert into myentity (id, field) values(nextval('hibernate_sequence'), 'field-2');
-- insert into myentity (id, field) values(nextval('hibernate_sequence'), 'field-3');

--INSERT INTO customer
--(id, names, first_last_name, second_last_name, business_name, document_type_code, document_number, birthdate, address, phone, email)
--VALUES
--(nextval('hibernate_sequence'), 'Rafael', 'Ruiz', 'Membrillo', 'R39 S.A.C.', '1', '12345678910', '2023-02-03', 'Tantamayo', '999999999', 'rafo@nttd.com');
--(nextval('hibernate_sequence'), 'Sandra', 'Ruiz', 'Membrillo', 'Sabor Urbano S.A.C.', '2', '12345678910', '2023-02-03', 'Tantamayo', '999999999', 'sandra@nttd.com');
--(nextval('hibernate_sequence'), 'Gabriel', 'Rosco', 'Ruiz', 'Gabito S.A.C.', '3', '12345678910', '2023-02-03', 'Tantamayo', '999999999', 'gabito@nttd.com');

INSERT INTO customer VALUES (nextval('hibernate_sequence'), 'Rafael', 'Ruiz', 'Membrillo', 'R39 S.A.C.', '1', '1', '2023-02-03', 'Tantamayo', '999999999', 'rafo@nttd.com',0);
INSERT INTO customer VALUES (nextval('hibernate_sequence'), 'Sandra', 'Ruiz', 'Membrillo', 'Sabor Urbano S.A.C.', '2', '2', '2023-02-03', 'Tantamayo', '999999999', 'sandra@nttd.com',1);
INSERT INTO customer VALUES (nextval('hibernate_sequence'), 'Gabriel', 'Rosco', 'Ruiz', 'Gabito S.A.C.', '3', '3', '2023-02-03', 'Tantamayo', '999999999', 'gabito@nttd.com',1);