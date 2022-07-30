Algoritmo "semnome"

Var

   vtA: vetor[1..10] de inteiro
   vtB: vetor[1..10] de inteiro
   vtC: vetor[1..10] de inteiro
   i:inteiro

Inicio

   para i de 1 ate 10 faca
      escreval("=-=-=-=-=-=-=-=-=-=-=-=-")
      escreva("Informe o valor de A: ")
      leia(vtA[i])
      escreval("")
      escreva("Informe o valor de B: ")
      leia(vtB[i])

      vtC[i]:=vtA[i]-VtB[i]
      limpatela
   fimpara

   escreva("")
   timer(200)
   escreva("Calculando resultados ")
   escreva(".")
   escreva(".")
   escreva(".")
   limpatela
   timer(0)

   para i de 1 ate 10 faca
      timer(100)
      escreval("A ( ",vtA[i],"  ) - B ( ",vtB[i],"  )  = ",vtC[i])
      timer(0)
   fimpara



Fimalgoritmo