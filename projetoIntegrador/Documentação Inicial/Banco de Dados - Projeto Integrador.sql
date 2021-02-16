CREATE TABLE tb_produto (
	id INT NOT NULL AUTO_INCREMENT,
	nomeProduto varchar(255) NOT NULL,
	descricao varchar(255) NOT NULL,
	quantidade INT NOT NULL,
	preco DECIMAL NOT NULL,
	categoria_id INT NOT NULL,
	PRIMARY KEY (id)
);

CREATE TABLE tb_categoria (
	id INT NOT NULL AUTO_INCREMENT,
	nomeCategoria varchar(255) NOT NULL,
	subCategoria varchar(255) NOT NULL,
	ativo BOOLEAN NOT NULL,
	PRIMARY KEY (id)
);

CREATE TABLE tb_usuario (
	id INT NOT NULL AUTO_INCREMENT,
	nomeCompleto varchar(255) NOT NULL,
	email varchar(255) NOT NULL,
	senha varchar(255) NOT NULL,
	PRIMARY KEY (id)
);

ALTER TABLE tb_produto ADD CONSTRAINT tb_produto_fk0 FOREIGN KEY (categoria_id) REFERENCES tb_categoria(id);