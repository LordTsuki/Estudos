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

    if 'A' or 'S' or 'E' or 'I' or 'O' or ' ' in S:
        S = S.replace('A', '@')
        S = S.replace('S', '$')
        S = S.replace('E', '3')
        S = S.replace('I', '!')
        S = S.replace('O', '0')
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