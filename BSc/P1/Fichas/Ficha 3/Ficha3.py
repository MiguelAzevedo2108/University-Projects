#Ex 1

def maior ():

    x = int(input("Insira o numero 1 : " ))

    y = int(input("Insira o numero 2 : " ))

    if (x > y) :
        print("1")

    if (x==y) :
        print("0")

    if( x<y):
        print("-1")


#Ex 2
        
import math

def pitagoras():

    cat1= float(input("Qual o comprimento do cateto 1 : " ))

    cat2 =float(input("Qual o comprimento do cateto 2 : " ))

    h = math.sqrt(cat1*cat1 + cat2*cat2)

    print(h)


#Ex 3

def contagem():

    num= int(input("Qual o limite da contagem : "))

    x = 0
    
    while x<num:

        x=x+1
        print(x)
        
    while num > 0 :
        num = num - 1

        print(num)
    

#Ex 4

def valor () :

    y = 0 
    while True : 
        x = int(input("Qual o valor : "))
        if x == 0 :
            break

        else :
             y = y + x           

    print("A soma e " , y)
            

#Ex 5

def media ():

    y = 0
    c = 0 
    while True :
        x = int(input("Qual o valor : " ))

        if x == 0 :
            break

        else :
            y = y + x
            c= c+1

    print("Foram introduzidos ", c , " e a media e " , y/c)


#Ex 6

def newton ():

    raiz = int(input("Valor de n : " ))

    est = int(input("Estimativa : " ))

    while True :

        novaest = (est + (raiz/est))/2
        
        if abs(novaest - est)<0.0001 :
            break

        est = novaest

    est = novaest
    
    print("Raiz : ", est)

    print("Math.sqrt : ", math.sqrt(raiz))
    
    dif = est - math.sqrt(raiz)

    print("Diferença : ", dif)    



#Ex 7

def combustivel ():

    litros = int(input("Quantidade de litros : "))

    comb = input("Tipo de combustivel (gasoleo, gasolina95, gasolina98) : " )

    if comb == "gasoleo" :
        
        dia = int(input("Dia : " ))

        if 1 <= dia < 15 :
            preco = round(1.149 * litros, 2)

        elif 15 <= dia < 32 :
            preco = round((1.149 - 0.023) * litros, 2 )
        

        print("O custo de ", litros , "litros de " , comb , "no dia " , dia ," e de " , preco)

    if comb == "gasolina95" :

        dia = int(input("Dia : "))

        if (1 <= dia < 15) :
                preco = round(1.1364 * litros, 2)

        elif (15<= dia < 32) :
            preco = round((1.1364 - 0.023) * litros, 2)

        print("O custo de ", litros , "litros de " , comb , "no dia " , dia ," e de " , preco)

            
        
    if comb == "gasolina98" :

        preco = round(1.414 * litros, 2 )

        print("O custo de ", litros , "litros de " , comb ,  "e de " , preco)


#Ex 8

def fatorial () :

    num = int(input("Insira um numero : " ))

    y=1

    if num > 0 :
        
        while (num > 0) :
        
            y= num * y

            num = num -1 

        print(y)
   
    
    if (num < 0) :
        
        print("O valor e negativo")
       

#Ex 9


def mul () :

    num1 = int(input("Valor A : " ))

    num2 = int(input("Valor B : " ))

    x = 0
    
    while x < 50 :
        x = x + 1

        if (x%num1 == 0) or (x%num2 == 0):
            print(x)

        
#Ex 10
            
def both () :

    num1 = int(input("Valor A : " ))

    num2 = int(input("Valor B : " ))

    x = 0

    while x < 50 :
        x = x + 1

        if (x%num1 == 0) and (x%num2 == 0) :
            print(x , " multipo de " , num1 , "e multiplo de " , num2)

        if (x%num1 == 0):
            print(x, " multiplo de " , num1)

        if (x%num2 == 0) :
           print(x, " multiplo de " , num2)
            
