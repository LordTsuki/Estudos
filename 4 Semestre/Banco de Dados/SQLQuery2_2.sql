INSERT INTO Modelo(Nome,NumeroLugares,Tipo) VALUES
	('Ferrari',2,'Esportivo')

ALTER TABLE Modelo ALTER COLUMN Tipo varchar(100)

ALTER TABLE Modelo ADD CHECK (Tipo in('Sedan', 'SUV', 'Hatch', 'Outros', 'Esportivo'))

DELETE FROM Modelo WHERE Tipo = 'SUV'

SELECT *FROM Modelo