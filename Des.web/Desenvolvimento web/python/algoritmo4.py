# desenvolva uma pagina web na qual o usuário diga sua data de nascimento e o sistema informe o dia da semana
# que ele nasceu (teoria de divisão euclidiana)

def main():
 
    dia = int(input('Dia: '))
    mes = int(input('Mês: '))
    ano = int(input('Ano: '))
 
    if mes == 1:
        mes = 13
        ano = ano - 1
    if mes == 2:
        mes = 14
        ano = ano - 1
 
    s = ano//100
    t = ano//400
    q = dia
    m = mes + 12 * ((14 - mes)//12) - 2
    j = (ano + s + (s//4) - t + ((31 * m)//12)) % 7
 
    diasemana = ['Domingo', 'Segunda', 'Terça', 'Quarta', 'Quinta', 'Sexta', 'Sábado']
    print(diasemana[j])
 
 
main()