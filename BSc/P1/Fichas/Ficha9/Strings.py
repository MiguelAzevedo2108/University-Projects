#3

def letras(n):

    c = 0

    while c < len(n):
        print(n[c])
        c=c+1

#3.1

def let(n):

    for i in range(0,len(n)):
        print(n[i])


#4

def inv(n):
    n= n[::-1]
    for i in range(0,len(n)):
        print(n[i])

#5

def escala(n):
    x=len(n)
    while x>0:
        print(n[:x])
        x=x-1
        

#6

def espelho(n):

    print(n[0::]+n[::-1])

#7

def pal(x):
    
    y = x[::-1]

    if y == x :
        return True
    else:
        return False
    
#8

def vogal(x):
    c=0
    for i in range(0,len(x)):
        if x[i] == 'a':
            return True
        elif x[i] == 'e':
            return True
        elif x[i] == 'i':
            return True
        elif x[i] == 'o':
            return True
        elif x[i] == 'u':
            return True
         
            
    return False

#8 b)

def contav (n):
    x=0

    for i in n :
        if vogal(i)==True:
            x=x+1
    print(x)

#9

def occo(letra, s ):

    x=s.count(letra)
    print(x)

#10

def occ(letra, s,indice):
    
    x= s.count(letra,indice,len(s))
    print(x)

#11

def case (letra, s, indice):

    y= s.lower()
    x= y.count(letra,indice,len(s))
    print(x)
    
    













    




