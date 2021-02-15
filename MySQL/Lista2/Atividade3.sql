create database db_farmacia_do_bem;

use db_farmacia_do_bem;

create table tb_categoria(
id bigint auto_increment,
Nome varchar(255) not null,
Indicacao varchar(255) not null,
primary key(id)
);

insert into tb_categoria (Nome, Indicacao) values ("Analgésico", "Dor, Febre e Contusão");
insert into tb_categoria (Nome, Indicacao) values ("Antiácido", "Aparelho Digestivo");
insert into tb_categoria (Nome, Indicacao) values ("Antibiotico", "Infecções");
insert into tb_categoria (Nome, Indicacao) values ("Anti-inflamatório", "Dor, Febre e Contusão");
insert into tb_categoria (Nome, Indicacao) values ("Relaxante Muscular", "Dor, Febre e Contusão");

select * from tb_categoria;

create table tb_produto (
id bigint auto_increment,
Nome varchar(255) not null,
Descricao varchar(255) not null,
Fabricante varchar(255) not null,
Preco float not null,
Tarja varchar(255),
categoria_id bigint,
primary key(id),
foreign key (categoria_id) references tb_categoria (id)
);

insert into tb_produto (Nome, Descricao, Fabricante, Preco, Tarja, categoria_id) values ("Dipirona Gotas", "caixa com 1 frasco com 20mL", "Neo Química", 3.99, "Amarela", 1 );
insert into tb_produto (Nome, Descricao, Fabricante, Preco, Tarja, categoria_id) values ("Paracetamol Comprimido", "20 comprimidos revestidos", "Biosintética",  7.49, "Amarela", 1);
insert into tb_produto (Nome, Descricao, Fabricante, Preco, Tarja, categoria_id) values ("Sonrisal", "Comprimidos efervescentes", "GSK", 1.9, "Sem tarja", 2);
insert into tb_produto (Nome, Descricao, Fabricante, Preco, Tarja, categoria_id) values ("Eno Tabs", "caixa com 8 comprimidos mastigáveis", "GSK", 5.4, "Sem tarja", 2);
insert into tb_produto (Nome, Descricao, Fabricante, Preco, Tarja, categoria_id) values ("Nebacetin", "pomada de uso dermatológico", "Takeda", 14.99, "Sem tarja", 3);
insert into tb_produto (Nome, Descricao, Fabricante, Preco, Tarja, categoria_id) values ("Amoxicilina", "caixa com 14 comprimidos", "Eurofarma", 38.99, "Vermelha", 3);
insert into tb_produto (Nome, Descricao, Fabricante, Preco, Tarja, categoria_id) values ("Nimesulida", "caixa com 12 comprimidos", "EMS", 8.28, "Vermelha", 4);
insert into tb_produto (Nome, Descricao, Fabricante, Preco, Tarja, categoria_id) values ("Advil", "8 cápsulas líquidas", "Wyeth/Pfizer", 9.80, "Sem tarja", 5);

select * from tb_produto;

SELECT Nome, Preco FROM tb_produto where Preco > 50;

SELECT Nome, Preco FROM tb_produto where Preco Between 3 AND 60;

SELECT Nome from tb_produto Where Nome LIKE "%b%";

SELECT tb_produto.Nome, tb_categoria.Nome, tb_categoria.Indicacao
	FROM tb_produto INNER JOIN tb_categoria 	
	on tb_produto.categoria_id = tb_categoria.id
	where tb_categoria.Nome = "Antibiotico";







