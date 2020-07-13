--Inserts--
--Aviões--

-- 9 A --
--Aleixo Abreu, Marca Boeing, modelo 737, autonomia 2000 km, numero passageiros 200--

INSERT INTO Aviao VALUES ('Aleixo Abreu','Boeing','737',2000,200);

-- 9 B -- 
--Afonso Lopes, Marca Boeing, modelo 737, autonomia 2000 km, numero passageiros 200--

INSERT INTO Aviao VALUES ('Afonso Lopes','Boeing','737',2000,200);

-- 9 C --
--Bartolomeu Dias, Marca Boeing, modelo 737, autonomia 2000 km, numero passageiros 200--

INSERT INTO Aviao VALUES ('Bartolomeu Dias','Boeing','737',2000,200);

-- 9 D -- 
-- Diogo Dias, Marca Boeing, modelo 777, autonomia 8000 km, numero passageiros 400--

INSERT INTO Aviao VALUES ('Diogo Dias','Boeing','777',8000,400);

-- 9 E -- 
--Francisco Zeimoto, Marca Boeing, modelo 777, autonomia 8000 km, numero passageiros 400--

INSERT INTO Aviao VALUES ('Francisco Zeimoto','Boeing','777',8000,400);

-- 9 F -- 
--Gil Eanes, Marca Airbus, modelo A318 , autonomia 3000 km, numero passageiros 150--

INSERT INTO Aviao VALUES ('Gil Eanes','Airbus','A318',3000,150);

-- 9 G -- 
-- Gomes de Sequeira, Marca Airbus, modelo A318 , autonomia 3000 km, numero passageiros 150--

INSERT INTO Aviao VALUES ('Gomes de Sequeira','Airbus','A318',3000,150);

--9 H --
-- Gomes Pires, Marca Airbus, modelo A318 , autonomia 3000 km, n´umero passageiros 150--

INSERT INTO Aviao VALUES ('Gomes Pires','Airbus','A318',3000,150);

--9 I -- 
--Nicolau Coelho, Marca Airbus, modelo A380 , autonomia 15000 km, numero passageiros 600--

INSERT INTO Aviao VALUES ('Nicolau Coelho','Airbus','A380',15000,600);


-- Funcionarios--

-- 6 administrativos com o numero do BI do 1 ao 6 --
	
	--1--


INSERT INTO Funcionarios VALUES ('Ana',1,000,'9-12-1990');
INSERT INTO Administrativo VALUES (1);

	--2--

INSERT INTO Funcionarios VALUES ('Ricardo',2,001,'10-11-1980');
INSERT INTO Administrativo VALUES (2);

	--3--

INSERT INTO Funcionarios VALUES ('Carolina',3,002,'2-11-1991');
INSERT INTO Administrativo VALUES (3);

	--4--

INSERT INTO Funcionarios VALUES ('Rita',4,003,'2-3-1975');
INSERT INTO Administrativo VALUES (4);
	
	--5--

INSERT INTO Funcionarios VALUES ('Pedro',5,004,'9-12-1994');
INSERT INTO Administrativo VALUES (5);

	--6--

INSERT INTO Funcionarios VALUES ('Marta',6,005,'1-12-1960');
INSERT INTO Administrativo VALUES (6);




-- 10 pilotos com o numero do BI do 10 ao 19. Os pilotos com o BI 10, 11, 12 e 13 tem 10 anos de experiencia, os outros tem 7 --

	--1--

INSERT INTO Funcionarios VALUES ('Joao',10,006,'1-1-1960');
INSERT INTO Piloto VALUES (10,330,10); -- taken

	--2--

INSERT INTO Funcionarios VALUES ('Tiago',11,007,'10-11-1975');
INSERT INTO Piloto VALUES (11,331,10);

	--3--

INSERT INTO Funcionarios VALUES ('Carolina',12,008,'2-4-1965');
INSERT INTO Piloto VALUES (12,332,10);

	--4--

INSERT INTO Funcionarios VALUES ('Rita',13,009,'23-3-1975');
INSERT INTO Piloto VALUES (13,333,10); 
	
	--5--

INSERT INTO Funcionarios VALUES ('Pedro',14,010,'9-12-1994');
INSERT INTO Piloto VALUES (14,334,7); -- taken

	--6--

