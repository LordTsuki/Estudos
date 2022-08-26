CREATE TABLE Usuario(
	IDUsuario int not null primary key,
	Nome varchar(200) not null,
	Cidade varchar(100),
	Ultimologin datetime
)
Insert into Usuario(IDUsuario, Nome, Cidade, Ultimologin) values (456,'texto','Sorocaba','22/08/2022')

select * from Usuario where nome='folena'

update Usuario set nome='sao paulo' where nome='texto'
Insert into Usuario(IDUsuario, Nome, Cidade, Ultimologin) values (1,'folena','Sorocaba','23/11/2022')
delete from Usuario where nome='sao paulo'

select * from Usuario
CREATE TABLE Usuario1(
	IDUsuario int not null primary key identity(1,1),
	Nome varchar(200) not null,
	Cidade varchar(100),
	Ultimologin datetime
)

Insert into Usuario1(Nome, Cidade, Ultimologin) values ('lord','Sorocaba','15/08/2001')

select * from Usuario1

CREATE TABLE Usuario2(
	IDUsuario int not null primary key identity(1,2),
	Nome varchar(200) not null,
	Cidade varchar(100),
	Ultimologin datetime
)

Insert into Usuario2(Nome, Cidade, Ultimologin) values ('conrado','Sorocaba','09/12/1997')

delete from Usuario1 where IDUsuario= 3

select * from Usuario2