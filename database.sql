CREATE DATABASE JDBC_CRUD;

USE JDBC_CRUD;

CREATE TABLE employees (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(50) NOT NULL,
    email VARCHAR(50) NOT NULL,
    country VARCHAR(50) NOT NULL
);

INSERT INTO employees (name, email, country) VALUES ('John', 'abc@gmail.com', 'Portugal');
INSERT INTO employees (name, email, country) VALUES ('John D.', 'emp@gmail.com', 'Portugal');