INSERT INTO Funcionarios VALUES ('Marta',15,011,'1-12-1960');
INSERT INTO Piloto VALUES (15,335,7); -- taken

	--7--

INSERT INTO Funcionarios VALUES ('Miguel',16,012,'21-08-1983');
INSERT INTO Piloto VALUES (16,336,7); --taken

	--8--

INSERT INTO Funcionarios VALUES ('Ricardo',17,013,'10-11-1980');
INSERT INTO Piloto VALUES (17,337,7); --taken

	--9--

INSERT INTO Funcionarios VALUES ('Rui',18,014,'5-12-1961');
INSERT INTO Piloto VALUES (18,338,7);

	--10--

INSERT INTO Funcionarios VALUES ('Helder',19,015,'2-11-1981');
INSERT INTO Piloto VALUES (19,339,7); 




-- 15 hospedeiras com o numero do BI do 20 ao 34. As hospedeiras com o BI 20, 21,22, 24 pesam menos de 50 kg as outras pesam mais.--

	--1--

INSERT INTO Funcionarios VALUES ('Ana Rita',20,016,'7-5-1991');
INSERT INTO hospedeiras VALUES (20,49); -- taken 

	--2--

INSERT INTO Funcionarios VALUES ('Marta',21,017,'5-9-1990');
INSERT INTO hospedeiras VALUES (21,48); -- taken

	--3--

INSERT INTO Funcionarios VALUES ('Rita',22,018,'10-12-1991');
INSERT INTO hospedeiras VALUES (22,48);

	--4--

INSERT INTO Funcionarios VALUES ('Patricia',23,019,'1-1-1971');
INSERT INTO hospedeiras VALUES (23,40);

	--5--

INSERT INTO Funcionarios VALUES ('Beatriz',24,020,'16-6-1982');
INSERT INTO hospedeiras VALUES (24,44);

	--6--

INSERT INTO Funcionarios VALUES ('Joana',25,021,'26-11-1981');
INSERT INTO hospedeiras VALUES (25,51); -- taken

	--7--

INSERT INTO Funcionarios VALUES ('Sofia',26,022,'14-2-1981');
INSERT INTO hospedeiras VALUES (26,59); -- taken

	--8--

INSERT INTO Funcionarios VALUES ('Maria',27,023,'1-3-1993');
INSERT INTO hospedeiras VALUES (27,53); -- taken

	--9--

INSERT INTO Funcionarios VALUES ('Micaela',28,024,'10-3-1992');
INSERT INTO hospedeiras VALUES (28,52); -- taken
	
	--10--

INSERT INTO Funcionarios VALUES ('Carina',29,025,'7-7-1991');
INSERT INTO hospedeiras VALUES (29,62); -- taken

	--11--

INSERT INTO Funcionarios VALUES ('Catarina',30,026,'1-3-1995');
INSERT INTO hospedeiras VALUES (30,53); --taken

	--13--

INSERT INTO Funcionarios VALUES ('Olga',31,027,'2-4-1992');
INSERT INTO hospedeiras VALUES (31,55); -- taken

	--14--

INSERT INTO Funcionarios VALUES ('Rosa',32,028,'10-12-1990');
INSERT INTO hospedeiras VALUES (32,51); -- taken

	--15--

INSERT INTO Funcionarios VALUES ('Sara',33,029,'31-10-1991');
INSERT INTO hospedeiras VALUES (33,59);

--16--

INSERT INTO Funcionarios VALUES ('Joaquina',34,030,'14-2-1991');
INSERT INTO hospedeiras VALUES (34,56);



--10 comissarios com o numero do BI do 40 ao 49. Os comissarios com o BI do 40 ao 45 medem mais de 1.85 m, os outros medem menos--

	--1--

INSERT INTO Funcionarios VALUES ('Carlos',40,031,'10-2-1993');
INSERT INTO ComissarioDeBordo VALUES (40,'1.86'); -- taken

	--2--

INSERT INTO Funcionarios VALUES ('Gerson',41,032,'1-10-1989');
INSERT INTO ComissarioDeBordo VALUES (41,'1.87');

	--3--

INSERT INTO Funcionarios VALUES ('Miguel',42,033,'10-12-1991');
INSERT INTO ComissarioDeBordo VALUES (42,'1.88');

	--4--

