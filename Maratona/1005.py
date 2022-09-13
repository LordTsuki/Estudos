A = None
B = None
MEDIA = None

A = input()
B = input()
A = float(A) * 3.5
B = float(B) * 7.5
MEDIA = (A + B) / 11
print(str("MEDIA = ") + str("{:0.5f}".format(MEDIA)))