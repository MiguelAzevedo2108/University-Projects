#2

def ordem (l):
    x=[]
    for i in l :
        x.append(i)

    x.sort()

    if x == l :
        return True
    else:
        return False

#3

def corta(l):
    l.pop(0)
    l.pop(-1)
    print(l)

#3b

def meio(l):

    x = []

    for i in l :
        x.append(i)

    x.pop(0)
    x.reverse()
    x.pop(0)
    x.reverse()

    print(x)


#4

def comum(l1,l2):
    x=0
    for i in l1:
        for c in l2:
            if i == c :
                x=x+1
    print(x)


#5

def soma (l):                           
    x = []

    for i in range(len(l)):
        p=0
        for c in range(len(l)):
            p=p+l[c][i]
            
        x.append(p)
    print(x)

#6

def id(l):

    for i in range(len(l)):
        p=0

        for c in range(len(l)):
            p=p+l[c][i]
            
            if p!=1 :
                return False
    return True

#7

def combina(pals1,pals2):

    for i in range(len(pals1)):
        word = ' '
        for c in range(len(pals2)):
            word = word + pals1[i]+ ' ' + pals2[c]
            print(word)
            word= ' ' 

#8

def desc(pals,ordem):  # Not Done
    
    if len(pals)!=len(ordem):
        return -1

    word= ' ' 

    for i in range(len(pals)):
        for c in range(len(ordem)):
            if pals[i] == c :
                word = word + ' ' + pals[i]
    print(word) 


#9

def top3 ():
    lista2 = []  

    times = int(input("Quantos tempos pretende inserir : "))

    x=1
    
    while x <= times :
        tguy = float(input("Tempo do atleta : "))
        lista2.append(tguy)
        x=x+1

    lista2.sort()

    lista3= []

    for i in range(0,3):
        lista3.append(lista2[i])
    
    print("O top3 de ", lista2, "e" , lista3)
        

#10

def acumulado (lista) :
    
    d = []

    x = 0 
    
    for i in range(len(lista)):
        x = x + lista[i]
        d.append(x)

    print(d)


#11

def consulta_preco(artigo):

    tabela = ([['jarro',20.6],['almofada',18],['candeeiro',45]])

    for c in tabela :
        for i in tabela :
            if i[0] == artigo :
                return i[1]
                

#11 b

def caro():

    tabela = ([['jarro',20.6],['almofada',18],['candeeiro',45]])

    d = []
    
    for c in tabela :
        for i in tabela :
            d.append(i[1])

        
    x = d[-1]

    for z in tabela :
        for w in tabela :
            if w[1] == x :
                return w[0]    


