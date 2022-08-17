DROP TABLE IF EXISTS ARTICULOS;
DROP TABLE IF EXISTS FABRICANTES;

CREATE TABLE Fabricantes(
Id int not null auto_increment primary key,
Nombre nvarchar(100) default null);

CREATE TABLE Articulos(
Id int not null auto_increment primary key,
Nombre nvarchar(100),
Precio int,
FabricanteId int,
FOREIGN KEY (FabricanteId) REFERENCES Fabricantes(Id)
);

INSERT INTO Fabricantes (NOMBRE) VALUES ('Sony');
INSERT INTO Fabricantes (NOMBRE) VALUES ('Apple');
INSERT INTO Fabricantes (NOMBRE) VALUES ('Xiaomi');