INSERT INTO Funcionarios VALUES ('Paulo',43,034,'21-1-1981');
INSERT INTO ComissarioDeBordo VALUES (43,'1.89');

	--5--

INSERT INTO Funcionarios VALUES ('Hugo',44,035,'16-6-1982');
INSERT INTO ComissarioDeBordo VALUES (44,'1.90');

	--6--

INSERT INTO Funcionarios VALUES ('Joao',45,036,'26-11-1981');
INSERT INTO ComissarioDeBordo VALUES (45,'1.91');

	--7--

INSERT INTO Funcionarios VALUES ('Pedro',46,037,'14-2-1981');
INSERT INTO ComissarioDeBordo VALUES (46,'1.84'); -- taken

	--8--

INSERT INTO Funcionarios VALUES ('Vasco',47,038,'30-11-1992');
INSERT INTO ComissarioDeBordo VALUES (47,'1.83'); -- taken

	--9--

INSERT INTO Funcionarios VALUES ('Filipe',48,039,'10-3-1993');
INSERT INTO ComissarioDeBordo VALUES (48,'1.82'); -- taken
	
	--10--

INSERT INTO Funcionarios VALUES ('Jose',49,040,'7-7-1991');
INSERT INTO ComissarioDeBordo VALUES (49,'1.81');


--Voos regulares--
--(A)--
--Ao Sabado, o voo numero 122, origem Lisboa, destino Nova Iorque, sai as 10 horas, chega as 13 horas e percorre 9000 km. 
--Esse voo deve ter uma tripulacao composta por: --
--1 piloto com mais de 9 anos de experiencia, um piloto com mais de 5 anos de experiencia, --
--2 hospedeiras com menos de 50 quilos, 
--2 hospedeiras com menos de 70 quilos, --
--1 comissarios com mais de 1.80 m e 
--1 comissario com mais de 1.65 m.--


INSERT INTO voo_regular VALUES (122,'Lisboa','Nova Iorque',9000,'10:00','13:00','Sabado');

INSERT INTO tripulacao_voo VALUES (122,11);
INSERT INTO tripulacao_voo VALUES (122,12);

INSERT INTO tripulacao_voo VALUES (122,21);
INSERT INTO tripulacao_voo VALUES (122,22);

INSERT INTO tripulacao_voo VALUES (122,33);
INSERT INTO tripulacao_voo VALUES (122,34);

INSERT INTO tripulacao_voo VALUES (122,48);
INSERT INTO tripulacao_voo VALUES (122,49);


--(B)--
--Ao Sabado, o voo numero 124, origem Nova Iorque, destino Lisboa, sai as 18 horas,chega as 23.30 horas e percorre 9000 km. 
--Esse voo deve ter uma tripulacao composta por: 
--1 piloto com mais de 9 anos de experiencia, um piloto com mais de 5 anos de experiencia,
--1 hospedeiras com menos de 50 quilos, 
--2 hospedeiras com menos de 70 quilos, 
--2 comissarios com mais de 1.65 m.

INSERT INTO voo_regular VALUES (124,'Nova Iorque','Lisboa',9000,'18:00','23:00','Sabado');

INSERT INTO tripulacao_voo VALUES (124,11);
INSERT INTO tripulacao_voo VALUES (124,12);

INSERT INTO tripulacao_voo VALUES (124,21);
INSERT INTO tripulacao_voo VALUES (124,22);

INSERT INTO tripulacao_voo VALUES (124,33);
INSERT INTO tripulacao_voo VALUES (124,34);

INSERT INTO tripulacao_voo VALUES (124,48);
INSERT INTO tripulacao_voo VALUES (124,49);



--(C)--
--Ao Domingo, o voo numero 125, origem Lisboa, destino Madrid, sai as 8.30 horas, chega as 11 horas e percorre 2000 km. 
--Esse voo deve ter uma tripulacao composta por: 
--1 piloto com mais de 5 anos de experiencia, 
--2 hospedeiras com menos de 70 quilos,
--1 comissario com mais de 1.65 m.

INSERT INTO voo_regular VALUES (125,'Lisboa','Madrid',2000,'8:30','11:00','Domingo');

INSERT INTO tripulacao_voo VALUES (125,15);

INSERT INTO tripulacao_voo VALUES (125,27);
INSERT INTO tripulacao_voo VALUES (125,28);

