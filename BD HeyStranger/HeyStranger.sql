drop database if exists HeyStranger;
create database HeyStranger;
use HeyStranger;

create table Pessoa (
	idPessoa	int		auto_increment		primary key,
    nome		varchar(30),
    dataN		date,
    cpf			varchar(11),
    estado		char(2),
    cidade		varchar(45),
    ende		varchar(45),
    email		varchar(30),
    passw		varchar(30)
);

insert into Pessoa values (null, "Leon", "1985-07-15", "11122233300", "SP", "RacoonCity", "rua Nemesis da Silva, n. 528", "leondozap@kasino.jhonson", "CidadeGuaxinim");
insert into Pessoa values ()

delimiter $
create procedure senhaComando(EmailIn varchar(30))
begin
    set @Senha = (select passw from Pessoa where email = EmailIn);
end$