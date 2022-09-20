SELECT * FROM Modelo -- Exibe tudo

SELECT COUNT(*) FROM modelo --Número de itens na coluna

SELECT * FROM Veiculo

SELECT COUNT(*) QtdVeiculo FROM Veiculo -- Retorna o número da coluna com um nome

SELECT * FROM Veiculo

SELECT SUM(Valor) FROM Veiculo -- Retorna a soma da coluna

SELECT AVG(Valor) Media FROM Veiculo -- Retorna a média da coluna

SELECT MAX(Valor) MaisCaro FROM Veiculo -- Retorna o maior valor da coluna

SELECT MIN(Valor) MaisBarato FROM Veiculo -- Retorna o menor valor da coluna

SELECT SUM(Valor) FROM Veiculo WHERE AnoFabricacao between 2020 AND 2022-- Retorna a soma da coluna entre 2020 e 2022

SELECT AVG(Valor) FROM Veiculo WHERE AnoFabricacao between 2020 AND 2022-- Retorna a média da coluna entre 2020 e 2022

SELECT SUM(Valor) FROM Veiculo WHERE AnoFabricacao in(2020, 2022)-- Retorna a soma das colunas 2020 e 2022

SELECT * FROM Veiculo ORDER BY AnoFabricacao

SELECT AnoFabricacao, SUM(valor) SomaPorAno FROM Veiculo GROUP BY AnoFabricacao -- Soma pelos anos

SELECT AnoFabricacao, AVG(valor) MediaAno FROM Veiculo GROUP BY AnoFabricacao -- Retorna o valor médio por ano

SELECT AnoFabricacao, COUNT(*) MediaAno FROM Veiculo GROUP BY AnoFabricacao -- Retorna qtd por ano

SELECT AnoFabricacao, MAX(valor) MediaAno FROM Veiculo GROUP BY AnoFabricacao -- Retorna Maxímo por ano

SELECT AnoFabricacao, MIN(valor) MediaAno FROM Veiculo GROUP BY AnoFabricacao -- Retorna Mínimo por ano

SELECT AnoFabricacao, SUM(Valor) SomaPorAno FROM Veiculo GROUP BY AnoFabricacao HAVING SUM(Valor) >= 50000

SELECT AnoFabricacao, AVG(Valor) SomaPorAno FROM Veiculo GROUP BY AnoFabricacao HAVING AVG(Valor) between 30000 and 50000

SELECT AnoFabricacao, COUNT(*) SomaPorAno FROM Veiculo GROUP BY AnoFabricacao HAVING COUNT(*) >= 2