Algoritmo "semnome"

Var

   vtA,vtAux: vetor[1..10] de inteiro
   i,pares:inteiro


Inicio

   para i de 1 ate 10 faca
      timer(100)
      escreva("Informe o valor de A: ")
      aleatorio on
      leia(vtA[i])
      aleatorio off

      vtAux[i] := (vtA[i] mod 2)

      se vtAux[i] = 0 entao
         pares:= pares + 1
      fimse
      limpatela
      timer(0)
   fimpara

   escreval("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=")
   escreval("Foram informados os seguintes numeros: ")
   para i de 1 ate 10 faca
      timer(40)
      escreva(vtA[i])
      timer(0)

   fimpara
   escreval("")
   escreval("")
   
   escreval("Sendo eles",pares," números pares")


Fimalgoritmo