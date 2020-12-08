#drop database if exists HS_Prod;
#create database HS_Prod;
use HS_Prod;

create table Departamento (
	idDepart	int		auto_increment		primary key,
    nomeDepart	varchar(30)
    
);

create table Produto (
	idProd		int		auto_increment		primary key,
	nome		varchar(40),
	pvenda		int,
	pcusto		int,
	estoque		int,
	depart		int,
    descr		varchar(500),
	image		varchar(40),

	foreign key (depart) references Departamento(idDepart)
);

create table Pessoa (
	idPessoa	int		auto_increment		primary key,
    nome		varchar(30),
    dataN		date,
    cpf			varchar(20),
    estado		char(2),
    city		varchar(45),
    ende		varchar(100),
    email		varchar(30),
    passw		varchar(30)
);

insert into Pessoa values 
	(null, "Leon Scott Kennedy", "1985-07-15", "111.222.333-00", "SP", "RacoonCity", "rua Nemesis da Silva, n. 528", "leondozap@kasino.jhonson", "CidadeGuaxinim");

insert into Departamento values (null, 'Armas');
insert into Departamento values (null, 'Munições');
insert into Departamento values (null, 'Consumíveis');
insert into Departamento values (null, 'Mapas');
insert into Departamento values (null, 'Especiais');

delimiter $
create procedure insertProduto(nome varchar(40), 
							   pvenda		int,
							   pcusto		int,
							   estoque		int,
							   depart		int,
                               descr		varchar(500))
begin
	insert into Produto values (null, nome, pvenda, pcusto, estoque, depart, descr, null);
 end$
 
create procedure identificaProduto(n int)
begin
	select nome, pvenda, estoque, descr from Produto where idProd = n;
end$

create procedure compraProduto(nm varchar(40))
begin
	set @ID = (select idProd from Produto where nome = nm);
	update produto set estoque = (estoque - 1)
    where idProd = @ID; 
end$

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
                               ende varchar(100), 
                               email varchar(30), 
                               passw varchar(30))
begin
	insert into Pessoa values (null, nome, dataN, cpf, estado, city, ende, email, passw);
end$

delimiter ;
