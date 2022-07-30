algoritmo "semnome"
var
   vet: vetor[1..20] de inteiro
   i, aux: inteiro
inicio

   para i de 1 ate 20 faca
      escreval("-=-=-=-=-=-=-=-=-=-=-=-")
      escreva("Digite 20 números: ")
      aleatorio on
      leia (vet[i])
      limpatela
   fimpara
   
    escreval("")
   escreval("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-==-=-=-=-=-=-=-=-=-=-=-=-=-")
   escreval("O vetor informado foi:")
   para i de 1 ate 20 faca
      escreva(vet[i])
   fimpara
   

   para i de 1 ate 10 faca
      aux := vet[i]
      vet[i] := vet[21-i]
      vet[21-i]:= aux
   fimpara

   escreval("")
   escreval("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-==-=-=-=-=-=-=-=-=-=-=-=-=-")
   escreval("")
   escreval ("Ao inverter as posiçoes ficou: ")
   para i de 1 ate 20 faca
      escreva(vet[i])
   fimpara
   escreval("")
   escreval("")
   
fimalgoritmo