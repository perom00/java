DROP DATABASE if EXISTS vrtic;
CREATE DATABASE vrtic;
use vrtic;

CREATE TABLE osoba(
    sifra int not null PRIMARY key auto_increment,
    ime VARCHAR(20),
    prezime VARCHAR(20),
    oib CHAR(20)
);

CREATE TABLE odgajateljica(
    sifra int not null PRIMARY key auto_increment,
    osoba INT,
    iban char(15),
    kontakt char(15)
);

CREATE TABLE dijete(
    sifra INT NOT NULL PRIMARY key auto_increment,
    osoba INT,
    odgojna_skupina int,
    odgajateljica int,
    roditelj int
);

CREATE table odgojna_skupina(
    sifra int not null PRIMARY key auto_increment,
    odgajateljica int,
    dijete int,
    naziv varchar(50)
);

CREATE table djecji_vrtic(
    sifra int not null PRIMARY key auto_increment,
    odgajateljica int,
    odgojnaskupina int,
    dijete int not NULL,
    adresa VARCHAR(50),
    radnovrijeme datetime,
    naziv varchar(15),
    kapacitet char(100)
);

CREATE TABLE roditelj(
    sifra int not null primary key auto_increment,
    osoba int not null,
    kontakt char(15),
    email varchar(20)
);

ALTER table odgajateljica add FOREIGN KEY (osoba) REFERENCES osoba(sifra);
ALTER table odgojna_skupina ADD FOREIGN KEY (odgajateljica) REFERENCES dijete(sifra);
ALTER TABLE djecji_vrtic add FOREIGN KEY (odgajateljica) references odgajateljica(sifra);
ALTER TABLE djecji_vrtic ADD FOREIGN KEY (dijete) REFERENCES dijete(sifra);
ALTER table djecji_vrtic ADD FOREIGN KEY (odgojnaskupina) REFERENCES odgojna_skupina(sifra);
ALTER table dijete add FOREIGN KEY (roditelj) REFERENCES roditelj(sifra);


-- dijete
INSERT into osoba (ime,prezime,oib) VALUES ('Marija','Miric',515165151);
-- teta
INSERT into osoba (ime,prezime,oib) VALUES ('Mirna','Mik',225883);
-- mama 
INSERT into osoba (ime,prezime,oib) VALUES ('Marina','Miric',512165151);

insert into odgajateljica (osoba,iban,kontakt) values (2,"HR33333",09199952);
INSERT into dijete (osoba) VALUES (1);

insert into odgojna_skupina (odgajateljica, dijete, naziv) values (1,1,'Miševi');

INSERT into dijete (odgojna_skupina) values (1);
INSERT into dijete (odgajateljica) values (2);
insert into roditelj (osoba, kontakt, email) values (3,0911115,'mammirna@gmail.com');
INSERT into dijete (roditelj) values (1);

INSERT INTO djecji_vrtic (odgajateljica, odgojnaskupina,dijete,adresa,naziv,kapacitet) VALUES (1,1,1,'Osijek','sunce',27);

