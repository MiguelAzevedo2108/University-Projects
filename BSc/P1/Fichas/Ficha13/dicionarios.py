#1
#dic= {'joao':961111, 'ana':932222, 'carla':913333, 'manuel':964444}

def encontra_telefone(nome, dic):
    return dic.get(nome, 0)

#2

def novo_tel(nome,tel,dic):

    dic[nome] = tel

#3

def cliente(tel,dic):

    for i in dic :
        if dic[i] == tel :
            return i
    return 'desconhecido'

#6
dicEnPt= {'white':'branco', 'the':'o', 'cat':'gato', 'mouse':'rato','chases':'persegue', 'black':'preto'}

def traduz(pal,dic):

    for i in dic :
        return dic.get(pal,pal)
        
#7
def word_to_pt(pal):
    
    dicEnPt= {'white':'branco', 'the':'o', 'cat':'gato', 'mouse':'rato','chases':'persegue', 'black':'preto'}

    print(traduz(pal,dicEnPt))

#8

def list_to_pt(lista):

    dicEnPt= {'white':'branco', 'the':'o', 'cat':'gato', 'mouse':'rato','chases':'persegue', 'black':'preto'}
    d = []
    for i in lista :
        for c in dicEnPt :
            if i == c :
                d.append(dicEnPt.get(c))

    return d

#10

def clube(nome,dic):

    for i in dic:
        for c in dic.get(i):
            if c == nome :
                return i

#10b

def adeptos(dic):

    clube = ''
    max = 0
    
    for i in dic :
        if len(dic.get(i)) > max :
            max = len(dic.get(i))
            clube = i

    return clube

