CREATE OR ALTER PROCEDURE spAreaRetangulo
    @base int, @altura int, @resultado int OUTPUT
AS
BEGIN
    SELECT @resultado = @base * @altura
END 

DECLARE @res int
EXEC spAreaRetangulo OUTPUT 5, 3, @res OUTPUT 
PRINT @res
SELECT @resdeclare