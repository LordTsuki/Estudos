A = None
B = None
C = None
MEDIA = None
A = float(input())
B = float(input())
C = float(input())

A = A * 20
B = B * 30
C = C * 50
MEDIA = (A + B + C) / 100

print(str("MEDIA = ") + str("{:0.1f}".format(MEDIA)))