INSERT INTO tripulacao_voo VALUES (125,47);


--(D)--

--Ao Domingo, o voo numero 126, origem Madrid, destino Lisboa, sai as 14 horas, chega as 15 horas e percorre 2000 km. 
--Esse voo deve ter uma tripulacao composta por: 
--1 piloto com mais de 5 anos de experiencia, 
--2 hospedeiras com menos de 70 quilos,
--1 comissario com mais de 1.65 m.

INSERT INTO voo_regular VALUES (126,'Madrid','Lisboa',2000,'14:00','15:00','Domingo');

INSERT INTO tripulacao_voo VALUES (126,15);

INSERT INTO tripulacao_voo VALUES (126,27);
INSERT INTO tripulacao_voo VALUES (126,28);

INSERT INTO tripulacao_voo VALUES (126,47);


--(E)--
--A Segunda, o voo numero 127, origem Lisboa, destino Paris, sai as 8 horas, chega as 11 horas e percorre 3500 km.
-- Esse voo deve ter uma tripulacao composta por: 
--2 piloto com mais de 5 anos de experiencia, 
--4 hospedeiras com menos de 70 quilos,
--1 comissario com mais de 1.65 m. 


INSERT INTO voo_regular VALUES (127,'Lisboa','Paris',3500,'8:00','11:00','Segunda');

INSERT INTO tripulacao_voo VALUES (127,10);
INSERT INTO tripulacao_voo VALUES (127,14);

INSERT INTO tripulacao_voo VALUES (127,20);
INSERT INTO tripulacao_voo VALUES (127,25);
INSERT INTO tripulacao_voo VALUES (127,30);
INSERT INTO tripulacao_voo VALUES (127,31);

INSERT INTO tripulacao_voo VALUES (127,40);


--(F)--
--A Segunda, o voo numero 130, origem Paris, destino Bruxelas, sai as 12 horas, chegas 13 horas e percorre 800 km. 
--Esse voo deve ter uma tripulacao composta por: 
--1 piloto com mais de 5 anos de experiencia, 
--2 hospedeiras com menos de 70 quilos.


INSERT INTO voo_regular VALUES (130,'Paris','Bruxelas',800,'12:00','13:00','Segunda');

INSERT INTO tripulacao_voo VALUES (130,10);

INSERT INTO tripulacao_voo VALUES (130,20);
INSERT INTO tripulacao_voo VALUES (130,30);


--(G)--
--A Segunda, o voo numero 131, origem Bruxelas, destino Paris, sai as 14 horas, chegas 15 horas e percorre 800 km. Esse voo deve ter uma tripulacao composta por: 
--1 piloto com mais de 5 anos de experiencia, 
--2 hospedeiras com menos de 70 quilos.


INSERT INTO voo_regular VALUES (131,'Bruxelas','Paris',800,'14:00','15:00','Segunda');

INSERT INTO tripulacao_voo VALUES (131,10);

INSERT INTO tripulacao_voo VALUES (131,20);
INSERT INTO tripulacao_voo VALUES (131,30);


--(H)--
--A Segunda, o voo numero 128, origem Paris, destino Lisboa, sai as 18 horas, chegas 22 horas e percorre 3500 km. Esse voo deve ter uma tripulacao composta por: 
--2 piloto com mais de 5 anos de experiencia, 
--4 hospedeiras com menos de 70 quilos,
--1 comissario com mais de 1.65 m.

INSERT INTO voo_regular VALUES (128,'Paris','Lisboa',3500,'18:00','22:00','Segunda');

INSERT INTO tripulacao_voo VALUES (128,10);
INSERT INTO tripulacao_voo VALUES (128,14);

INSERT INTO tripulacao_voo VALUES (128,20);
INSERT INTO tripulacao_voo VALUES (128,25);
INSERT INTO tripulacao_voo VALUES (128,30);
INSERT INTO tripulacao_voo VALUES (128,31);

INSERT INTO tripulacao_voo VALUES (128,40);


--Trajectos--

--(A)--

--trajecto nº1, no dia 3/1/2011 tem os voos:
--127 com 310 passageiros, 
--128 com 304 passageiros, 
--130 com 250 passageiros, 
--131 com 390 passageiros; no aviao Francisco Zeimoto; 
--A tripulacao e composta pelos funcionarios com o no de BI: 10, 14, 20,25, 30, 31, 40. 
--O voo saiu com 5 minutos de atraso, e aterrou 10 minutos antes da hora prevista


