create database usjtbanco1
default character set utf8
default collate utf8_general_ci;

create table pais (
id int auto_increment,
nome varchar(100),
populacao bigint,
area numeric(15.2),
primary key (id)
) default charset = utf8;


insert into pais
(nome, populacao, area)
values
('australia', '256633000', '7692024.00'),
('chile', '18050000', '756950.00')
('peru', '33105273', '1285220.00')
('Estados Unidos', '325719178', '9371175');

describe pais;
select * from pais;
