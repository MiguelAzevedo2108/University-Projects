DROP TABLE Questionarios CASCADE;
DROP TABLE Questionario3 CASCADE;
DROP TABLE Questionario4 CASCADE;
DROP TABLE Questionario5 CASCADE;
DROP TABLE Respostas CASCADE;

CREATE TABLE Questionarios(
Id VARCHAR(8),
Nome VARCHAR(20),
Nperguntas INTEGER NOT NULL,
PRIMARY KEY (Id)
);

CREATE TABLE Questionario3(
Id VARCHAR(8),
Pergunta1 VARCHAR(60),
Pergunta2 VARCHAR(60),
Pergunta3 VARCHAR(60),
FOREIGN KEY (Id) REFERENCES Questionarios on delete cascade
);

CREATE TABLE Questionario4(
Id VARCHAR(8),
Pergunta1 VARCHAR(60),
Pergunta2 VARCHAR(60),
Pergunta3 VARCHAR(60),
Pergunta4 VARCHAR(60),
FOREIGN KEY (Id) REFERENCES Questionarios on delete cascade
);

CREATE TABLE Questionario5(
Id VARCHAR(8),
Pergunta1 VARCHAR(60),
Pergunta2 VARCHAR(60),
Pergunta3 VARCHAR(60),
Pergunta4 VARCHAR(60),
Pergunta5 VARCHAR(60),
FOREIGN KEY (Id) REFERENCES Questionarios on delete cascade
);

CREATE TABLE Respostas(
Unico INTEGER NOT NULL,
Id VARCHAR(8),
PRIMARY KEY (Unico),
FOREIGN KEY (Id) REFERENCES Questionarios on delete cascade
);
