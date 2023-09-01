CREATE DATABASE IF NOT EXISTS adlister_db;

SHOW DATABASES;

CREATE USER 'adlister1'@'localhost' IDENTIFIED BY 'pass';

GRANT ALL ON adlister_db.* TO 'adlister1'@'localhost';

SELECT user, host FROM mysql.user;




