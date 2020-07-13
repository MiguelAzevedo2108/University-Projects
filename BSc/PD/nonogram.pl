%matriz transposta

transpose([], []).
transpose([F|Fs], Ts) :-
    transpose(F, [F|Fs], Ts).

transpose([], _, []).
transpose([_|Rs], Ms, [Ts|Tss]) :-
        lists_firsts_rests(Ms, Ts, Ms1),
        transpose(Rs, Ms1, Tss).

lists_firsts_rests([], [], []).
lists_firsts_rests([[F|Os]|Rest], [F|Fs], [Os|Oss]) :-
        lists_firsts_rests(Rest, Fs, Oss).

/*-------------------------------------------------------------*/
	

contar([],0).
contar([H|T],X):-
	contar(T, X1),
	X is (H+X1).


n_seguidos(0, L, L).
n_seguidos(X, [1|L], T):-
	X>0,
	X1 is X-1,
	n_seguidos(X1,L,T).

espaco_obrigatorio(T,T,[]).
espaco_obrigatorio([0|T],T,X).


verifica_restricoes([],[]) :- !.
verifica_restricoes(L1, [H|T]) :-
	primeiro_um(L1, Fim1),
	n_seguidos(H,Fim1,Fim2),
	espaco_obrigatorio(Fim2,Fim3,T),
	primeiro_um(Fim3,Fim4),
	verifica_restricoes(Fim4,T).

primeiro_um([],[]).
primeiro_um([1|T], [1|T]).
primeiro_um([0|T],R) :-
    primeiro_um(T, R).


restricoes_lista(C,P,Lista):-
	contar(Lista,K),	
	Size is P-K, 
	length(C,P), 		
	fd_domain(C,0,1),	
	fd_exactly(K,C,1),	
	fd_exactly(Size,C,0),
	verifica_restricoes(C,Lista).


/*-------------------------------------------------------------*/

matrizFinal([],_,0).
matrizFinal([A|B], [C,D|_],N):-  
	length(D, Colunas),
	length(A,Colunas),
	fd_domain(A,0,1),
	N1 is N-1,
	matrizFinal(B,[C,D|_],N1).


restricoes_matriz(_,[],_).
restricoes_matriz([C|D], [A|B], Colunas) :-
	length(Colunas,N1),
	restricoes_lista(A, N1, C),
	restricoes_matriz(D,B,Colunas). 


solve([[Linhas|RestoLinhas]|[[Colunas|RestoColunas]]],Final2) :-
	length([Linhas|RestoLinhas],Nlinhas),
	matrizFinal(X,[[Linhas|RestoLinhas],[Colunas|RestoColunas]|[]],Nlinhas),
	restricoes_matriz([Linhas|RestoLinhas], Final, [Colunas|RestoColunas]),
	transpose(Final,FinalTransposta),
	restricoes_matriz([Colunas|RestoColunas], FinalTransposta, [Linhas|RestoColunas]),
	transpose(FinalTransposta, Final2),
	Final2 \= [],
	maplist(fd_labeling,Final2).


switch([[]],[[]]).
switch([[]|Resto],[[]|C]) :- switch(Resto,C).
switch([[0|X]|Resto], [['.'|L]|C]) :- switch([X|Resto],[L|C]).
switch([[1|X]|Resto], [['X'|L]|C]) :-switch([X|Resto],[L|C]).


printFinal([]).
printFinal([[]|Resto]) :- nl,
	printFinal(Resto).
printFinal([[A|X]|Resto]) :-
	write(A), 
	printFinal([X|Resto]).


%Output
puzzle([[Linhas|RestoLinhas]|[[Colunas|RestoColunas]]]) :-
	solve([[Linhas|RestoLinhas]|[[Colunas|RestoColunas]]], X),
	switch(X,Y),
	printFinal(Y).


% teste 1 -> puzzle([[[1],[3],[1,1,1],[1],[1]],[[1],[1],[5],[1],[1]]]).  seta

% teste 2 -> puzzle([[[3],[3],[1,2],[2],[2]],[[1],[2],[2],[1,3],[1,3]]]).	

% teste 3 -> puzzle([[[1,1],[2],[2],[4],[3]],[[1,3],[3],[2],[1,1],[2]]]).

% teste 4 -> puzzle([[[5],[5],[4],[1,1,1],[6],[5]],[[1],[2,3],[3,2],[6],[3,2],[6]]]).



















	
	
