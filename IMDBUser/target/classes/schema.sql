drop table User if exists;

CREATE TABLE USER (ID INT NOT NULL AUTO_INCREMENT,
   name VARCHAR,
   email VARCHAR,
   PRIMARY KEY(ID)
);