create database db_servico_rh;

use db_servico_rh;

create table tb_funcionarios(
id bigint auto_increment,
nome varchar(255) not null,
idade int not null,
salario float not null,
cargo varchar(255) not null,
setor varchar(255) not null,
primary key(id)
);

select * from tb_funcionarios;

insert into tb_funcionarios (nome, idade, salario, cargo, setor) values ("Jessica", 27, 10000, "Desenvolvedora Java",  "Desenvolvimento");
insert into tb_funcionarios (nome, idade, salario, cargo, setor) values ("Henrique", 25, 10000, "Desenvolvedor Java",  "Desenvolvimento");
insert into tb_funcionarios (nome, idade, salario, cargo, setor) values ("Juliana", 28, 1000, "Estagiaria",  "RH");
insert into tb_funcionarios (nome, idade, salario, cargo, setor) values ("Pedro", 29, 1500, "Recepcionista",  "Administração");
insert into tb_funcionarios (nome, idade, salario, cargo, setor) values ("Luiza", 21, 1600, "Estagiaria",  "Desenvolvimento");

select nome, salario from  tb_funcionarios where salario > 2000;
select nome, salario from  tb_funcionarios where salario < 2000;

update tb_funcionarios set salario = 1500 where id = 3;



