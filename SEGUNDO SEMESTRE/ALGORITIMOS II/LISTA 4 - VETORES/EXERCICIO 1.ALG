Algoritmo "semnome"

Var
   vetA,vetB:vetor[1..10] de inteiro
   i,ia:inteiro

Inicio
   ia:=10
   para i de 1 ate 10 faca
   escreval("Informe 10 valores. ")
   escreva("Informe um número: ")
   leia(vetA[i])
   vetB[ia]:=vetA[i]
   ia:=ia - 1
   limpatela
   fimpara
   
   escreval("Vetor A:")
   para i de 1 ate 10 faca
   escreva(vetA[i])
   fimpara
   
   escreval("")
   escreval("Vetor B:")
   para i de 1 ate 10 faca
   escreva(vetB[i])
   fimpara



Fimalgoritmo