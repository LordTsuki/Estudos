CREATE TABLE Modelo
(
    IDModelo int not null identity,
    Nome varchar(200) not null,
    Descircao varchar(500),
    CONSTRAINT PKIDModelo PRIMARY KEY (IDModelo)
)

CREATE TABLE Veiculo
(
    IDVeiculo int not null identity,
    Proprietario varchar(200) not null,
    Placa varchar(50) not null,
    DataCompra datetime,
    IDModelo int not null, 
    Valor numeric(18,2) not null,
    CONSTRAINT PKIDVeiculo PRIMARY KEY (IDVeiculo),
    CONSTRAINT FKVeiculoModelo FOREIGN KEY (IDModelo) REFERENCES Modelo(IDModelo)
)

drop table Veiculo
drop table Modelo
drop table ChaveComposta

CREATE TABLE ChaveComposta
(
    IDChave1 int not null,
    IDChave2 int not null,
    Nome varchar(100)
)

ALTER TABLE ChaveComposta ADD CONSTRAINT PKComposta PRIMARY KEY(IDChave1, IDChave2)

-------------
ALTER TABLE Modelo ADD NumeroLugares int
ALTER TABLE Modelo ADD Tipo varchar(100)

ALTER TABLE Modelo ADD CHECK (Tipo in('Sedan', 'SUV', 'Hatch', 'Outros'))

ALTER TABLE Modelo ADD CONSTRAINT padraoLugares DEFAULT 5 FOR NumeroLugares

----
ALTER TABLE Veiculo ADD VouApagar numeric(18,2)
ALTER TABLE Veiculo ADD AnoFabricacao int
ALTER TABLE Veiculo ADD Cores varchar(10)

ALTER TABLE Veiculo ALTER COLUMN AnoFabricacao int not null

ALTER TABLE Veiculo ALTER COLUMN Cores varchar(50)

ALTER TABLE Veiculo DROP COLUMN VouApagar

sp_rename 'Veiculo.cores',cor