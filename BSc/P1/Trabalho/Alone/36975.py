import random

#Variaveis Globais
contagem = 0
found = []
tentativas=['Tentativas:\n']
###########################################

def generate () : #esta funcao gera um codigo aleatorio de 4 elementos em qe 
                  #nao repete nenhum numero 
    l = []

    while len(l) < 4 : 
        r = random.randint(0,9)

        if r not in l :
            l.append(r)
          
    return l
###########################################

def add():      #esta funcao converte o codigo gerado pela funcao generate e transforma-o
                #em string para depois poder verificar posiçoes necessarias para o funcionamento
                #do programa
            
    code = ''
    solution = generate()
    
    for i in range(len(solution)):
        code = code + str(solution[i])

    return code
###########################################

def utilizador (pl) :        #Utilizador - ira verificar se o codigo que o player introduzio e valido
                             #             ou nao. Isto significa nao existir numeros repetidos no codigo introduzido
                             #             ele ira retornar True. Para verificar isso, foi criada uma variavel global found
                             #             do tipo List que ira adicionar os elementos introduzidos pelo player e ira retornar
                             #             True or False se existir ou nao elementos repetidos

    for i in pl :
        if i not in found :
            found.append(i)
        else:
            return False
    return True
###########################################
final = add()

print(final)

#Aqui e onde ira ser executado o ciclo ate o codigo introduzido pelo player ser o certo. E chamado a funçao utilizador para verificar o input, se este for valido
#ira entao passar a contagem dos touros e dos porcos e sempre que esta parte e executada a variavel global 'contagem' e incrementada +1 para depois ser verficiado o
#numero de tentativas executadas. No final, apos o jogador acertar o codigo e adicionado a uma lista global 'tentativas' cada tentativa introduzida pelo player juntamente
#com o resultado obtido a cada ciclo do 


def ver_char(solution): #verifica se tem Chars nao inteiros
    
    number = ['1','2','3','4','5','6','7','8','9','0']

    for i in solution :
        if i not in number :
            return False
    return True

def menu () :

    menu = input('[1] - Menu Jogador \n[2] - Menu Computador \nIntroduza opçao : ')
    
    if menu == '1' :
        jogo1()

    #elif menu == '2':
        #jogo2

    else:
        print('Invalid Input')
        menu()
    

def jogo1():
    
    while True :
            
            player = input('Player : ')
            
            if utilizador(player) == False :
                print('Invalid Input')
                found = []
                continue

            if len(player) != 4 :
                print('Invalid Input')
                found = [] 
            
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
                found = []
                
                if player == final:
                    print('\nAcertou\n')
                    
                    for x in tentativas:
                        print(x)
                    break



    
    
