algoritmo "Prova_2_LUCIANO"

var
vetA,vetB:vetor[1..50] de inteiro
i,subt,soma:inteiro
inicio

para i de 1 ate 50 faca
   escreva("Informe o valor do vetor A: ")
   leia(vetA[i])
   limpatela
   escreva("Informe o valor do vetor B: ")
   leia(vetB[i])
   limpatela
fimpara


para i de 1 ate 25 faca
   subt := (vetA[i] - vetB[51-i])
   soma :=  subt+soma
   escreval("Vetor A |",vetA[i]:3,"  - ",vetB[51-i]:3," | Vetor B = ",subt:3," | ",soma)
fimpara

escreval(" ")
escreval("VALOR FINAL : ",soma:3)

fimalgoritmo
