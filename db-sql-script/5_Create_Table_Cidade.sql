create table Cidade(
	Id_Cidade int not null auto_increment,
    Id_Estado int not null,
    Nome varchar(100),
    constraint Pk_Cidade_Id_Cidade Primary Key(Id_Cidade),
    constraint FK_Estado_Cidade_Id_Estado foreign key(Id_Estado) references Estado (Id_Estado)
)