Drop Table Aviao CASCADE;

CREATE TABLE Aviao(
NomeAviao VARCHAR(30),
Marca VARCHAR(15),
Modelo VARCHAR(15),
Autonomia Integer,
Capacidade Integer,
PRIMARY KEY (NomeAviao)
);


Drop Table Funcionarios CASCADE;

CREATE TABLE Funcionarios(
NomeFunc VARCHAR(15),
BI Integer,
NIF Integer,
Nascimento VARCHAR(15),
PRIMARY KEY (BI)
);


Drop Table Piloto CASCADE;

CREATE TABLE Piloto(
BI Integer,
NumCarta Integer,
AnosExp Integer,
PRIMARY KEY (BI),
FOREIGN KEY (BI) REFERENCES Funcionarios ON DELETE CASCADE
);


Drop Table Administrativo CASCADE;

CREATE Table Administrativo(
BI Integer,
PRIMARY KEY (BI),
FOREIGN KEY (BI) REFERENCES Funcionarios ON DELETE CASCADE
);



Drop Table AssistenteBordo CASCADE;

CREATE TABLE AssistenteBordo(
BI Integer,
AnosExp Integer,
PRIMARY KEY (BI), 
FOREIGN KEY (BI) REFERENCES Funcionarios ON DELETE CASCADE
);



Drop Table Hospedeiras CASCADE;

CREATE Table Hospedeiras(
BI Integer,
Peso Integer,
PRIMARY KEY (BI), 
FOREIGN KEY (BI) REFERENCES Funcionarios ON DELETE CASCADE
);



Drop Table ComissarioDeBordo CASCADE;

CREATE TABLE ComissarioDeBordo(
BI Integer,
Altura VARCHAR(15),
PRIMARY KEY (BI), 
FOREIGN KEY (BI) REFERENCES Funcionarios ON DELETE CASCADE
);


Drop Table voo_regular CASCADE;

CREATE Table voo_regular(
numVoo Integer,
Origem VARCHAR (15),
Destino VARCHAR (15),
Distancia Integer,
HoraP VARCHAR(15),
HoraCh VARCHAR(15),
Data VARCHAR(15),
PRIMARY KEY (numVoo)
);


Drop Table Tripulacao_voo CASCADE;

CREATE TABLE Tripulacao_voo (
numVoo Integer,
BI Integer, 
FOREIGN KEY (BI) REFERENCES Funcionarios ON DELETE CASCADE,
FOREIGN KEY (numVoo) REFERENCES voo_regular ON DELETE CASCADE
);


Drop Table Trajetos CASCADE;

CREATE TABLE Trajetos(
numTrajeto Integer,
numPassageiros Integer,
hora_exataP VARCHAR(15),
hora_exataCh VARCHAR(15),
PRIMARY KEY (numTrajeto,hora_exataP)
);




Drop Table aviao_Trajeto CASCADE;

CREATE TABLE aviao_Trajeto(
numTrajeto Integer,
NomeAviao VARCHAR (30), 
hora_exataP VARCHAR (15),
FOREIGN KEY (NomeAviao) REFERENCES Aviao ON DELETE CASCADE,
FOREIGN KEY (numTrajeto,hora_exataP) REFERENCES Trajetos ON DELETE CASCADE
);



Drop Table Trajeto_vooRegular CASCADE;

CREATE TABLE Trajeto_vooRegular(
numTrajeto Integer,
numVoo Integer,
hora_exataP VARCHAR (15),
FOREIGN KEY (numVoo) REFERENCES voo_regular ON DELETE CASCADE,
FOREIGN KEY (numTrajeto,hora_exataP) REFERENCES Trajetos ON DELETE CASCADE
);
















