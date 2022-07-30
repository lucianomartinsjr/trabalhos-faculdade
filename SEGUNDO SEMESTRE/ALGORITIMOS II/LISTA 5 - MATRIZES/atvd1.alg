algoritmo "semnome"
// Função :
// Autor :
// Data : 07/09/2021
// Seção de Declarações
var
matriz: vetor[1..6,1..6] de inteiro
linha,coluna:inteiro
inicio

para linha de 1 ate 6 faca
   para coluna de 1 ate 6 faca
      se (linha=coluna) entao
         matriz[linha,coluna]:= 1
      senao
         matriz[linha,coluna]:= 0
      fimse
   fimpara
fimpara

para linha de 1 ate 6 faca
   para coluna de 1 ate 6 faca
      escreva(matriz[linha,coluna],"  ")
   fimpara
   escreval("")
fimpara

fimalgoritmo
