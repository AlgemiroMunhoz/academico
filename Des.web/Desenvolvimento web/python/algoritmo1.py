# escrever um algoritmo que recebe um numero informado pelo usuario. verifique e escreve se esse numero
# é positivo , negativo ou igual a 0
from cgitb import html

html

numero = (input("Informe um número: "))
if (numero > 0):
    print("Positivo")
elif (numero < 0):
    print("Negativo")
else:
    print("Igual a 0")
