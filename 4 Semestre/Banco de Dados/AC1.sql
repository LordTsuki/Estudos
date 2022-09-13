CREATE TABLE Raca(
	IDRaca int not null identity,
	Nome varchar(100) not null,
	Descricao varchar(500),
	Origem varchar(150) not null,
	Perdido datetime not null,
	CONSTRAINT PKRaca PRIMARY KEY (IDRaca)
)

CREATE TABLE Habilidade(
	IDHabilidade int not null identity,
	Nome varchar(200) not null,
	CONSTRAINT PKIDHabilidade PRIMARY KEY (IDHabilidade)
)

CREATE TABLE Classe(
	IDClasse int not null identity,
	Nome varchar(100) not null,
	Caracteristicas varchar(1000) null,
	IDHabilidade int not null,
	CONSTRAINT PKIDClasse PRIMARY KEY (IDClasse),
	CONSTRAINT FKIDHabilidade FOREIGN KEY (IDHabilidade) REFERENCES Habilidade (IDHabilidade)
)

CREATE TABLE Personagem
(
	IDPersonagem int not null identity,
	Nome varchar(100) not null,
	Descricao varchar(100) not null,
	DataNascimento datetime not null,
	IDRaca int not null,
	IDClasse int not null,
	CONSTRAINT PKIDPersonagem PRIMARY KEY (IDPersonagem),
	CONSTRAINT FKRacaPersonagem FOREIGN KEY (IDRaca) REFERENCES Raca(IDRaca),
	CONSTRAINT FKClassePersonagem FOREIGN KEY (IDClasse) REFERENCES Classe(IDClasse)
)

