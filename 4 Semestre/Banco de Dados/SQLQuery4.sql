SELECT * from Modelo

SELECT * FROM Veiculo

SELECT Nome, Tipo, NumeroLugares FROM Modelo ORDER BY Nome DESC

SELECT TOP 5 Nome, Tipo, NumeroLugares FROM Modelo 
ORDER BY Nome DESC, Tipo asc

SELECT * FROM Modelo WHERE IDModelo BETWEEN 3 AND 10
SELECT * FROM Modelo WHERE IDModelo >= 3 AND IDModelo <= 10

SELECT * FROM Veiculo WHERE IDVeiculo IN (1, 3, 5, 7)
SELECT * FROM Veiculo WHERE IDVeiculo = 1 OR IDVeiculo = 3 OR IDVeiculo = 5 OR IDVeiculo = 7

SELECT * FROM Veiculo WHERE YEAR(DataCompra) = 2022 and MONTH(DataCompra) = 8

SELECT Proprietario, Placa, Valor FROM Veiculo WHERE Valor >= 30000
SELECT * FROM Veiculo WHERE cor is null
SELECT * FROM Veiculo WHERE cor is not null

SELECT * FROM Veiculo
UPDATE Veiculo SET Proprietario = 'Ana Clara' WHERE IDVeiculo = 1
UPDATE Veiculo SET Proprietario = 'Ana Maria' WHERE IDVeiculo = 8

SELECT * FROM Veiculo WHERE Proprietario like 'Ana'
SELECT * FROM Veiculo WHERE Proprietario like 'Ana%'
SELECT * FROM Veiculo WHERE Proprietario like '%Ana'
SELECT * FROM Veiculo WHERE Proprietario like '%Ana%'
SELECT * FROM Veiculo WHERE Proprietario like '[A-F]%' order by Proprietario
SELECT * FROM Veiculo WHERE Proprietario like '[^A-F]%' order by Proprietario

SELECT Nome FROM Modelo
UNION
SELECT Proprietario FROM Veiculo

SELECT DISTINCT Tipo FROM Modelo

