drop database if exists HS_Pess;
create database HS_Pess;
use HS_Pess;

create table Pessoa (
	idPessoa	int		auto_increment		primary key,
    nome		varchar(30),
    dataN		date,
    cpf			varchar(20),
    estado		char(2),
    city		varchar(45),
    ende		varchar(45),
    email		varchar(30),
    passw		varchar(30)
);

insert into Pessoa values 
	(null, "Leon Scott Kennedy", "1985-07-15", "111.222.333-00", "SP", "RacoonCity", "rua Nemesis da Silva, n. 528", "leondozap@kasino.jhonson", "CidadeGuaxinim");

delimiter $
create procedure senhaComando(EmailIn varchar(30))
begin
    set @Senha = (select passw from Pessoa where email = EmailIn);
    select @Senha;
end$

create procedure insertCliente(nome varchar(30), 
							   dataN date, 
							   cpf varchar(20), 
                               estado char(2), 
                               city varchar(45), 
                               ende varchar(45), 
                               email varchar(30), 
                               passw varchar(30))
begin
	insert into Pessoa values (null, nome, dataN, cpf, estado, city, ende, email, passw);
end$

delimiter ;
