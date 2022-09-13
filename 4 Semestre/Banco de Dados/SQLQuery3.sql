CREATE TABLE Pessoa(
	Nome varchar(100) not null,
	ID int not null identity,
	Edereco varchar(200) not null,
	Info varchar(50) not null,
	CONSTRAINT PKPessoa PRIMARY KEY (ID)
)

ALTER TABLE Pessoa ADD CHECK(Info in('Proprietario', 'Locatario'))

CREATE TABLE Und_Habitacional(
	IDUnd int not null identity,
	IDdono int not null,
	Situacao varchar(50),
	IdLocatario int not null,
	CONSTRAINT PKUndHab PRIMARY KEY (IDUnd),
	CONSTRAINT FKUndHab FOREIGN KEY (IDdono) REFERENCES Pessoa(ID)
)

ALTER TABLE Und_Habitacional ADD CHECK(Situacao in('Alugado', 'Livre'))