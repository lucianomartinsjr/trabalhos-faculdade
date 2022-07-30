Algoritmo "semnome"

Var

   vet:vetor[1..10] de inteiro
   cont:vetor[1..10] de inteiro
   i,ia,num:inteiro


Inicio

   para i de 1 ate 40 faca
      escreva("Informe um número: ")
      leia(vet[i])
      para ia de 1 ate 40 faca
         se ia <> i entao
            enquanto vet[i] = vet[ia] faca
               limpatela
               escreval("Número já escrito no elemento",ia)
               escreva("Digite um diferente para o elemento ",i,": ")
               leia (vet[i])

            fimenquanto
         fimse
      fimpara
      limpatela
   fimpara

   limpatela

   repita
      escreva("Digite um número: ")
      leia(num)
      para i de 1 ate 40 faca
         se vet[i] = num  entao
            cont[i] := cont[i] + 1
         fimse
      fimpara
      limpatela
   até ( num = 0 )
   para i de 1 ate 40 faca
      se cont[i] <> 0 entao
         escreval("-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=--=-=-")
         escreval("O numero",vet[i]," de posição",i,", foi digitado",cont[i]," vezes")
      fimse
   fimpara





Fimalgoritmo