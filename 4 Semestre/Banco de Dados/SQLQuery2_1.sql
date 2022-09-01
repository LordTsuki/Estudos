DECLARE @string1 char(10) = 'Hello'
DECLARE @string2 varchar(10) = 'World'

select @string1 + @string2
select LEN(@string1), LEN(@string2)
select DATALENGTH(@string1), DATALENGTH(@string2)

DECLARE @string3 nchar(10) = N'Hello'
DECLARE @string4 nvarchar(10) = N'World'

select @string3 + @string4
select LEN(@string3), LEN(@string4)
select DATALENGTH(@string3), DATALENGTH(@string4)