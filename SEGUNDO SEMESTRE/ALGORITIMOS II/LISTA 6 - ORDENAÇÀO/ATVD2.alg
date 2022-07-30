Algoritmo "atvd2"
Var
   vet: vetor[1..100] de inteiro
   media, mediafinal,contmedia : real
   i, j, aux, ia : inteiro

Inicio
i:=1
   repita
      escreva("Informe um número: ")
      leia(vet[i])
      limpatela

      enquanto vet[i] > 5000 faca

         escreva("Informe um número: ")
         leia(vet[i])
         limpatela
      fimenquanto

      se vet[i] = 999 entao
         ia := i
      fimse

      i:=i+1

      se i = 100 entao
         ia := 100
      fimse

   ate (vet[i] = 999) ou (i = 100)

   escreval("")
   escreval("Ordem informada : ")
   escreval("")
   j:=1
   para i de 1 ate ia faca

      escreva(vet[j]," |")
      j:=i

      aux := vet[i]+10

      se aux <= vet[j] entao
         escreva(vet[i]," |")
      fimse

   fimpara

   escreval("")
   escreval("")
   escreval("Em ordem crescente: ")
   escreval("")

   para i de 1 ate ia faca
      para j de i+1 ate ia faca
         se vet[i] > vet[j] entao
            aux:= vet[i]
            vet[i]:= vet[j]
            vet[j]:= aux
         fimse
      fimpara
   fimpara

   escreval()
   para i de 1 ate ia faca
      escreva(vet[i]:3," |")
   fimpara

   para i de 1 ate ia faca
      se(vet[i] > 50) e (vet[i] mod 2 <> 0)entao
         media:= media+vet[i]
         contmedia:=contmedia+1
      fimse
   fimpara

   se(contmedia <> 0)entao
      mediafinal:=media/contmedia
   fimse

   escreval("")
   escreval("")
   escreva("Média dos números maiores que 50 é: ",mediafinal:2," % ")

Fimalgoritmo