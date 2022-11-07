/*
    Gabriel Luna - 210060
    Marcos Folena -
    Lucas Yukio -
*/

--Questão 1
CREATE OR ALTER PROCEDURE DadosPersonagem @nPersonagem varchar(100)
AS
BEGIN
    SELECT P.Nome, P.DataNascimento, R.Nome as nRaca, C.Nome as nClasse, H.Nome as nHabilidade FROM dbo.Personagem P
    INNER JOIN dbo.Raca R ON R.IDRaca = P.IDRaca
    INNER JOIN dbo.Classe C ON C.IDClasse = P.IDClasse
    INNER JOIN dbo.Habilidade H ON H.IDHabilidade = C.IDHabilidade
    Where P.Nome = @nPersonagem
END
GO

EXEC DadosPersonagem @nPersonagem = 'N.E.X.'
GO

--Questão 2
CREATE OR ALTER PROCEDURE AnoPersonagem @yPersonagem int, @qtd int OUTPUT
AS
BEGIN
    SELECT @qtd = COUNT(*) FROM dbo.Personagem P
    WHERE YEAR(P.DataNascimento) = @yPersonagem
END
GO

DECLARE @ResQtd INT
EXEC AnoPersonagem @yPersonagem = 0500, @qtd = ResQtd OUTPUT
PRINT @ResQtd
GO

--Questão 3
CREATE OR ALTER PROCEDURE AttPoder @id int, @poder INT
AS
BEGIN
    DECLARE @AttPoder INT
    BEGIN TRAN
        UPDATE dboa.Habilidade SET Poder = Poder + @poder WHERE IDHabilidade = @id

        SELECT @AttPoder = Poder FROM dboa.habilidade WHERE IDHabilidade = @id

        IF @AttPoder < 0 OR @AttPoder > 100
            BEGIN
                ROLLBACK
                RAISERROR('A soma deve estar entre 0 e 100', 15, 1)
            END
        ELSE
            BEGIN
                COMMIT
                PRINT('Poder atualizado')
            END
END
GO

EXEC AttPoder @id = 2, @poder = 9999
GO
EXEC AttPoder @id = 2, @poder = 50
GO

--Questão 4
CREATE OR ALTER FUNCTION QtdClasse(@IDClasse int)
RETURNS INT
BEGIN
    DECLARE @QtdClasse INT
    SELECT @QtdClasse = COUNT(IDPersonagem) FROM dbo.Personagem WHERE IDClasse = @IDClasse
    RETURN @QtdClasse
END
GO

SELECT dboa.QtdClasse(1) as qtd

--Questão 5
CREATE OR ALTER FUNCTION SelectQtd(@Selec INT)
RETURNS @Result TABLE(Nome varchar(100) NOT NULL, qtd int)
AS
BEGIN
    IF(@Selec = 1)
        INSERT INTO @Result
            SELECT C.Nome as Nome, COUNT(P.Nome) AS qtd FROM dbo.Personagem P
            INNER JOIN dbo.Classe C ON C.IDClasse = P.IDClasse
            GROUP BY C.Nome
    IF(@Select = 2)
        INSERT INTO @Result
            SELECT R.Nome AS nRaca, COUNT(P.Nome) AS qtdPersonagem FROM dbo.Personagem P
            INNER JOIN dboa.Raca R ON R.IDRaca = P.IDRaca
            GROUP BY R.Nome
    IF(@Selec = 3)
        INSERT INTO @Result
            SELECT H.Nome AS nHabilidade, COUNT(P.Nome) as qtdPersonagem FROM dbo.Personagem P
            INNER JOIN dbo.Classe C ON C.IDClasse = P.IDClasse
            INNER JOIN dbo.Habilidade H ON C.IDHabilidade = H.IDHabilidade
            GROUP BY H.Nome
    RETURN;
END
GO

SELECT * FROM dbo.SelectQtd(3)