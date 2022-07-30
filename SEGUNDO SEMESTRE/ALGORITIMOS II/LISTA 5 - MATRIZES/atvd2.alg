algoritmo "semnome"
// Função :
// Autor :
// Data : 07/09/2021
// Seção de Declarações
var
matriz: vetor[1..4,1..4] de inteiro
linha,coluna:inteiro
somapri,soma3col,somadiprinc,somadiseg,somamatriz:inteiro
inicio
somapri:=0
soma3col:=0
para linha de 1 ate 4 faca
   para coluna de 1 ate 4 faca
      escreva("Informe um valor: ")
      leia(matriz[linha,coluna])
      limpatela
   fimpara
fimpara

para coluna de 1 ate 4 faca
   somapri:= somapri + matriz[1,coluna]
fimpara

para linha de 1 ate 4 faca
   soma3col:= soma3col + matriz[linha,3]
fimpara

para linha de 1 ate 4 faca
   para coluna de 1 ate 4 faca
      se (linha=coluna) entao
         somadiprinc:= matriz[linha,coluna]+somadiprinc
      fimse
   fimpara
fimpara

para linha de 1 ate 4 faca
   para coluna de 1 ate 4 faca
      se (linha+coluna = 5) entao
         somadiseg:= matriz[linha,coluna]+somadiseg
      fimse
      somamatriz:=matriz[linha,coluna]+somamatriz
   fimpara
fimpara

//escrever a matriz

escreval("")
para linha de 1 ate 4 faca
   para coluna de 1 ate 4 faca
      escreva(matriz[linha,coluna]:4)
   fimpara
   escreval("")
fimpara

escreval("")
escreval("Soma da primeira coluna : ",somapri)
escreval("Soma da terceira coluna : ",soma3col)
escreval("Soma diagonal principal : ",somadiprinc)
escreval("Soma diagonal segundaria : ",somadiseg)
escreval("Soma da matriz : ",somamatriz)



fimalgoritmo

