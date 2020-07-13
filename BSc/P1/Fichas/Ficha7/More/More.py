#1

def mdc (m,n) :
    if n == m :
        return m
    if m > n :
        return mdc(m-n,n)
    if m < n :
        return mdc(m,n-m)

    
def simplificada (n,d):

    x = mdc(n,d)

    print(n/x, ' /', d/x)
    

#2

def soma (n1,d1,n2,d2):

    c = 0
    
    if d1 == d2 :
        c = n1 + n2
        simplificada(c,d1)

    else :
        d4 = d2 * d1
        d3 = d1 * d2
        n3 = n1 * d2
        n4 = n2 * d1

        c = n3+ n4
        simplificada(c,d3)
        

#3

def rev(n):

    c = 1
    y=0
    while n > 1:

        n = n/c
        c= c+1
        y=y+1
    print(y)


#6

def num(h):

    word = ' '
    x = 1
    while x <= h : 
        word = word + ' ' +  str(x)
        x=x+1
        print(word)


#7

def tree (h) :

    x = 1
    y = 1
    word = ''
    b = (h *2) - 1
    c=b//2
    
    while y <= h :
        word =c*(' ') + x*('*') + c*(' ' )
        x = x+2
        y=y+1
        print(word)
        c=c-1

    p=b//2

    print(p*(' ') + '*')
    print(p*(' ') + '*')



    
        
    
        
