%{
	
	#include <stdio.h>
	#include <math.h>
	#include <string.h>
	#include <stdlib.h>
	#include "compilador.h"


	int yylex(void);				
	
	void yyerror(char *message)
	{
		fprintf(stderr, "ERRO: %s ", message);
	}	

%}

%error-verbose  

%union{
				int val;
			    double flt;
			    char *str;
			    char *id;
			    int boolean;
			    struct StmList *stmlist;
			    struct StmList *stmlist1;
			    struct StmList *stmlist2;
			    struct Decl *decl;
			    struct Func *func;
			    struct IdList *idlist;
			    struct ArgLista *arglista;
			    struct Tipo *tipo;
			    struct Operacao *operacao;
			    struct Expressao *expressao;
			    struct Expressao *expressao1;
			    struct Expressao *expressao2;
}

//IDENTIFICAR ESTRUTURAS DE DADOS
%token <id> ID
%token <str> STR
%token <val> NUM
%token <flt> FLT
%token <boolean> BOOL_LITERAL
%token PRINT
%token PONTO VIRGULA DOISPONTOS
%token DEF IF THEN ELSE WHILE DO RETURN BREAK NEXT
%token INT FLOAT BOOL VOID STRING
%token INPUT OUTPUT
%token PARCURVESQ PARCURVDIR CHAVETAESQ CHAVETADIR PARRECTESQ PARRECTDIR

%left PONTOVIRGULA
%left SOMA SUB
%left MULT DIV MOD 
%left OR
%left AND
%left NOT

%right EXP
%right IGUAL

%nonassoc IGUALIGUAL MENOR MAIOR MENORIGUAL MAIORIGUAL DIF

%type <stmlist> stmlist
%type <decl> decl
%type <func> func
%type <idlist> idlist
%type <tipo> tipo
%type <arglista> arglista
%type <operacao> operacao
%type <expressao> expressao

%%

//SINTAXE

program: stmlist          {root($1);};                                                             
		



stmlist: decl PONTOVIRGULA                  {$$ = newStmList(decl_pontovirg,$1,NULL);};
	   | decl PONTOVIRGULA stmlist 			 {$$ = newStmList(decl_pontovirg_stmList,$1,$3);};



decl: idlist DOISPONTOS tipo 						   {$$ = newDecl(idlist_dpontos_tipo,$1,$3,NULL,NULL,NULL,NULL,NULL);};
	| idlist DOISPONTOS tipo IGUAL expressao   	       {$$ = newDecl(idlist_dpontos_tipo_igual_exp,$1,$3,$5,NULL,NULL,NULL,NULL);};
	| ID IGUAL expressao							   {$$ = newDecl(id_igual_exp,NULL,NULL,$3,NULL,NULL,NULL,$1);};
	| func											   {$$ = newDecl(funcao,NULL,NULL,NULL,NULL,NULL,$1,NULL);};
	| IF expressao THEN CHAVETAESQ stmlist CHAVETADIR      {$$ = newDecl(if_exp_then_stmList,NULL,NULL,$2,$5,NULL,NULL,NULL);};    
	| IF expressao THEN CHAVETAESQ stmlist CHAVETADIR ELSE CHAVETAESQ stmlist CHAVETADIR      {$$ = newDecl(if_exp_then_stmList_else_stmList,NULL,NULL,$2,$5,$9,NULL,NULL);};
	| WHILE expressao DO CHAVETAESQ stmlist CHAVETADIR     {$$ = newDecl(while_exp_do_stmList,NULL,NULL,$2,$5,NULL,NULL,NULL);};
	| PRINT PARCURVESQ expressao PARCURVDIR                        {$$ = newDecl(print_,NULL,NULL,$3,NULL,NULL,NULL,NULL);};
	| RETURN expressao                                 {$$ = newDecl(return_,NULL,NULL,$2,NULL,NULL,NULL,NULL);};
	| INPUT PARCURVESQ ID PARCURVDIR              				   {$$ = newDecl(input_id,NULL,NULL,NULL,NULL,NULL,NULL,$3);};
	| OUTPUT PARCURVESQ ID PARCURVDIR 							   {$$ = newDecl(output_id,NULL,NULL,NULL,NULL,NULL,NULL,$3);};
	| BREAK											   {$$ = newDecl(break_,NULL,NULL,NULL,NULL,NULL,NULL,NULL);};
	| NEXT											   {$$ = newDecl(next_,NULL,NULL,NULL,NULL,NULL,NULL,NULL);};
	| DEF ID tipo 									   {$$ = newDecl(def_id_type,NULL,$3,NULL,NULL,NULL,NULL,$2);};
	


