algoritmo "semnome"
var

i,id,id_G,id_M:inteiro
peso,peso_G,peso_M:real

inicio
i:= 1
peso_G:=0
peso_M:=1000
id_G:=0
id_M:=0
para i de 1 ate 5 faca
   escreva("Informe o numero de identificação: ")
      leia(id)
   escreva("Informe o peso deste boi: ")
      leia(peso)
   escreval("")
   
   se ( peso > peso_G) entao
      id_G := id
      peso_G := peso
   fimse
   
   se ( peso < peso_M ) entao
      id_M := id
      peso_M := peso
   fimse

   

   limpatela
   escreval("Foram lidos até agora ",i," bois de 90")
   escreval("")
fimpara

escreval("-- BOI MAIS GORDO -- ")
escreval("Identificação :",id_G)
escreval("E seu peso foi:",peso_G)

escreval("-- BOI MAIS MAGRO -- ")
escreval("Identificação :",id_M)
escreval("E seu peso foi:",peso_M)


fimalgoritmo