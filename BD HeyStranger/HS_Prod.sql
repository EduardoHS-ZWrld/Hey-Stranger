drop database if exists HS_Prod;
create database HS_Prod;
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