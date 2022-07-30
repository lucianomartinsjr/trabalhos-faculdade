Algoritmo "semnome"

Var
   vetA,vetB:vetor[1..6] de inteiro
   vetC:vetor[1..12] de inteiro
   i:inteiro

Inicio

   para i de 1 ate 6 faca
      escreva("Informe o valor de A: ")
      leia(vetA[i])
      vetC[i]:= vetA[i]
      limpatela
      escreva("Informe o valor de B: ")
      leia(vetB[i])
      vetC[i+6]:= vetB[i]
      limpatela
   fimpara
   
   escreval("VETOR A : ")
   para i de 1 ate 6 faca
      escreva(vetA[i])
   fimpara
   
   escreval("")
   escreval("VETOR B : ")
   para i de 1 ate 6 faca
      escreva(vetB[i])
   fimpara
   
   escreval("")
   escreval("VETOR C : ")
   para i de 1 ate 12 faca
      escreva(vetC[i])
   fimpara



Fimalgoritmo