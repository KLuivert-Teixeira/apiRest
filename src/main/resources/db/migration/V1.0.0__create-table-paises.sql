create table paises(

    id bigint not null auto_increment,
    nome varchar(30) not null,
    capital varchar(30) not null,
    regiao varchar(30) not null,
    sub_regiao varchar(30) not null,
    area varchar(20) not null,
    primary key(id)

);