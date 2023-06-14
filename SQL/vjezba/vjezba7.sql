drop schema if exists vjezba7 cascade;
create schema vjezba7;

ALTER TABLE zarucnik_mladic DROP CONSTRAINT IF EXISTS zarucnik_mladic_zarucnik;
ALTER TABLE zarucnik_mladic DROP CONSTRAINT IF EXISTS zarucnik_mladic_mladic;
ALTER TABLE ostavljen DROP CONSTRAINT IF EXISTS ostavljen_zarucnik;
ALTER TABLE sestra DROP CONSTRAINT IF EXISTS sestra_prijateljica;
ALTER TABLE prijateljica DROP CONSTRAINT IF EXISTS prijateljica_ostavljen;
ALTER TABLE punica DROP CONSTRAINT IF EXISTS punica_cura;


CREATE TABLE if not exists zarucnik_mladic (
    sifra SERIAL PRIMARY KEY,
    zarucnik INT NOT NULL,
    mladic INT NOT NULL
);

create table if not exists mladic(
	sifra serial primary key,
	prstena int,
	lipa decimal(14,5) not null,
	narukvica boolean not null,
	drugiputa timestamp not null
);

create table if not exists ostavljen(
	sifra serial primary key,
	lipa decimal(14,6),
	introvertno bit not null,
	kratkamajica varchar(36) not null,
	prstena boolean not null,
	zarucnik int
);

create table if not exists zarucnik(
	sifra serial primary key,
	vesta varchar(34),
	asocijalno bit not null,
	modelnaocala varchar(43),
	narukvica int not null,
	novcica decimal(15,5)
);

create table if not exists sestra(
	sifra serial primary key,
	bojakose varchar(34) not null,
	hlace varchar(36) not null,
	lipa decimal(15,6),
	stilfrizura varchar(40) not null,
	maraka decimal(12,8) not null,
	prijateljica int
);

create  table if not exists prijateljica(
	sifra serial primary key,
	haljina varchar(45),
	gustoca decimal(14,5) not null,
	ogrlica int,
	novcica decimal(12,5),
	ostavljen int
);

create  table if not exists punica(
	sifra serial primary key,
	majica varchar(40),
	eura decimal(12,6) not null,
	prstena int,
	cura int not null
);

create  table if not exists cura(
	sifra serial primary key,
	lipa decimal(12,9) not null,
	introvertno booelan,
	modelnaocala varchar(40),
	narukvica boolean,
	treciputa timestamp,
	kuna decimal(14,9)
);

ALTER TABLE zarucnik_mladic
ADD CONSTRAINT zarucnik_mladic_zarucnik
FOREIGN KEY (zarucnik) REFERENCES zarucnik (sifra);

ALTER TABLE zarucnik_mladic
ADD CONSTRAINT zarucnik_mladic_mladic
FOREIGN KEY (mladic) REFERENCES mladic (sifra);

ALTER TABLE ostavljen
ADD CONSTRAINT ostavljen_zarucnik
FOREIGN KEY (zarucnik) REFERENCES zarucnik (sifra);

ALTER TABLE sestra
ADD CONSTRAINT sestra_prijateljica
FOREIGN KEY (prijateljica) REFERENCES prijateljica (sifra);

ALTER TABLE prijateljica
ADD CONSTRAINT prijateljica_ostavljen
FOREIGN KEY (ostavljen) REFERENCES ostavljen (sifra);

ALTER TABLE punica
ADD CONSTRAINT punica_cura
FOREIGN KEY (cura) REFERENCES cura (sifra);

insert  into zarucnik(vesta,asocijalno,modelnaocala,narukvica,novcica)
values 
	('plava','0','plave','narukvica 1','2,2'), 
	('crna','1','crna','narukvica 2','22,2'),
	('žuta','1','žuta','narukvica 3','23,2');
INSERT INTO ostavljen (lipa, introvertno, kratkamajica, prstena, zarucnik)
values 
	('12.345', true, 'Majica A', '1', 1),
    ('98.765', false, 'Majica B', '2', 2),
    ('65.43', true, 'Majica C', '3', 3);

INSERT INTO prijateljica (haljina, gustoca, ogrlica, novcica, ostavljen)
values ('Haljina A', 0.12345, 1, 10.5, 1),
    ('Haljina B', 0.98765, 2, 15.2, 2),
    ('Haljina C', 0.65432, 3, 20.8, 3);


INSERT INTO zarucnik_mladic (zarucnik, mladic)
VALUES
    (1, 1),
    (2, 2),
    (3, 3);
