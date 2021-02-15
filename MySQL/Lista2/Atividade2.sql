create database db_pizzaria_legal;

use db_pizzaria_legal;

create table tb_categoria(
id bigint auto_increment,
Descricao varchar(255) not null,


primary key(id)
);

create table tb_pizza(
id bigint auto_increment,
Descricao varchar(255) not null,
Preco float not null,
Tamanho varchar(255) not null,
BordaRecheada boolean,
primary key(id)
);

