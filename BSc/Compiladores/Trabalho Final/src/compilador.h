#include <stdio.h>
#include <string.h>
#include "tree.h"

void root(StmList *root);
void printStmList (StmList *root);
void printDeclaration (Decl *root);
void printFunction (Func *root);
void printIdList (IdList *root);
void printType (Tipo *root);
void printArgs(ArgLista *root);
void printExp (Expressao *root);
void printOp (Operacao *root);

void translListStm (StmList *root);
void translDecl (Decl *root);
void translFunction (Func *root);
void translID (IdList *root);
void translType  (Tipo *root);
void translArg(ArgLista *root);
void translExp (Expressao *root);
void translOp (Operacao *root);
