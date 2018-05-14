import requests
import json
import matplotlib.pyplot as plt
import numpy as np
requests = requests.get("https://api.bitbucket.org/2.0/repositories/moralesl96/practicagit/commits")

data = json.loads(requests.content)

i=0
l=0
r=0
a=0

for value in data['values']:
    Autor= value['author']
    raw= Autor['raw']
    if(value['type'] == "commit"):
        i= i + 1
    if (Autor['raw']=="moralesl96 <moralesl96@uabc.edu.mx>"):
        l= l + 1
    if (Autor['raw']=="Luis Eduardo Morales Ramos <moralesl96@uabc.edu.mx>"):
        l= l + 1 
    if (Autor['raw']=="Ramiro Castillo Ahumada <ramiro.castillo.ahumada@uabc.edu.mx>"):
        r= r + 1
    if (Autor['raw']=="totodiper <ramiro.castillo.ahumada@uabc.edu.mx>"):
        r= r + 1
    if (Autor['raw']=="Ramiro <ramiro.castillo.ahumada@uabc.mx>"):
        r= r + 1
    if (Autor['raw']=="Adriel Guerrero <adrielgro@gmail.com>"):
        a= a + 1

        
print ("Numero de commits: " + str(i))
print ("Numero de commits Luis : " + str(l))
print ("Numero de commits Ramiro: " + str(r))
print ("Numero de commits Adriel: " + str(a))

contribuidores= ("Luis", "Ramiro", "Adriel")
posicion_y = np.arange(len(contribuidores))
cantidadc= (l,r,a)
plt.barh(posicion_y, cantidadc, align = "center")
plt.yticks(posicion_y, contribuidores)
plt.xlabel('Commits')