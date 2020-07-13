fila = []

def adicionar(nome):
    
    fila.append(nome)
    
def cons():
    for i in fila :
        print(i)
        
def remove (n) :
    for c in range(0,n):
        fila.pop(0)
    return fila

mensagem = "\nIndique a sua opcao:\
\n[1] Adicionar nome \n[2] Consultar lista \n[3] Retirar os primeiros n \n[0] Sair"

while True:
    print(mensagem)

    op = int(input("Opcao -> "))

    if op == 1 :
        nomepessoa= input('Nome a adicionar : ')
        adicionar(nomepessoa)

    if op == 2 :
        print('comprimento da fila : ' , len(fila))
        cons()

    if op == 3 :
        vaga = int(input('Quantos nomes conseguem vaga e saem da fila : '))
        remove(vaga)

    if op == 0 :
        print('Fim de execuçao')
        break
    




        
            
            
            
