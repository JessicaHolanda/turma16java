create database db_escolas;

use db_escolas;

create table tb_alunos(
id bigint auto_increment,
nome varchar(255) not null,
nota1 float,
nota2 float,
nota3 float,
media float,
primary key(id)
);

insert into tb_alunos (nome, nota1, nota2, nota3, media) values ("Jessica", 10, 9, 8, (nota1+nota2+nota3)/3);
insert into tb_alunos (nome, nota1, nota2, nota3, media) values ("Henrique", 10, 9, 10, (nota1+nota2+nota3)/3);
insert into tb_alunos (nome, nota1, nota2, nota3, media) values ("Vitoria", 7, 6, 8, (nota1+nota2+nota3)/3);
insert into tb_alunos (nome, nota1, nota2, nota3, media) values ("João", 5, 6, 6, (nota1+nota2+nota3)/3);
insert into tb_alunos (nome, nota1, nota2, nota3, media) values ("Julia", 7, 9, 8, (nota1+nota2+nota3)/3);
insert into tb_alunos (nome, nota1, nota2, nota3, media) values ("Raite", 10, 9, 7, (nota1+nota2+nota3)/3);
insert into tb_alunos (nome, nota1, nota2, nota3, media) values ("Paulo", 6, 6, 6, (nota1+nota2+nota3)/3);
insert into tb_alunos (nome, nota1, nota2, nota3, media) values ("Pedro", 8, 7, 8, (nota1+nota2+nota3)/3);

insert into tb_alunos (media) values ((nota1 + nota2 + nota3)/3);

select * from tb_alunos;

select nome, media from tb_alunos where media > 7;
select nome, media from tb_alunos where media < 7;

update tb_alunos set nota1 = 7 where id = 4;