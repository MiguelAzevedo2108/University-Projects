CC = gcc -Wall 
YACC = bison -d -v
LEX = flex

compile : pars.tab.c lex.yy.c
	$(CC) $^ compilador.c tree.c -o $@ -ll
	
pars.tab.c : pars.y
	$(YACC) $^

lex.yy.c : lex.lex
	$(LEX) $^

run-1: compile 
	@echo '[example1.ya]'
	@./compile < example1.ya 
	indent -br -brf -ce yac.c ya2.c

run-2: compile 
	@echo '[example2.ya]'
	@./compile < example2.ya 
	indent -br -brf -ce yac.c ya2.c	

run-3: compile 
	@echo '[example3.ya]'
	@./compile < example3.ya 
	indent -br -brf -ce yac.c ya2.c	

delete :
	@$(RM) compile
	@$(RM) pars.tab.c pars.tab.h pars.output
	@$(RM) lex.yy.c
	@$(RM) yac.c ya2.c ya2.out
