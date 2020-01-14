drop table movie if exists;

CREATE TABLE Movie (
    id   INTEGER  NOT NULL AUTO_INCREMENT,
    title VARCHAR NOT NULL,
    length INT,
    rating FLOAT,
    genre VARCHAR,
    plot VARCHAR,
    PRIMARY KEY (id)
);
