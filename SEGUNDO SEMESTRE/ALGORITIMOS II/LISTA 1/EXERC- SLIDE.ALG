algoritmo "semnome"
var
n,an,a1,r,i: inteiro
inicio
i:=0
escreval(" - Progressao Aritmetica (P.A.) - ")
escreva("Informe o primeiro elemento: ")
   leia(a1)
escreva("Informe a razão: ")
   leia(r)
escreva("Informe o numero de elementos: ")
   leia(n)
escreval("")
   
para i de 1 ate n faca
escreva(a1)
se (a1 > 0 )  entao
   a1:= a1 + r
senao
   a1:= a1 - r
fimse

fimpara

escreval("")
escreval("")
escreval(" - Progressao Geométrica (P.G.) - ")
escreva("Informe o primeiro elemento: ")
   leia(a1)
escreva("Informe a razão: ")
   leia(r)
escreval("")
para i de 1 ate n faca
   escreva(a1)
     a1:= a1 * r

fimpara
escreval("")

fimalgoritmo