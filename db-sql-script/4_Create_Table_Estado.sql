create table Estado(
	Id_Estado int not null auto_increment,
    Id_Pais int not null,
    Nome varchar(100),
    constraint Pk_Estado_Id_Estado Primary Key(Id_Estado),
    constraint FK_Pais_Estado_Id_Pais Foreign Key(Id_Pais) references Pais (Id_Pais)
)