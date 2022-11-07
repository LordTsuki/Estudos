CREATE OR ALTER PROCEDURE spFormatarSaida
    @varSaida varchar(140) OUTPUT
AS
BEGIN
    set @varSaida = 'Esta é a saída! - ' + @varSaida
END

DECLARE @saida varchar(140)
SET @saida = 'Valor para concatenar com a variavel!'
EXEC spFormatarSaida @saida OUTPUT
PRINT @saida