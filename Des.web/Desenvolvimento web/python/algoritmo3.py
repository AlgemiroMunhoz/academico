# desenvolver um sistema para calcular e exibir a media final de um estudante (professor pode escolher
# a quantidade de atividades avaliativas feita pelo estudante) se media maior que 6 exiba que esta aprovado
# ou reprovado

media = float(input('Digite a média final do estudante: '))
if media >= 6:
  print('O estudante está aprovado.')
else:
  print('O estudante está reprovado.')