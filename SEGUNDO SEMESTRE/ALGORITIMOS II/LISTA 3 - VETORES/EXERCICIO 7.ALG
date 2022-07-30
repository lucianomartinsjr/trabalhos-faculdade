Algoritmo "semnome"

Var

   vetA: vetor[1..5] de inteiro
   vetB: vetor[6..10] de inteiro
   vetC: vetor[11..15] de inteiro
   vetD: vetor [1..15] de inteiro
   i:inteiro


Inicio

   para i de 1 ate 15 faca
      timer(10)
      aleatorio on
      se ( i > 1 ) e ( i < 6)   entao
         escreva("Informe o valor de A: ")
         leia(vetA[i])
         vetD[i]:=vetA[i]
      fimse

      se ( i > 6 ) e ( i < 11)   entao
         escreva("Informe o valor de B: ")
         leia(vetB[i])
         vetD[i]:=vetB[i]
      fimse

      se ( i > 10 ) e ( i < 16)   entao
         escreva("Informe o valor de C: ")
         leia(vetC[i])
         vetD[i]:=vetC[i]

      fimse
      aleatorio off
      limpatela
      timer(0)
   fimpara

   //resultado
   escreval("Vetor A :")
   para i de 1 ate 5 faca
      escreva(vetA[i])
   fimpara
   
   escreval("")
   escreval("Vetor B :")
   para i de 6 ate 10 faca
      escreva(vetB[i])
   fimpara
   
   escreval("")
   escreval("Vetor C :")
   
   para i de 11 ate 15 faca
      escreva(vetC[i])
   fimpara
   
   escreval("")
   escreval("Vetor D : ")
   para i de 1 ate 15 faca
      escreva(vetD[i])
   fimpara





Fimalgoritmo