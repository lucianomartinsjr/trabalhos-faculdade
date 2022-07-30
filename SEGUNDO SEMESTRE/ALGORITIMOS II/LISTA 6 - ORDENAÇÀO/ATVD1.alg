algoritmo "semnome"
// Função :
// Autor :
// Data : 15/09/2021
// Seção de Declarações
var
vet: vetor [1..40] de inteiro
n,i,ia,ib,aux,menor: inteiro
Inicio
para i de 1 ate 40 faca
   escreval ("Informe um valor para a posição ",i,": ")
   leia(vet[i])
   para ib de 1 ate 40 faca
      se ib <> i entao
         enquanto vet[i] = vet[ib] faca
            limpatela
            escreval("Número já escrito no elemento",ib)
            escreva("Digite um diferente para o elemento ",i,": ")
            leia (vet[i])
            limpatela
         fimenquanto
      fimse
   fimpara
fimpara

escreval("")
para i de 1 ate 40 faca
   escreva(" | ",vet[i]:2)
fimpara
escreva(" |")
escreval("")

para i de 1 ate (40-1) faca
   menor:=i
   para ia de i+1 ate 40 faca
      se vet[menor] < vet[ia] entao
         menor:=ia
      fimse
   fimpara

   se i <> menor entao
      aux:= vet[i]
      vet[i]:= vet[menor]
      vet[menor]:= aux
   fimse
fimpara
escreval("")
escreval("Vetor em ordem decrescente :")
para i de 1 ate 40 faca
   escreva("| ",vet[i]:2)
fimpara
escreva(" | ")
fimalgoritmo