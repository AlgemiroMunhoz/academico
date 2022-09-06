# construa um algotimo que receba um numero inteiro do usuario, calcule seu fatorial da entrada,
# exiba o passo a passo da operação e mostre o resultado

num = int(input("Digite um número: "))

fatorial = 1

for i in range(num, 0, -1):
    fatorial = fatorial * i
    print("%d! = %d" %(i, fatorial))

print("Resultado: %d" %fatorial)