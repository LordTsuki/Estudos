--RAISERROR
DECLARE @Teste INT
SET @Teste = 40

IF @Teste > 30
    RAISERROR('Valor maior que 30!!!', 13, 1)

DECLARE @Media NUMERIC(18, 2)
SELECT @Media = avg(Valor) from Veiculo

IF @Media < 40000
    RAISERROR('Valor atrativo', 16, 1)
else
    RAISERROR('Muito caro!!!', 16, 1)

SELECT * FROM Veiculo
BEGIN TRANSACTION t1 --Checkpoint

UPDATE Veiculo SET Cor = 'Roxo' WHERE IDVeiculo > 10

ROLLBACK --Cancelar/Desfazer as ações
COMMIT --Confirmar/Salvar informação
SELECT * FROM Veiculo(NoLock)

BEGIN TRANSACTION TranTeste
BEGIN TRY
    INSERT INTO #teste VALUES (5)
    INSERT INTO #teste VALUES (2)
    INSERT INTO #teste VALUES (13)
    COMMIT TRANSACTION
    PRINT 'SUCESSO AO EXECUTAR SCRIPT'
END TRY
BEGIN CATCH
    PRINT 'ERRO AO EXECUTAR O SCRIPT'
    ROLLBACK TRANSACTION
END CATCH

CREATE OR ALTER spAddVeiculo
    @proprietario varchar(200), @placa varchar(50),
    @idmodelo INT, @valor INT, @ano INT
AS
BEGIN
    BEGIN TRY
        INSERT INTO Veiculo (Proprietario, Placa, IDModelo, Valor, Ano) VALUES
        (@proprietario, @placa, @idmodelo, @valor, @ano)
    END TRY
    BEGIN CATCH
        IF ERROR_NUMBER() = 547
            RAISERROR('ERRO DE CHAVE ESTRANGEIRA', 15, 1)
        ELSE
            RAISERROR('OCORREU UM ERRO"', 15, 1)
    END CATCH
END

EXEC spAddVeiculo
    @proprietario = 'Leo', @placa = 'XYZ9876', @IDModelo = 1, @valor = 50000, @ano 2017

SELECT * FROM Veiculo ORDER BY IDVeiculo DESC
