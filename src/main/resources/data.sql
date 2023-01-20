drop table if exists Person;

create table Person
(
    id int auto_increment primary key,

    Name VARCHAR(25) NOT NULL,

    LocationType VARCHAR(15),

    City VARCHAR(15),

    ZipCode VARCHAR(15),

    BirthDate DATE,

    Number INTEGER NOT NULL
);

insert into Person values (1,'Marllone', 'Prédio', 'Itaboraí', '24855-072', '2022-12-31', 23);