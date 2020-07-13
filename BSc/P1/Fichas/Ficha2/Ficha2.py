import math


#Ex 2 
def mat () :

    raio = int (input("Qual o raio ? " ))

    perimetro = (math.pi) * raio

    area = math.pi* raio * raio

    volume = (4 * math.pi * raio*raio*raio)/3

    print("Perimetro da circunferencia = " + str(perimetro) + "\n" + 
          "Area do circulo = " + str(area) + "\n " + 
          "Volume da esfera = " + str(volume))

#Ex 3

def raiz () :

    number = float(input("Number : " ))

    raiz = math.sqrt(number)

    print("A raiz e " , raiz)


#Ex 4

def meio (n1,n2,n3):

    if(n1<n2<n3) or (n3<n2<n1):
        print(n2)
    if(n2<n1<n3) or (n3<n1<n2):
        print(n1)
    if(n2<n3<n1) or (n1<n3<n2):
        print(n3)



#Ex 5

def intervalo() :

    n = int(input("Indique um numero  : "))

    if (n<-10) or (5<=n<45) or (120<n<=245):
        print("Esta no intervalo")
    else:
        print("Nao esta no intervalo")



#Ex 6

def altura () :

    alt = float(input("Qual a altura da pessoa : " ))

    if (alt < 1.30) :
        print("A pessoa e baixissima")

    elif (1.30 <= alt <1.6 ) :
        print("A pessoa e baixa" )

    elif (1.60<=alt <1.75 ):
        print("A pessoa e mediana")

    elif (1.75<=alt<1.90):
        print("A pessoa e alta")

    elif(alt>1.90):
        print("A pessoa e altissima")



#Ex 7

def numbers(n1,n2):
    
    if (n1%n2==0):
        print(n1, 'e multiplo de ',  n2)

    else :
        print("nao e multiplo")



#Ex 8

def vel (v):

    d = 0.5*((v*v)/10)

    print (d)



#Ex 9

def capicua():

    n = input("Insira um numero :")
    
    n1=str(n)
    if (n1[0]==n1[2]):
        print("E capicua")

    else:
        print("Nao e capicua")



#Ex 10

def coord():

    x = int(input("Indique a coordenada X : "))

    y = int(input("Indique a coordenada Y : "))

    if (x<0 and y>0):
        print("2 quadrante")

    if (x>0 and y>0):
        print("1 quadrante")

    if (x<0 and y<0):
        print("3 quadrante")

    if (x>0 and y<0):
        print("4 quadrante")



#Ex 11

def dist (x1,y1,x2,y2):

    a = (x2-x1)*(x2-x1)

    b = (y2-y1)*(y2-y1)

    c = a + b

    d = math.sqrt(c)

    print(d)



#Ex 12

def ano(n) :

    if(n%4 == 0 and n%100 !=0 ) or (n%400 == 0) :
        print("Bissexto")

    else :

        print("Nao e bissexto")
        




        



        
