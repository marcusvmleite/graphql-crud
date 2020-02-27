DROP ALL OBJECTS;

CREATE SEQUENCE IF NOT EXISTS PERSON_SEQ;

CREATE TABLE IF NOT EXISTS PERSON (
   id INT NOT NULL,
   name VARCHAR(50) NOT NULL,
   email VARCHAR(50) NOT NULL,
   age INT,
   created TIMESTAMP NOT NULL,
   updated TIMESTAMP NOT NULL,
   version INT NOT NULL,
   active INT NOT NULL DEFAULT 1
);

CREATE TABLE IF NOT EXISTS PRODUCT (
   id INT NOT NULL,
   name VARCHAR(36) NOT NULL,
   value NUMERIC NOT NULL,
   created TIMESTAMP NOT NULL,
   updated TIMESTAMP NOT NULL,
   version INT NOT NULL
);

CREATE TABLE IF NOT EXISTS ORDERING (
   id INT NOT NULL,
   person INT NOT NULL,
   status VARCHAR(36) NOT NULL,
   created TIMESTAMP NOT NULL,
   updated TIMESTAMP NOT NULL,
   version INT NOT NULL
);

CREATE TABLE IF NOT EXISTS ORDERING_PRODUCT (
    id INT NOT NULL,
    ordering INT NOT NULL,
    product INT NOT NULL,
    quantity INT NOT NULL
);