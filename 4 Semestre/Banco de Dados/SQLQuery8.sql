CREATE OR ALTER PROCEDURE spAreaRetangulo @base int, @altura int
as
begin
    select @base * altura
end

exec spAreaRetangulo 3, 2