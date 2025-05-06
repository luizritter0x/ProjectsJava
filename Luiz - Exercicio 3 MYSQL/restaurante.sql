create database restaurante
default character set utf8mb4
default collate utf8mb4_general_ci;
use restaurante;

create table pratos(
nome varchar (25),
descricao text,
preco decimal (7,2)
)default charset = utf8mb4;

alter table pratos
add column id int not null auto_increment primary key;