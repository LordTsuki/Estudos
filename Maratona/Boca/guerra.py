N = int(input())

while N != 0:
    S = input()
    S = S.upper()

    while N < 0 or N > 20:
        print('ERRO')
        N = int(input())
        S = input()
        S = S.upper()

    while len(S) < 1 or len(S) > 51:
        print('ERRO')
        N = int(input())
        S = input()
        S = S.upper()

    base = 'ABCDEFGHIJKLMNOPQRSTUVWXYZ'

    S_new = ''

    if 'A' in S:
        S = S.replace('A', '@')
    if 'S' in S:
        S = S.replace('S', '$')
    if 'E' in S:
        S = S.replace('E', '3')
    if 'I' in S:
        S = S.replace('I', '!')
    if 'O' in S:
        S = S.replace('O', '0')
    if ' ' in S:
        S = S.replace(' ', '#')

    for i in S:
        if i in base:
            P = base.find(i)
            P = P + N

            if P >= len(base):
                P = P - len(base)
            elif P < 0:
                P = P + len(base)  

            S_new = S_new + base[P]
        else:
            S_new = S_new + i

    print(S_new)
    N = int(input())