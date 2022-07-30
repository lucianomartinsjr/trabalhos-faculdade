Algoritmo "semnome"

Var
   vetA,vetB:vetor[1..20] de inteiro
   vetC:vetor[1..20] de caractere
   vetD:vetor[1..20] de real
   i,ia:inteiro


Inicio
   para i de 1 ate 20 faca
      escreva("Qual o valor de A : ")
      leia(vetA[i])
      limpatela
      escreval("SOMA          :  + ")
      escreval("SUBTRAÇÃO     :  - ")
      escreval("MULTIPLICAÇÃO :  * ")
      escreval("DIVISÃO       :  / ")
      escreval("")
      escreva("Informe a operação: ")
      leia(vetC[i])
      limpatela
      enquanto ( vetC[i] <> "+") e (vetC[i] <> "-") e (vetC[i] <> "*") e  (vetC[i] <> "/")faca
         escreval("OPERAÇÃO INFORMADA INCORRETA!")
         escreval("SOMA          :  + ")
         escreval("SUBTRAÇÃO     :  - ")
         escreval("MULTIPLICAÇÃO :  * ")
         escreval("DIVISÃO       :  / ")
         escreval("")
         escreva("Informe a operação: ")
         leia(vetC[i])
         limpatela
      fimenquanto
      escreva("Qual o valor de b: ")
      leia(vetB[i])
      limpatela

      se vetC[i] = "+" entao
         vetD[i]:= vetA[i] + vetB[i]
      senao
         se vetC[i] = "-" entao
            vetD[i] := vetA[i] - vetB[i]
         senao
            se vetC[i] = "*" entao
               vetD[i] := vetA[i] * vetB[i]
            senao
               se vetC[i] = "/" entao
                  se vetB[i] = 0 entao
                  escreval("Não é possível dividir por 0")
                  senao
                     vetD[i] := vetA[i] / vetB[i]
                  fimse

               senao
                  escreval("ALGO DEU ERRADO")
               fimse

            fimse
         fimse
      fimse
   fimpara

   escreval( "=-=-=-=-=-= RESULTADOS =-=-=-=-=-=")
   para ia de 1 ate 20 faca
      escreval("A :",vetA[ia]," |",vetC[ia],"|  B:",vetB[ia],"  = ",vetD[ia])
   fimpara


Fimalgoritmo