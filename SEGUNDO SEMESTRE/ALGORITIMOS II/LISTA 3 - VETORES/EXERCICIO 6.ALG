Algoritmo "semnome"

Var

   vtA : vetor[1..10] de inteiro
   menor15,igual15,maior15,i:inteiro
   media:real

Inicio

   escreval("-=-=-=-=-=-=-=-=-=-=-=-")
   timer(50)
   para i de 1 ate 10 faca
      escreva("Informe um número: ")
      aleatorio on
      leia(vtA[i])
      aleatorio off

      se vtA[i] < 15 entao
         menor15 := menor15 + 1
      senao
         se vtA[i] > 15 entao
            maior15 := vtA[i] + maior15
         senao
            igual15 := igual15 + 1

         fimse
      fimse
      
   fimpara
   limpatela
   timer(0)

   media :=  maior15 / i

   escreval("-=-=-=-=-=-=-=-=-=-=-=-")
   escreval(" Foram informados",menor15," números menores do que 15")
   escreval(" Foram informados",igual15," números iguais do que 15")
   escreval(" Os numeros maiores formam uma media de: ",media)



Fimalgoritmo