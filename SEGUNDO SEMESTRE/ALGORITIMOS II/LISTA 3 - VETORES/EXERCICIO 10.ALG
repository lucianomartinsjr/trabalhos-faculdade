Algoritmo "semnome"

Var
   vet:vetor[1..100] de inteiro

   maior,i,ia,indice:inteiro


Inicio

   para i de 1 ate 100 faca
      escreva("informe o numero: ")
      leia(vet[i])
      //verificar se é repetido
      para ia de 1 ate 100 faca
         se ia <> i entao
            enquanto vet[i] = vet[ia] faca
               limpatela
               escreval("Número já escrito no elemento",ia)
               escreva("Digite um diferente para o elemento ",i,": ")
               leia (vet[i])
            fimenquanto
         fimse
      fimpara

      se maior < vet[i]   entao
         maior:= vet[i]
         indice:= i
      fimse
      limpatela
   fimpara

   escreval("")
   escreval("O maior numero foi: ",maior," - POSIÇÃO NO VETOR [",indice," ]" )




Fimalgoritmo