select * from alunos;

select * from alunos
where nome
in ('João');

select * from alunos
order by nascimento asc;

insert into alunos values
(default, 'Luiz', '2005-05-12', '8B', 'luizritter@email.com', 'Brasil'),
(default, 'Maria', '2006-09-23', '8B', 'mariaescura@email.com', 'Tailandia');

desc alunos;

select nome from alunos;

select nascimento from alunos
where nascimento = '2016/12/31' or nascimento < '2016/12/31'; -- Essa questão vale pela questão 6

select * from alunos
where nascimento between '2004-03-15' and '2007-11-30';

select * from alunos
where nome = 'João' and  nascimento = '2004-03-15';

select * from alunos
where nome = 'João' or nome = 'Bryan';

select * from alunos
where nascimento
in ('2007-11-30','2007-11-30');

select *from alunos where nacionalidade = 'Brasil'
UNION select * from alunos where nacionalidade = 'Londres';

select * from alunos
where nome like 'ma%';

select * from alunos
where nome like 'ma___';

select distinct nacionalidade from alunos;

select count(nome) from alunos;

select * from professores;
select avg(salário) from professores;

select * from professores;
select max(salário) from professores;

select min(salário) from professores;