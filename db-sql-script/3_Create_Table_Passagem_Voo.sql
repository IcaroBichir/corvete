create table passagem(
	Id_Passagem int not null auto_increment,
    Id_Usuario int not null,
    Valor double not null,
    constraint PK_Passagem_Id_Passagem primary key(Id_Passagem),
    constraint FK_Usuario_Id_Usuario Foreign Key(Id_Usuario) references Usuario(Id_Usuario)
);

create table Voo(
	Id_Voo int not null auto_increment,
    Id_Cidade int not null,
    Data_Saida datetime not null,
    Data_Chegada datetime not null,
    constraint PK_Voo_Id_Voo primary key(Id_Voo),
    constraint FK_Cidade_Id_Cidade foreign key(Id_Cidade) references Cidade(Id_Cidade)
)
