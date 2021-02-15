create database db_cursoDaMinhaVida;

use db_cursoDaMinhaVida;

create table tb_categoria(
id bigint auto_increment,
Nome varchar(255) not null,
PossuiCertificado boolean not null,
primary key(id)
);

insert into tb_categoria (Nome, PossuiCertificado) values ("Desenvolvimento", true);
insert into tb_categoria (Nome, PossuiCertificado) values ("Design", true);
insert into tb_categoria (Nome, PossuiCertificado) values ("Finanças", false);
insert into tb_categoria (Nome, PossuiCertificado) values ("Marketing", true);
insert into tb_categoria (Nome, PossuiCertificado) values ("Música", false);

select * from tb_categoria;

create table tb_curso (
id bigint auto_increment,
Nome varchar(255) not null,
Preco float not null,
Duracao varchar(255) not null,
Nivel varchar(255) not null,
Categoria_id bigint,
primary key(id),
foreign key(Categoria_id) references tb_categoria (id)
);

insert into tb_curso (Nome, Preco, Duracao, Nivel, Categoria_id) values ("Java", 90.00, "80 horas", "Avançado", 1);
insert into tb_curso (Nome, Preco, Duracao, Nivel, Categoria_id) values ("Spring Boot", 60.00, "40 horas", "Intermediário", 1);
insert into tb_curso (Nome, Preco, Duracao, Nivel, Categoria_id) values ("Web Design", 29.90, "20 horas", "Iniciante", 2);
insert into tb_curso (Nome, Preco, Duracao, Nivel, Categoria_id) values ("Design Thinking", 45.00, "16 horas", "Intermediário", 2);
insert into tb_curso (Nome, Preco, Duracao, Nivel, Categoria_id) values ("Finanças corporativas", 65.00, "30 horas", "Avançado", 3);
insert into tb_curso (Nome, Preco, Duracao, Nivel, Categoria_id) values ("Marketing Digital", 54.90, "25 horas", "Intermediário", 4);
insert into tb_curso (Nome, Preco, Duracao, Nivel, Categoria_id) values ("Marketing de Aplicativos", 40.00, "30 horas", "Avançado", 4);
insert into tb_curso (Nome, Preco, Duracao, Nivel, Categoria_id) values ("Iniciando no Violão", 59.00, "20 horas", "Iniciante", 5);

select * from tb_curso;

SELECT Nome, Preco FROM tb_curso where Preco > 50;

SELECT Nome, Preco FROM tb_curso where Preco Between 3 AND 60;

SELECT Nome from tb_curso Where Nome LIKE "%j%";

SELECT tb_curso.Nome, tb_curso.Nivel, tb_categoria.Nome
	FROM tb_curso INNER JOIN tb_categoria 	
	on tb_curso.categoria_id = tb_categoria.id
	where tb_Categoria.Nome = "Desenvolvimento";
