#1

def max (n1,n2,n3):

    if n1 <= n2 <= n3 or n2 <= n1 <= n3 :
        return n3
    if n2 <= n3 <= n1 or n3 <= n2 <= n1 :
        return n1
    if n3 <= n1 <= n2  or n1 <= n3 <= n2:
        return n2

#2

def min (n1,n2,n3):

    if n1 >= n2 >= n3 or n2 >= n1 >= n3 :
        return n3
    if n2 >= n3 >= n1 or n3 >= n2 >= n1 :
        return n1
    if n3 >= n1 >= n2  or n1 >= n3 >= n2:
        return n2
    

#3

def triangulo (l1,l2,l3):

    lmax=max(l1,l2,l3)

    if lmax==l1 :
        
        if lmax >= l3+l2 :
            print('nao existe triangulo')

        else:
            if (lmax**2) == (l2*l2)+(l3*l3):
                print('triangulo retangulo')

            if (lmax**2) > (l3*l3)+(l2*l2):
                print('triangulo obtuso')

            if (lmax**2) < (l3*l3)+(l2*l2):
                print('triangulo agudo')


    if lmax == l2 : 
        if lmax >= l1+l3 :
            print('nao existe triangulo')

        else:
            if (lmax**2)== (l1*l1)+(l3*l3):
                print('triangulo retangulo')

            if (lmax**2) > (l3*l3)+(l1*l1):
                print('triangulo obtuso')

            if (lmax**2) < (l1*l1)+(l3*l3):
                print('triangulo agudo')


    if lmax==l3 :
        if lmax >= l1+l2 :
            print('nao existe triangulo')

        else:
            if (lmax**2)== (l2*l2)+(l1*l1):
                print('triangulo retangulo')

            if (lmax**2) > (l1*l1)+(l2*l2):
                print('triangulo obtuso')

            if (lmax**2) < (l1*l1)+(l2*l2):
                print('triangulo agudo')


#4
import math
def raiz (a,b,c):
    x=b**2-4*a*c
    
    if x >= 0 : 
        x1= (-b + math.sqrt(x))/2*a
        x2 = (-b - math.sqrt(x))/2*a
        print(x1)
        print(x2)

    else :
        return None


#5

def calcula (n1,n2,op):

    if op == '+' :
        return n1+n2
    if op == '-':
        return n1-n2
    if op == '*' :
        return n1*n2
    if op == '/':
        return n1/n2

#6

def mdc (n1,n2) :
    l1= []
    l2 = []
    x = 1
    y = 1

    while x <= n1 :
        if n1 % x == 0 :
            l1.append(x)

        x=x+1
    l1.sort()
    
    while y <= n2 :
        if n2 % y == 0 :
            l2.append(y)

        y=y+1
        
    l2.sort()

    l3= []
    
    for i in l1 :
        for j in l2 :
            if i == j :
                l3.append(i)
    print(l3[-1])


#7

def mmc(n1,n2):
    l1= []
    l2 = []
    x = 1
    y = 1

    while x <= n1 :
        if n1 % x == 0 :
            l1.append(x)

        x=x+1
    l1.sort()
    
    while y <= n2 :
        if n2 % y == 0 :
            l2.append(y)

        y=y+1
        
    l2.sort()

    l3= []
    
    for i in l1 :
        for j in l2 :
            if i == j :
                l3.append(i)
    print(l3[0])
    

#7

def mmc(n1,n2):
    x=2

    while x <= n1*n2:
        if x%n1== 0  and x%n2==0:
            print(x)  
        x=x+1

#8

def somacubos(n1):

    x = n1//100 
    y = n1%10 

    z = n1//10

    w = z %10

    if n1 == (x**3 ) + (w**3) + (y**3) :
        print('s')

    else:
        return None
    

#9

def serie (x) :
    p=0
    i = 3
    y = 5
    while p< 3  :
        w= -((1/(i))*x**i) + ((1/(y))*x**y)
        i=i+4
        y=y+4
        p=p+1
    print(x+w)
        
#10

def fatorial (n):

    y = 1
    x=1
    while x <= n :
        y = y * x
        x=x+1
    print(y) 
    
        
    






    
