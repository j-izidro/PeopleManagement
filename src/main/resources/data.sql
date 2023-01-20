drop table if exists Person;

create table Person
(
    id int auto_increment primary key not null,

    name VARCHAR(25) NOT NULL,

    location_type VARCHAR(15),

    city VARCHAR(15),

    zip_code VARCHAR(15),

    birth_date DATE,

    number INTEGER NOT NULL
);

insert into Person values (1, 'Jéssica', 'Prédio', 'Itaboraí', '24855-072', '2022-12-31', 23);