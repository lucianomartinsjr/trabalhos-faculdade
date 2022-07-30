Algoritmo "semnome"
// Disciplina   : Algoritimos I
//
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 29/08/2021
Var
   S:vetor[1..20] de inteiro
   i,cont:inteiro

Inicio
   para i de 1 ate 20 faca
      escreva("Informe um valor: ")
      leia(S[i])
      limpatela
   fimpara

   cont:=0
   escreval("Vetor S compactado")
   para i de 1 ate 20 faca
      se S[i] > 0 entao
         cont:=cont+1
         escreva(S[i])
      fimse
   fimpara
   escreval("")
   escreval("Vetor ficou com tamanho de ",cont," espaços")

Fimalgoritmo