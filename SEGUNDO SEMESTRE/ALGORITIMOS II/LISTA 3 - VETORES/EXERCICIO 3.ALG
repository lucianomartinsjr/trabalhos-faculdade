Algoritmo "semnome"

Var

   vetorA: vetor[1..10] de inteiro
   vetorb: vetor[1..10] de inteiro

   i:inteiro

Inicio

   para i de 1 ate 10 faca
      escreval("=-=-=-=-=-=-=-=-=-=-=-=")
      escreva("Informe 10 numeros: ")
      leia(vetorA[i])
      vetorB[i]:= vetorA[i]*i
      limpatela
   fimpara

   escreval("")

   escreval("=-=-=-=-=-=-=-=-=-=-=-=")
   para i de 1 ate 10 faca
      timer(50)
      escreval("     ",vetorA[i]," * ",i," = ",vetorB[i])
      escreva("")
      Timer(0)
   fimpara


Fimalgoritmo