func: ID PARCURVESQ arglista PARCURVDIR DOISPONTOS tipo CHAVETAESQ stmlist CHAVETADIR   {$$ = newFunc(id_arglist_dpontos_tipo_stmList,$1,$6,$3,$8);};
	| ID PARCURVESQ PARCURVDIR DOISPONTOS tipo CHAVETAESQ stmlist CHAVETADIR 			{$$ = newFunc(id_pars_dpontos_tipo_stmList,$1,$5,NULL,$7);};
	| ID PARCURVESQ PARCURVDIR 														{$$ = newFunc(id_pars,$1,NULL,NULL,NULL);};
	| ID PARCURVESQ arglista PARCURVDIR 											{$$ = newFunc(id_arglist,$1,NULL,$3,NULL);};



idlist: ID 								{$$ = newIdList(id_,$1,0,NULL);};
	  | ID VIRGULA idlist 				{$$ = newIdList(id_virg_idlist,$1,0,$3);};
	  | NUM 							{$$ = newIdList(num_,NULL,$1,NULL);};
	  | NUM idlist 						{$$ = newIdList(num_idlist,NULL,$1,$2);};
	  ;


tipo: INT                 				{$$ = newTipo(int_);};
	| FLOAT 							{$$ = newTipo(float_);};
	| STRING 							{$$ = newTipo(string_);};
	| BOOL 								{$$ = newTipo(bool_);}; 
	| VOID 								{$$ = newTipo(void_);};
	;


arglista: idlist DOISPONTOS tipo                      {$$ = newArgLista(idlist_dpontos_tipo_argL,$1,$3,NULL);};
  	    | idlist DOISPONTOS tipo VIRGULA arglista 	  {$$ = newArgLista(idlist_dponstos_tipo_virg_args,$1,$3,$5);};	
  	    | idlist 									  {$$ = newArgLista(idlist_,$1,NULL,NULL);};
		;


expressao: ID  									{$$ = newExpressao(id_exp,$1,NULL,NULL,NULL,0,NULL,0.0,0,NULL);};
	 	 | STR 									{$$ = newExpressao(str_,NULL,NULL,NULL,NULL,0,NULL,0.0,0,$1);};
		 | expressao operacao expressao 		{$$ = newExpressao(exp_op_exp,NULL,$1,$3,$2,0,NULL,0.0,0,NULL);};	
		 | BOOL_LITERAL 						{$$ = newExpressao(bool_lit,NULL,NULL,NULL,NULL,0,NULL,0.0,$1,NULL);};
		 | FLT 									{$$ = newExpressao(flt_,NULL,NULL,NULL,NULL,0,NULL,$1,0,NULL);};
		 | NUM 									{$$ = newExpressao(num_exp,NULL,NULL,NULL,NULL,$1,NULL,0.0,0,NULL);};
		 | func 								{$$ = newExpressao(func_,NULL,NULL,NULL,NULL,0,$1,0.0,0,NULL);};
		 ;


operacao: SOMA 									{$$ = newOperacao(soma_);};
		| SUB 							{$$ = newOperacao(subtracao_);};
		| DIV 								{$$ = newOperacao(divisao_);};
		| MULT 						{$$ = newOperacao(multiplicacao_);};
		| MOD 									{$$ = newOperacao(mod_);};
		| EXP 								{$$ = newOperacao(potencia_);};
		| IGUAL 								{$$ = newOperacao(igual_);};
		| IGUALIGUAL 							{$$ = newOperacao(igual_igual);};
		| DIF 							{$$ = newOperacao(diferente_);};
		| MENOR 								{$$ = newOperacao(menor_);};
		| MAIOR 							    {$$ = newOperacao(maior_);};		
		| MENORIGUAL 							{$$ = newOperacao(menorIgual_);};
		| MAIORIGUAL 							{$$ = newOperacao(maiorIgual_);};
		| AND 									{$$ = newOperacao(and_);};
		| OR 									{$$ = newOperacao(or_);};
		| NOT 									{$$ = newOperacao(not_);};
		;

%%

int main()
{
	return yyparse();
}



