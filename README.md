# MapSQL
A simple in‐memory database management system (MapSQL) implemented in Java.

Testing statement(run shell.java):

Create Table
CREATE TABLE contacts(id INT AUTO_INCREMENT, name CHAR(30) NOT NULL, email CHAR(30));

Insert records
INSERT INTO contacts(name,email) VALUES('Rem','Rem.collier@ucd.ie');
INSERT INTO contacts(name,email) VALUES('Tom','Tom.smith@ucd.ie');

Check records
SELECT * FROM contacts WHERE id < 2;
SELECT * FROM contacts WHERE id = 2;
SELECT * FROM contacts WHERE id > 2;
SELECT * FROM contacts;

Check whether not null columns have been missed
INSERT INTO contacts(email) VALUES('Henry');

Update records
UPDATE contacts SET name = "Lucy" WHERE id = 1;

Delete records
DELETE FROM contacts WHERE id =1;

Delete Table
DROP TABLE contacts;

Parse file
SOURCE 'test.sql';

Quit sql system
QUIT;
