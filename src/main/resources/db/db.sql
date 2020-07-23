CREATE DATABASE banklist;

CREATE TABLE `banklist`.`client`
(
  `id`      bigint(20)  NOT NULL AUTO_INCREMENT,
  `name`    varchar(45) NOT NULL,
  `surname` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
)
  ENGINE = InnoDB
  DEFAULT CHARSET = utf8;

CREATE TABLE `banklist`.`account`
(
  `id`      bigint(20) NOT NULL AUTO_INCREMENT,
  `account` bigint(45) NOT NULL,
  `userId`  bigint(45) NOT NULL,
  PRIMARY KEY (`id`)
)
  ENGINE = InnoDB
  DEFAULT CHARSET = utf8;

INSERT INTO `client` (name, surname) values ('Boo', 'The Ghost');
INSERT INTO `client` (name, surname) values ('Simon', 'The Cat');
INSERT INTO `client` (name, surname) values ('Shark', 'Doggy Dog');
INSERT INTO `client` (name, surname) values ('Winnie', 'The Pooh');
INSERT INTO `client` (name, surname) values ('Woody', 'Woodpecker');
INSERT INTO `client` (name, surname) values ('Mad Jack', 'The Pirate');

INSERT INTO `account` (account, userId) VALUES (100000, 2);
INSERT INTO `account` (account, userId) VALUES (111111, 4);
INSERT INTO `account` (account, userId) VALUES (121212, 1);
INSERT INTO `account` (account, userId) VALUES (555555, 5);
INSERT INTO `account` (account, userId) VALUES (333333, 3);
INSERT INTO `account` (account, userId) VALUES (444444, 4);
INSERT INTO `account` (account, userId) VALUES (222222, 2);
INSERT INTO `account` (account, userId) VALUES (313131, 4);
INSERT INTO `account` (account, userId) VALUES (154511, 5);
INSERT INTO `account` (account, userId) VALUES (888888, 2);
INSERT INTO `account` (account, userId) VALUES (120000, 6);
