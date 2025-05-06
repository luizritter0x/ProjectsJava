create database rh
default character set utf8mb4
default collate utf8mb4_general_ci;
use rh;

create table funcionarios(
nome varchar (40),
cargo varchar (40),
salario decimal (7,2)
)default charset = utf8mb4;
drop table funcionarios;

alter table funcionarios
add column id int not null auto_increment primary key first;

insert into funcionarios values
(default, 'Luiz', 'gerente', '2000.00');

alter table funcionarios
rename column salario to remuneracao;

