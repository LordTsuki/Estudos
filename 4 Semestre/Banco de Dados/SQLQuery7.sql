declare @num int

set @num = 10
select @num

select * from Veiculo
declare @valor numeric(18,2)

set @valor = (select valor from Veiculo where IDVeiculo = 1)

select @valor

declare @valor numeric(18,2), @placa varchar(50)
select @calor = valor, @placa from Veiculo where IDVeiculo = 1

select @valor, @placa