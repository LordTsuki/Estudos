import socket

def createList(n):
	ports = []
	for i in range(n+1):
		ports.append(i)
	return(ports)
porta = input()

for port in createList(int(porta)):
	client = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
	client.settimeout(0.5)
	code = client.connect_ex(("bancocn.com", port))
	if code == 0:
		print(port, "OPEN")
