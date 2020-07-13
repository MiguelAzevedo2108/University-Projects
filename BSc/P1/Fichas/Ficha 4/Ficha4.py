#1

def sucessor (n) :
    return n+1

#2

def quadradoSucessor(n) :
    
    return (n+1)*(n+1)


#3

def vel (v0,a,t):

    v=v0 + a*t

    print(v)



#4

def pos (p0,v0,a,t):

    p= p0 + v0*t+0.5*a*t*t

    print(p)


#5

def leny(x):

    y = 70-len(x)

    
    print(y*(" " ) , str(x))

#6

def custos(nl,cp,cu):

    custo = nl*cp*cu

    print(custo)


#7

def custo_encomenda(nl,pu):

    custo = nl*pu

    print ( custo ) 

    
#8

def tempo(d,v):

    t=d/v

    print (t)


#9

def hora():

    x = int(input("Qual o troço : " ))

    if x==1 :
        tempo(2,7.5)
        print(tempo)

    if x ==2 :
        tempo(6,10.9)
        print(tempo)

    if x == 3 :
        tempo(2,7.5)
        print(tempo)
    

#10

def triangulo (l1,l2,l3):

    if (l1+l2 > l3) and (l1+l3 > l2) and (l2+l3>l1):
        if (l1!=l2 and l1!=l3 and l2!=l3):
            print(" Os valores inseridos" , l1 , l2, l3 , "formam um triangulo escaleno")

        if(l1==l2 and l1!=l3) or (l1==l3 and l1!= l2) or (l2==l3 and l2!=l3):
            print("Os valores inseridos" , l1 , l2, l3 , "formam um triangulo isosceles")
            
        if(l1==l2==l3):
            print(" Os valores inseridos" , l1 , l2, l3 , "formam um triangulo equilatero")

    else :
        print('nao e triangulo')



    






    

    
