from unicodedata import name


Number = int(input())
Horas = int(input())
sal_hora = float(input())
salario = Horas * sal_hora

print("NUMBER =", Number)
print("SALARY = U$ {0:.2f}".format(round(salario, 2)))