INSERT INTO Trajetos VALUES (1,310,'8:05','10:50');
INSERT INTO Trajeto_vooRegular VALUES (1,127,'8:05');
INSERT INTO aviao_Trajeto VALUES (1,'Francisco Zeimoto','8:05');

INSERT INTO Trajetos VALUES (1,304,'18:05','21:50');
INSERT INTO Trajeto_vooRegular VALUES (1,128,'18:05');
INSERT INTO aviao_Trajeto VALUES (1,'Francisco Zeimoto','18:05');

INSERT INTO Trajetos VALUES (1,310,'12:05','12:50'); 
INSERT INTO Trajeto_vooRegular VALUES (1,130,'12:05');
INSERT INTO aviao_Trajeto VALUES (1,'Francisco Zeimoto','12:05');

INSERT INTO Trajetos VALUES (1,390,'14:05','14:50');
INSERT INTO Trajeto_vooRegular VALUES (1,131,'14:05');
INSERT INTO aviao_Trajeto VALUES (1,'Francisco Zeimoto','14:05');





 --(B)--
 --Trajecto nº2, no dia 1/1/2011 tem os voos: 
 --122 com 320 passageiros
 --124 com 290 passageiros; no aviao Nicolau Coelho; 
 --a tripulacao e composta pelos funcionarios com o nº de BI: 11, 12, 21, 22, 33, 34, 48,49.

INSERT INTO Trajetos VALUES (2,320,'10:00','13:00');
INSERT INTO Trajeto_vooRegular VALUES (2,122,'10:00');
INSERT INTO aviao_Trajeto VALUES (2,'Nicolau Coelho','10:00');

INSERT INTO Trajetos VALUES (2,290,'18:00','23:00');
INSERT INTO Trajeto_vooRegular VALUES (2,124,'18:00');
INSERT INTO aviao_Trajeto VALUES (2,'Nicolau Coelho','18:00');



--(C)--
--Trajecto nº3, no dia 8/1/2011 tem os voos: 
--122 com 320 passageiros
--124 com 290 passageiros; no aviao Nicolau Coelho; 
--a tripulacao e composta pelos funcionarios com o nº de BI: 11, 12, 21, 22, 33, 34, 48,49.

INSERT INTO Trajetos VALUES (3,320,'10:00','13:00');
INSERT INTO Trajeto_vooRegular VALUES (3,122,'10:00');
INSERT INTO aviao_Trajeto VALUES (3,'Nicolau Coelho','10:00');

INSERT INTO Trajetos VALUES (3,290,'18:00','23:00');
INSERT INTO Trajeto_vooRegular VALUES (3,124,'18:00');
INSERT INTO aviao_Trajeto VALUES (3,'Nicolau Coelho','18:00');

--(D)--
--Trajecto nº4, no dia 10/1/2011 tem os voos:
--127 com 310 passageiros
--128 com 304 passageiros, 
--130 com 250 passageiros 
--131 com 390 passageiros; no aviao Francisco Zeimoto; 
--a tripulacao e composta pelos funcionarios com o no de BI: 10, 13, 20, 25, 30, 31, 40.

INSERT INTO Trajetos VALUES (4,310,'8:00','11:00');
INSERT INTO Trajeto_vooRegular VALUES (4,127,'8:00');
INSERT INTO aviao_Trajeto VALUES (4,'Francisco Zeimoto','8:00');

INSERT INTO Trajetos VALUES (4,304,'18:00','22:00');
INSERT INTO Trajeto_vooRegular VALUES (4,128,'18:00');
INSERT INTO aviao_Trajeto VALUES (4,'Francisco Zeimoto','18:00');

INSERT INTO Trajetos VALUES (4,310,'12:00','13:00');
INSERT INTO Trajeto_vooRegular VALUES (4,130,'12:00');
INSERT INTO aviao_Trajeto VALUES (4,'Francisco Zeimoto','12:00');


INSERT INTO Trajetos VALUES (4,390,'14:00','15:00');
INSERT INTO Trajeto_vooRegular VALUES (4,131,'14:00');
INSERT INTO aviao_Trajeto VALUES (4,'Francisco Zeimoto','14:00');



