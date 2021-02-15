create database db_pizzaria_legal;

use db_pizzaria_legal;

create table tb_categoria(
id bigint auto_increment,
Nome varchar(255) not null,
Descricao varchar(255) not null,
primary key(id)
);

insert into tb_categoria (Nome, Descricao) values ("Especialidades", "Mais famosas");
insert into tb_categoria (Nome, Descricao) values ("Premium", "Especiais");
insert into tb_categoria (Nome, Descricao) values ("Super Premium", "Soberanas");
insert into tb_categoria (Nome, Descricao) values ("Promoção", "Promoções da semana");
insert into tb_categoria (Nome, Descricao) values ("Pizza Doce", "Sobremesas");

select * from tb_categoria;

create table tb_pizza(
id bigint auto_increment,
Descricao varchar(255) not null,
Preco float not null,
Tamanho varchar(255) not null,
BordaRecheada boolean,
Categoria_id bigint,
primary key(id),
foreign key (Categoria_id) references tb_categoria (id)
);

insert into tb_pizza (Descricao, Preco, Tamanho, BordaRecheada, Categoria_id) values ("Margherita", 38.00, "Média", true, 1);
insert into tb_pizza (Descricao, Preco, Tamanho, BordaRecheada, Categoria_id) values ("Veggie", 55.00, "Média", false, 2);
insert into tb_pizza (Descricao, Preco, Tamanho, BordaRecheada, Categoria_id) values ("Catuperoni", 36.00, "Pequena", false, 2);
insert into tb_pizza (Descricao, Preco, Tamanho, BordaRecheada, Categoria_id) values ("Búfala La Bianca", 65, "Grande", true, 3);
insert into tb_pizza (Descricao, Preco, Tamanho, BordaRecheada, Categoria_id) values ("Calabresa", 34.00, "Média", true, 4);
insert into tb_pizza (Descricao, Preco, Tamanho, BordaRecheada, Categoria_id) values ("Frango", 34.00, "Média", false, 4);
insert into tb_pizza (Descricao, Preco, Tamanho, BordaRecheada, Categoria_id) values ("Brigadeiro", 45.00, "Média", false, 5);
insert into tb_pizza (Descricao, Preco, Tamanho, BordaRecheada, Categoria_id) values ("Doce de Leite", 37, "Pequena", false, 5);

select * from tb_pizza;

SELECT Descricao, Preco FROM tb_pizza where Preco > 45;

SELECT Descricao, Preco FROM tb_pizza where Preco Between 29 AND 60;

SELECT Descricao from tb_pizza Where Descricao LIKE "%c%";

SELECT tb_pizza.Descricao, tb_pizza.Preco, tb_categoria.Nome
	FROM tb_pizza INNER JOIN tb_categoria 	
	on tb_pizza.Categoria_id = tb_categoria.id
	where tb_Categoria.Nome = "Promoção";