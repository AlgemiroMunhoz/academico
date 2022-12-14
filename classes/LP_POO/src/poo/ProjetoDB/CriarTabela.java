package poo.ProjetoDB;

CREATE TABLE
    tb_user (
        id int not null auto_increment,
        username varchar(255),
        password varchar(255),
        status int,
        token double,
        PRIMARY KEY (id)
    );

CREATE TABLE
    tb_carro (
        id int not null auto_increment,
        name varchar(255),
        ano int,
        modelo varchar(255),
        preco double,
        PRIMARY KEY (id)
    )
    
SELECT
    *
FROM
    tb_carro;