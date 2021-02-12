create database db_ecommerce;

use db_ecommerce;

create table tb_produtos(
id bigint auto_increment,
descricao varchar(255) not null,
valor float not null,
qtd int not null,
genero varchar(255) not null,
autor varchar(255),
primary key (id)
);

insert into tb_produtos (descricao, valor, qtd, genero, autor) values ("Livro 1", 20.00, 10, "aventura", "George R R Martin");
insert into tb_produtos (descricao, valor, qtd, genero, autor) values ("Livro 2", 600.00, 10, "aventura", "George R R Martin");
insert into tb_produtos(descricao, valor, qtd, genero, autor) values ("Livro 3", 22.00, 10, "drama", "J R Holanda");
insert into tb_produtos (descricao, valor, qtd, genero, autor) values ("Livro 4", 23.00, 10, "terror", "Sawako");
insert into tb_produtos (descricao, valor, qtd, genero, autor) values ("Livro 5", 800.00, 10, "romance", "Henrique S");
insert into tb_produtos (descricao, valor, qtd, genero, autor) values ("Livro 6", 25.00, 10, "engenharia", "Wanda W");
insert into tb_produtos (descricao, valor, qtd, genero, autor) values ("Livro 7", 26.00, 10, "terror", "David L");
insert into tb_produtos (descricao, valor, qtd, genero, autor) values ("Livro 8", 27.00, 10, "drama", "John Green");

select * from tb_produtos;

select descricao, valor from  tb_produtos where valor > 500.00;
select descricao, valor from  tb_produtos where valor < 500.00;

update tb_produtos set qtd = (qtd + 6) where id = 1;

