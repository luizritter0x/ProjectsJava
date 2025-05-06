create database escola
default character set utf8mb4
default collate utf8mb4_general_ci;

create table alunos(
id int not null auto_increment,
nome varchar(30) not null,
nascimento date,
turma varchar(2) not null,
email varchar(30),
primary key (id)
)default charset = utf8mb4;

select * from alunos;


insert into alunos values
(default, 'João', '2005-03-15','8A', 'joao.silva@email.com'),
(default, 'Victor', '2004-02-15', '8A', 'victor.carvalho@email.com'),
(default, 'Bryan', '2007-11-30', '9A', default),
(default, 'Pedro', '2008-09-03', '8A', default),
(default, 'Silvio','2009-10-26', '8A', default);
 
 update alunos
 set turma = '8B'
 where id = 1
 limit 1;
 
 update alunos
 set turma = '8B'
 where id = 2
 limit 1;
 
 update alunos
 set turma = '8B'
 where id = 4
 limit 1;
 
 update alunos
 set turma = '8B'
 where id = 5
 limit 1;
 
 delete from alunos
 where turma = '8B'
 limit 5;
 
 truncate table alunos;
 
 update alunos
 set email = 'joao.silva@novoemail.com'
 limit 1;
 
 delete from alunos
 where id = 5
 limit 1;
 
 update alunos
 set nascimento = date_sub(nascimento, interval 1 year)
 limit 5;
 
 delete from alunos
 where email is null
 limit 5;
 
 create table professores(
 id int not null auto_increment,
 nome varchar(30) not null,
 disciplina varchar(30) not null,
 salário decimal(6,2),
 primary key (id)
 )default charset = utf8mb4;
 
 insert into professores values
 (default, 'Bryan','Português', '3300.00'),
 (default, 'Vitor','Matemática', '5000.00'),
 (default, 'Zerisvaldo','Química', '7000.00'),
 (default, 'Irineu','Física', '9000.00');
 
 update professores 
 set salário = salário * 1.10
 where id = 1;
 
 update professores
 set salário = salário * 1.10
 where id = 2;
 
 drop table professores;
 
 delete from professores
 where id = 1
 limit 1;
 
 delete from professores 
 where id = 2
 limit 1;
 
 delete from professores
 where id = 3
 limit 1;
 
 update professores 
 set disciplina = 'Diretor'
 where salário > 5000
 limit 2;
 
 select * from professores;
 
 drop table alunos;
 
 