--SQL--
--(A)
--Quais os voos que a companhia tem aos Domingos? 
--Indique o numero, origem, destino e hora de partida.

select numVoo from voo_Regular
where vooRegular.data = 'Domingo'

select origem from voo_Regular
where Voo_regular.data = 'Domingo';

select destino from voo_Regular 
where Voo_regular.data = 'Domingo';

select horap from voo_Regular
where Voo_regular.data = 'Domingo';


--(B)--
--Que voos fez o aviao Nicolau Coelho--

select numVoo
from trajeto_vooRegular natural join aviao_trajeto
where aviao_trajeto.nomeAviao = 'Nicolau Coelho';


--(C)--
--Qual e o aviao com mais autonomia--

select nomeAviao, max(autonomia)
from aviao
group by nomeaviao order by autonomia desc limit 1;


--(D)--
--Qual o e voo que precisa de mais tripulantes--

select numVoo, count(bi) as count
from tripulacao_voo
group by numVoo order by count desc limit 1  ;


--(E)--
--Qual e a hospedeira que fez mais voos?--

select bi, count(bi) as count 
from hospedeiras natural join tripulacao_voo
where hospedeiras.bi = tripulacao_voo.bi
group by bi order by count desc limit 1;


--(G)--
-- Qual e o trajecto com mais voos--

select numTrajeto, count(numVoo) as x 
from trajeto_vooRegular 
group by numTrajeto order by x desc limit 1;











