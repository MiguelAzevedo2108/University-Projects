carrinho = []
quantidades =[]
preco = [] 

def adicionar(p,n,c): 
    adicionado = False
    if len(carrinho) == 0 :
        carrinho.append(p)
        quantidades.append(n)
        valor(c)
        
    else:
        for i in range(0,len(carrinho)) :
            if carrinho[i] == p :
                quantidades[i] = quantidades[i] + n
                adicionado = True
        
        if adicionado == False:
            carrinho.append(p)
            quantidades.append(n)
            valor(c)
            
def remover(p):

    for i in carrinho :
        if i == p :
            carrinho.remove(i)

def valor(p):
    preco.append(p)
    
mensagem = '\nIndique a sua opçao : \n[1] Adicionar produto : \n[2] Remover produto \n[3] Mostrar carrinho \n[4] Valor a pagar \n[5] Sair'

total = []

while True:
    print(mensagem)
    x = 0 
    op = int(input('Opçao : '))

    if op == 1 :
        produto = input('Produto a adicionar : ')
        quantidade = int(input('Quantidade : '))
        custo = int(input('Preço : '))
        adicionar(produto,quantidade, custo)
        
    if op == 2 :
        produto = input('Produto a remover : ')
        remover(produto)
        print(carrinho)

    if op == 3 :
        print(carrinho)
        print(quantidades)

    
    if op == 4 :
        for i in range(0,len(quantidades)):
            for c in range(0,len(preco)):
                if i == c :
                    x = quantidades[i]*preco[c]
            total.append(x)
            print('O preco de ', quantidades[i] ,carrinho[i],' e ',total[i],'€')
        
    if op == 5 :
        print('--------- Obrigado e Volte Sempre! -------')
        break



    
