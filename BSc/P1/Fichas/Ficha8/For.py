#3

def pot():

    pot = int(input('Qual a maior potencia de 2 ? ' ))
    x = 0

    while x <= pot :
        y = 2**x
        print('2**',x,'==',y)
        x=x+1

#3.2

def poti():

    maior = int(input('Qual a maior potencia de 2 ? '))

    for i in range(0,maior+1):
        y=2**i
        print('2**',i,'==',y)


#4

def fat(n):

    y=1
    
    for i in range(1,n+1):
        y = i*y
        
    print(y)

#5

def fib (n):

    if n == 0 or n == 1 :
        return 1
    else:
        return fib(n-1)+fib(n-2)

def fibo (n):
    word = ''
    x=0
    while x < n :
        word = word + ' ' + str(fib(x))
        x=x+1
    print(word)
        

#6

def ate(t) :
    word = ''
    x = 0
    for c in range(0,t):
        if c <= 1 :
            word = word + ' ' + str(1)
        else:
            x=fib(c)
            if x > t :
                break
            else :
                word = word + ' ' + str(x)

    print(word)

    
#7

def eprimo(n):

    for i in range(2,n):
        if n % i == 0:
            return False
        
    return True
        
#8

def mostra(n):

    for i in range(2,n+1):
        if eprimo(i) ==True :
            print(i)

#9

def conta(n):
    x=0
    for i in range(2,n+1):
        if eprimo(i)==True:
            x=x+1

    print(x)
    
