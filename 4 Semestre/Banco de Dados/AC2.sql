--Questão 1
CREATE OR ALTER PROCEDURE NomePersonagem
AS
BEGIN
    SELECT @Nome = Nome, @DataNascimento = DataNascimento, @IDRaca = Raca, @IDClasse = Classe, @IDHabilidade = Habilidade FROM AC1
END

--Questão 2
CREATE OR ALTER spDataNascimento @DataNascimento INT OUTPUT
AS
BEGIN
    SELECT @Player = COUNT(*) FROM AC1
END

--Questão 3
CREATE OR ALTER spAC2UpdatePower
    @IDPersonagem INT, @NewPower INT
AS
BEGIN
    DECLARE @PoderNovo int
    BEGIN TRAN
        UPDATE Personagem SET Poder = Poder + @NewPower WHERE IDPersonagem = IDPersonagem
        SELECT @PoderNovo = Poder FROM Personagem WHERE IDPersonagem = IDPersonagem

        IF @PoderNovo < 0
            BEGIN
                ROLLBACK
                RAISERROR('Poder sempre deve ser positivo', 10, 1)
            END
        ELSE
            BEGIN
                COMMIT
                PRINT 'Tudo certo'
            END
END
GO

--Questão 4 
CREATE OR ALTER FUNCTION QtdPersonagens (@IDClasse INT)
RETURNS INT
AS
BEGIN
    DECLARE @qtd INT
    SET @qtd = [Valores da função]
    RETURN @qtd
END

SELECT QtdPersonagens(1)

--Questão 5
CREATE FUNCTION TablePersonagens (@IDClasse INT, @IDRaca INT, @IDHabilidade INT)
RETURNS TABLE
AS
RETURN
(
    SELECT
        A.IDClasse, C.IDRaca, B.IDHabilidade
    FROM
        Classe A INNER JOIN Personagem B
            ON A.CLASSE IN B.Personagem
    WHERE A.CLASSE = @IDClasse
)
GO

SELECT * FROM TablePersonagens