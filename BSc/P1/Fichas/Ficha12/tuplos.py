#11a

def consulta(artigo):
    
    tabela = (('jarro',20.6),('almofada',18),('candeeiro',45))

    for i in tabela :
        for c in tabela :
            if c[0] == artigo :
                return c[1]
            
#11b

def caro():

    tabela = (('jarro',50),('almofada',18),('candeeiro',45))
    x = 0
    for i in tabela :
        for c in tabela:
            if c[1]>x :
                x=c[1]
    return x
