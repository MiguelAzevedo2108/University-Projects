#1

def fati (n):

    y = 1
    x = 1

    while x <= n  :

        y = y * x

        x = x + 1 

    print(y)


#1.1

def fat (n) :
    
    if n==1 or n == 0 : 
        return 1

    else :
        return n * fat(n-1)
    

#2

def fibonacci(n) :
    
    if n == 0 or n ==1 :
        return 1
    
    if n > 1 : 
        return fibonacci(n-1) + fibonacci(n-2)


#3

def soma(n) :

    if n==1:
        return 1 
    if n > 1 :

        return n + soma(n-1)


#4

def mul (n,i):

    if i == 1 :
        return n

    if i > 1 :
        return n + mul(n,i-1)



#5

def mdc (m,n):

    if n == m :
        return m
    elif m > n :
        return mdc(m-n,n)
    elif m < n :
        return mdc (m,n-m)

#6

def ack (m,n):

    if m == 0 :
        return n+1
    if m > 0 and n == 0 :
            return ack(m-1,1)
    if (m> 0 and n > 0) :
        return ack(m-1,ack(m,n-1))


#7

def pascal (lin, col) :

    if col == 0 or col == lin :
        return 1

    else :
        return pascal(lin-1,col-1) + pascal(lin-1,col)


#8

def pasc(n):

    c = 0
    
    word = '' 
    while c <= n :
        x=0
        while x <= c :
            word = word + ' ' + str(pascal(c,x))
            x=x+1

        print(word)
        word= ''
        c= c+1
    






