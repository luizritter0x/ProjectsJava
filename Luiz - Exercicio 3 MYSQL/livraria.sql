create database livraria
default character  set utf8mb4
default collate utf8mb4_general_ci;
use livraria;

create table livros(
titulo varchar (25),
autor varchar (25),
ano_publicacao int (4)
)default charset = utf8mb4;

alter table livros 
add column id int not null auto_increment primary key first;

desc livros;
alter table livros
add column estoque int (6) default (0);

select * from livros;

insert into livros values
(default, 'livro1', 'autor1', '2005',default),
(default, 'livro2', 'autor2', '2010','50'),
(default, 'livro3', 'autor3', '2015', '200');
drop table if exists livros;




