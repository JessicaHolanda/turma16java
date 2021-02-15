create database db_generation_game_online;

use db_generation_game_online;

create table tb_classes(
id bigint auto_increment,
DescrClasse varchar(255) not null,
PoderAtaque float not null,
PoderDefesa float not null,
primary key(id)
);

insert into tb_classes(DescrClasse, PoderAtaque, PoderDefesa) values ("Arqueiro", 3100, 900);
insert into tb_classes(DescrClasse, PoderAtaque, PoderDefesa) values ("Assassino", 2800, 1200);
insert into tb_classes(DescrClasse, PoderAtaque, PoderDefesa) values ("Curandeiro", 1800, 2200);
insert into tb_classes(DescrClasse, PoderAtaque, PoderDefesa) values ("Feiticeiro", 3200, 800);
insert into tb_classes(DescrClasse, PoderAtaque, PoderDefesa) values ("Paladino", 1000, 3000);

select * from tb_classes;

create table tb_personagens(
id bigint auto_increment,
NomePersonagem varchar(255) not null,
LevelPersonagem int not null,
Raca varchar(255) not null,
Hp float not null,
Mana float not null,
classe_id bigint,
primary key(id),
foreign key (classe_id) references tb_classes (id)
);

insert into tb_personagens(NomePersonagem, LevelPersonagem, Raca, Hp, Mana, classe_id) values ("Meganekko", 12, "Elfo", 6000, 2000, 4);
insert into tb_personagens(NomePersonagem, LevelPersonagem, Raca, Hp, Mana, classe_id) values ("Ichigo", 8, "Fada", 5000, 2000, 3);
insert into tb_personagens(NomePersonagem, LevelPersonagem, Raca, Hp, Mana, classe_id) values ("Rengar", 10, "Humano", 5000, 1600, 2);
insert into tb_personagens(NomePersonagem, LevelPersonagem, Raca, Hp, Mana, classe_id) values ("Luna", 9, "Elfo", 5000, 2600, 1);
insert into tb_personagens(NomePersonagem, LevelPersonagem, Raca, Hp, Mana, classe_id) values ("Tywin", 14, "Meio Demonio", 6200, 2300, 4);
insert into tb_personagens(NomePersonagem, LevelPersonagem, Raca, Hp, Mana, classe_id) values ("Hitomi", 12, "Humana", 5000, 2000, 1);
insert into tb_personagens(NomePersonagem, LevelPersonagem, Raca, Hp, Mana, classe_id) values ("Brienne", 10, "Humana", 8000, 1800, 5);
insert into tb_personagens(NomePersonagem, LevelPersonagem, Raca, Hp, Mana, classe_id) values ("Hicones", 11, "Meio Anjo", 6500, 2300, 5);

select * from tb_personagens;

SELECT tb_personagens.NomePersonagem, tb_classes.DescrClasse, tb_classes.PoderAtaque 
	FROM tb_personagens INNER JOIN tb_classes 	
	on tb_personagens.classe_id = tb_classes.id
	where tb_classes.PoderAtaque > 2000;
    
SELECT tb_personagens.NomePersonagem, tb_classes.DescrClasse, tb_classes.PoderDefesa
	FROM tb_personagens INNER JOIN tb_classes 	
	on tb_personagens.classe_id = tb_classes.id
	where tb_classes.PoderDefesa Between 1000 AND 2000;

SELECT NomePersonagem from tb_personagens Where NomePersonagem LIKE "%c%";

SELECT tb_personagens.NomePersonagem, tb_classes.DescrClasse
	FROM tb_personagens INNER JOIN tb_classes 	
	on tb_personagens.classe_id = tb_classes.id
	where tb_classes.DescrClasse = "Arqueiro";





