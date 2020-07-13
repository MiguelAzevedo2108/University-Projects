import random


####################################
#
# menu qual pode ser escolhido Menu jogador ou Menu Computador
#
####################################

def menu(): 

    op = input('[1] - Menu Jogador \n[2] - Menu Computador \nIntroduza opçao : ')

    if op == '1' :
        jogo1()

    elif op == '2':
        jogo2()

    else:
        print('Invalid input')
        menu()

############################################

#Retorno : retorna uma uma lista valida 
#Argumentos : Nao tem argumentos

############################################
        
def solution () : 
    l1 = []
    numbers = ['0','1','2','3','4','5','6','7','8','9']
    while True :
        soluçao = input('Soluçao : ')

        if utilizador(soluçao) == False:
            print('Invalid Input')
            continue
        
        if len(soluçao)!=4:
            print('Invalid Input')
            continue

        else:
            for i in soluçao :
                if i in numbers:
                    l1.append(i)                
                else:
                    l1=[]
                    print('Invalid Input')
                    break
                
            if len(l1)==4:
                return l1
            
        continue

    
#################################################

#esta funcao gera um codigo aleatorio 
#Argumentos : Nao tem argumentos
#Retorno : retorna uma lista de 4 algarismos em formato String diferentes aleatorios

#################################################
    
def generate () : 
    l = []

    while len(l) < 4 : 
        r = str(random.randint(0,9))

        if r not in l:
            l.append(r)
          
    return l

##################################################

#Argumentos : recebe como argumento uma lista 
#Retorno : retorna a lista introduzida como argumento em String

# Transforma-la o argumento introduzido numa String

##################################################

def add(solution):
               
    code = ''
    
    for i in range(len(solution)):
        code = code + str(solution[i])

    return code

##################################################

#Argumentos : recebe como argumento uma string
#Retorno : ira retornar um Boolean
# Esta funçao ira verificar se o argumento inserido contem algarismos repetidos

##################################################
def utilizador (pl) :        

    found = []
    
    for i in pl :
        if i not in found :
            found.append(i)
        else:
            return False
    return True

##################################################
#1º Trabalho

#Argumento : Nao recebe nenhum argumento
#Retorno : As jogadas do utilizador juntamente com o numero de touros e porcos

#Gera um numero aleatorio e pede ao utilizador um numero e consoante esse numero
# ele retorna o numero de touros e porcos ate qe o utilizador encontro o codigo gerado
# pelo computador

##################################################
def jogo1():
    
    final = add(generate())

    print(final)

    contagem = 0
    
    tentativas=['Tentativas:\n']
    
    while True :
            
            player = input('Player : ')
            
            if utilizador(player) == False :
                print('Invalid Input')
                
                continue

            if len(player) != 4 :
                print('Invalid Input')
                 
                
            else :
                
                touro = 0
                porco = 0
            
                for i in range(len(player)):
                     if player[i]==final[i]: 
                        touro = touro + 1
                                              
                for k in range(len(player)):
                    if player[k] in final and player[k]!=final[k]:
                        porco = porco + 1

                                                          
                contagem = contagem + 1
                x='T{}: {}, {}T {}P'.format(contagem,player,touro,porco)
                tentativas.append(x)

                print(x) 
                
                
                if player == final:
                    print('\nAcertou\n')
                    
                    for x in tentativas:
                        print(x)
                    break
                
#######################################################
# Argumentos : Nao recebe argumentos
# Retorno : Todos os numeros gerados pelo computador juntamente com os inputs
#           inseridos pelo utilizador
#
# Gera um codigo aleatorio, pede ao utilizador o numero de porcos e touros desse numero
# e gera novos codigos ate que o numero de touros inseridos pelo utilizador seja
# 4, o que significa que o computador chegou ao numero pensado pelo utilizador
#
#

########################################################
def jogo2 () :
    
    soluçao  = add(solution())
    lista = generate()
    code = add(lista)
    print(code)

    touro = int(input('Touros : '))
    porco = int(input('Porcos : '))

    contagem = 0
    touros = touro

    attempts= ['Tentativas:\n']
    final = 'T{}: {}, {}T, {}P'.format(contagem, add(lista), touros,porco)
    attempts.append(final)

    while touros !=4:
        
        for c in range(len(lista)):
            i = 0
                       
            while i <= 9 :
                 
                keeper = lista[c]
                lista[c]=str(i)            
                    
                if i == 9 and utilizador(lista) == False:
                    lista[c] = keeper
                    if utilizador(lista) == False:
                        lista[c] = chr(ord(keeper) -1)
                        if utilizador(lista) == False:
                            lista[c] = chr(ord(keeper) -2) 
                    break
                
                if utilizador(lista) == True :
                    contagem = contagem + 1
                    
                    print(add(lista))
                    
                    touros = int(input('Touros : '))
                    porco = int(input('Porcos : '))
                    
                    final = 'T{}: {}, {}T, {}P'.format(contagem, add(lista), touros,porco)
                    attempts.append(final)
                    
                    if touro < touros :
                        touro = touros 
                        break
                    
                    elif touros < touro:
                        lista[c] = keeper
                        touros = touro
                        c=c-1
                        break

                else:
                    touro = touros
                    
                i = i+1
                
            if touros == 4:
                print('Acertou : ')
                for i in attempts:
                    print(i)
                break
                
