CREATE TABLE Raca(
	IDRaca int not null identity,
	Nome varchar(100) not null,
	Descricao varchar(500),
	Origem varchar(150) not null,
	Perdido datetime not null,
	CONSTRAINT PKRaca PRIMARY KEY (IDRaca)
)

ALTER TABLE Raca DROP COLUMN Perdido

CREATE TABLE Habilidade(
	IDHabilidade int not null identity,
	Nome varchar(200) not null,
	CONSTRAINT PKIDHabilidade PRIMARY KEY (IDHabilidade)
)

ALTER TABLE Habilidade ADD Poder int	

CREATE TABLE Classe(
	IDClasse int not null identity,
	Nome varchar(100) not null,
	Caracteristicas varchar(1000) null,
	IDHabilidade int not null,
	CONSTRAINT PKIDClasse PRIMARY KEY (IDClasse),
	CONSTRAINT FKIDHabilidade FOREIGN KEY (IDHabilidade) REFERENCES Habilidade (IDHabilidade)
)

ALTER TABLE Classe ALTER COLUMN Caracteristicas varchar(500) null

CREATE TABLE Personagem(
	IDPersonagem int not null identity,
	Nome varchar(100) not null,
	Descricao varchar(100) not null,
	DataNascimento datetime2 not null,
	IDRaca int not null,
	IDClasse int not null,
	CONSTRAINT PKIDPersonagem PRIMARY KEY (IDPersonagem),
	CONSTRAINT FKRacaPersonagem FOREIGN KEY (IDRaca) REFERENCES Raca(IDRaca),
	CONSTRAINT FKClassePersonagem FOREIGN KEY (IDClasse) REFERENCES Classe(IDClasse)
)

INSERT INTO Raca(Nome, Descricao, Origem) VALUES ('E.X.I.A', 'Formas de vida ciberneticas', 'Fenda Cristalina')
INSERT INTO Raca(Nome, Descricao, Origem) VALUES ('Sylphs', 'Espiritos feericos do vento', 'Feywild')
INSERT INTO Raca(Nome, Descricao, Origem) VALUES ('Zheniths', 'Armas divinas', 'Planos superiores')

INSERT INTO Habilidade(Nome, Poder) VALUES ('Disparo Redirecionado', 70)
INSERT INTO Habilidade(Nome, Poder) VALUES ('Furia', 90)
INSERT INTO Habilidade(Nome, Poder) VALUES ('Comandar mortos-vivos', 80)
INSERT INTO Habilidade(Nome, Poder) VALUES ('Poder Incarnado', 60)
 
INSERT INTO Classe(Nome, Caracteristicas, IDHabilidade) VALUES ('Portal Mage', 'Mago focado em magias espaciais', 1)
INSERT INTO Classe(Nome, Caracteristicas, IDHabilidade) VALUES ('Barbaro', 'Guerreiro tribal focado em tank', 2)
INSERT INTO Classe(Nome, Caracteristicas, IDHabilidade) VALUES ('Necromante', 'Mago focado em magias que desafiam a natureza da vida', 3)
INSERT INTO Classe(Nome, Caracteristicas, IDHabilidade) VALUES ('Summoner','Conjurador que invoca criaturas místicas que lutam por ele', 4)
INSERT INTO Classe(Nome, IDHabilidade) VALUES ('Guerreiro', 4)

SET dateformat DMY

INSERT INTO Personagem(Nome, Descricao, DataNascimento, IDRaca, IDClasse) VALUES ('N.I.X', 'E.X.I.A que após a grande guerra tem como objetivo descobrir o sentido da existência', '05-12-0500', 1, 1)
INSERT INTO Personagem(Nome, Descricao, DataNascimento, IDRaca, IDClasse) VALUES ('Ophior Aharis', 'Um Zhenith vindo de uma familia real, onde descobriu uma corrupção vindo de sua familia', '08-06-1756', 3, 4)
INSERT INTO Personagem(Nome, Descricao, DataNascimento, IDRaca, IDClasse) VALUES ('Beatus vir', 'Sylph perdido', '19-03-0750', 2, 4)
INSERT INTO Personagem(Nome, Descricao, DataNascimento, IDRaca, IDClasse) VALUES ('Morto Sem Nome', 'Morto', '08-06-1978', 2, 5)
INSERT INTO Personagem(Nome, Descricao, DataNascimento, IDRaca, IDClasse) VALUES ('Guerreiro do bigode','Guerreiro com bigode', '18-06-1995', 3, 5)

UPDATE Classe SET Caracteristicas = 'Caracteristicas Gerais' WHERE Caracteristicas IS NULL

DELETE FROM Personagem WHERE YEAR(DataNascimento) BETWEEN 1970 AND 1990

SELECT * FROM Personagem

SELECT Nome, Poder FROM Habilidade WHERE Poder BETWEEN 0 AND 100

SELECT Nome, Descricao, DataNascimento FROM Personagem WHERE Nome LIKE '%Big%' AND YEAR(DataNascimento) BETWEEN 1990 AND 2000