#Ficha 1

#Ex 3

def dollars():

    dollar = float(input("Dollars: "))

    euro = dollar *0.86

    print (str(dollar) + " usd = " + str(euro) +  " euro "  )


#Ex 4

def euros () :

    euros = float(input("Euros : " ))

    dollar = euros * 1.162

    print(str(dollar) + " Dollars")

#Ex 5

def random():

    num1 = int(input("Insert number 1 : " ))

    num2 = int(input("Insert number 2 : " ))

    soma = num1 + num2

    diferenca = num1 - num2

    produto = num1 * num2

    divisao = num1/num2

    res = num1%num2

    print("Soma = " +  str(soma) + " \n" + "Diferenca = " + str(diferenca) +"\n"
          + "Produto = " + str(produto) +"\n" + "Divisao = " + str(divisao) +"\n"
          + "Resto divisao = " + str(res))
    

#Ex 6

def temperature () :

    celsius = float(input("Celsius : " ))

    kelvin = float(celsius + 2713.15)
    
    fahrenheit = float(( celsius * 1.8 ) + 32)

    print ("Kelvin = " + str(kelvin) + "\n" + "Fahrenheit = " + str(fahrenheit))


#7
    
def segundos ():

    segundos = int(input("Segundos : " ))

    c = 0
    c1 = 0
    c2= 0 

    #Days

    while (segundos >= 86400):
        c+=1

        segundos-=86400

    while (segundos >= 3600) :
        c1+=1

        segundos-=3600

    while (segundos >= 60):

        c2+=1

        segundos-=60

    
    print(str(c) + " dias "  + str(c1) + " horas " + str(c2)+ " minutos " + str(segundos) + " segundos" )


#Ex 8       

def letra () :

    maiuscula = (input("letra : "))

    numero = ord(maiuscula)

    minuscula = numero + 32

    print(chr(minuscula))


#Ex 9

def number () :

    numberR= float(input("Insira um numero real : " ))

    char = (input("Insira um Char :" ))

    inteiro = int(input("Insira um numero inteiro :" ))

    print(str(inteiro) + " " + str (char) + " " + str (numberR))
    

#Ex 10

def decimals ():

    
    number = float(input("Insira um number : " ))

    decimais = round(number + 0.005, 3)

    inteiro = int(number)

    parteD = number - inteiro

    print ("Numero com 3 casas decimais : " + str(decimais) + "\n" +
           "Parte inteira : " + str(inteiro) + "\n" + "Parte decimal : "
           + str(parteD))




#Ex 11

def decimal ():

    number = int(input("Insira um numero : " ))

    a = str(number)

    print(a[0] + "\n" + a[1])




    




    
    









