create database streaming
default character set utf8mb4
default collate utf8mb4_general_ci;
use streaming;

create table series(
id int not null auto_increment,
titulo varchar (40) unique,
genero varchar (10),
num_temporadas int (20),
primary key (id)
)default charset = utf8mb4;

insert into series values 
(default, 'serie1', 'ação', '5'),
(default, 'serie2', 'terror', '7');
