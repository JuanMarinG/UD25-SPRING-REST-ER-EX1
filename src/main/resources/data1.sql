DROP TABLE IF EXISTS ARTICULOS;
DROP TABLE IF EXISTS FABRICANTES;

CREATE TABLE Fabricantes(
Id int not null auto_increment primary key,
Nombre nvarchar(100) default null);

CREATE TABLE Articulos(
Id int not null auto_increment primary key,
Nombre nvarchar(100),
Precio int,
Fabricante_id int,
FOREIGN KEY (Fabricante_id) REFERENCES Fabricantes(Id)
);

INSERT INTO Fabricantes (Nombre) VALUES ('Sony');
INSERT INTO Fabricantes (Nombre) VALUES ('Apple');
INSERT INTO Fabricantes (Nombre) VALUES ('Xiaomi');

INSERT INTO Articulos (Nombre, Precio, Fabricante_id) VALUES ('Tablet', 250, 1);
INSERT INTO Articulos (Nombre, Precio, Fabricante_id) VALUES ('Pencil', 100, 2);
INSERT INTO Articulos (Nombre, Precio, Fabricante_id) VALUES ('Smartphone', 200, 3);
