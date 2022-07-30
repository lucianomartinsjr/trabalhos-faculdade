Algoritmo "semnome"

Var

   vetorA: vetor[1..10] de inteiro
   vetorb: vetor[1..10] de inteiro

   i:inteiro

Inicio

   para i de 1 ate 10 faca
      escreva("Informe 10 numeros: ")
      leia(vetorA[i])
      vetorB[i]:= vetorA[i]*vetorA[i]
      limpatela
   fimpara

   escreval("")

   para i de 1 ate 10 faca
      timer(50)
      escreval("Vetor A ~> Vetor B informado: ")
      escreval("     ",vetorA[i]," ~~~~> ",vetorB[i])
      escreva("")
      Timer(0)
   fimpara


Fimalgoritmo