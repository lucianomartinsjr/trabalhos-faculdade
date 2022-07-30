algoritmo "semnome"
// Função :
// Autor :
// Data : 07/09/2021
// Seção de Declarações
var
   matriz: vetor[1..100,1..12] de inteiro
   linha,coluna,n,contmeses,elemAcimMedia,elemAbaixMedia:inteiro
   controle:caractere
   control:logico
   SomaPesoTotal12m,MedPeso12m,soma3col:real
   somadiprinc,somadiseg,somamatriz:real
   PesoMedElemento,MedMensalPesoIndv,SomaMesTotalIndv:real

inicio
   n:=20
   contmeses:=0
   SomaPesoTotal12m:=0
   elemAcimMedia:=0
   control:= verdadeiro

   escreval("- Máximo 100 indivíduos -")
   escreval("Quantos individuos participaram da pesquisa? ")
   escreva("Informe o número: ")
   //leia(n)
   limpatela

   enquanto control = verdadeiro faca

      para linha de 1 ate n faca
         para coluna de 1 ate 12 faca
            escreval("Assuma arredondamento para o próximo quilograma")
            escreval("- Você está informando o ",linha,"º Elemento -")
            escreva("Qual foi o peso no mês",coluna," : ")
            leia(matriz[linha,coluna])
            contmeses:= contmeses+1
            limpatela
         fimpara

         se linha = n entao
            control:= falso
         senao
            control:=verdadeiro
         fimse
      fimpara
   fimenquanto

   //começo dos calculos
   //calculo variação média

   para linha de 1 ate n faca
      para coluna de 1 ate 12 faca
         SomaPesoTotal12m:= SomaPesoTotal12m + matriz[linha,coluna]
      fimpara
   fimpara

   MedPeso12m:= SomaPesoTotal12m / contmeses

   //calculo num elementos excede média

   para linha de 1 ate n faca
      para coluna de 1 ate 12 faca
         SomaMesTotalIndv := SomaMesTotalIndv + matriz[linha,coluna]
         MedMensalPesoIndv:= SomaMesTotalIndv/12
      fimpara

      se MedMensalPesoIndv > MedPeso12m entao
         elemAcimMedia:=elemAcimMedia+1
      fimse

   fimpara
   //escrever a matriz

   escreval("")
   para linha de 1 ate n faca
      para coluna de 1 ate 12 faca
         escreva(matriz[linha,coluna]:4)
      fimpara
      escreval("")
   fimpara

   escreval("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-")
   escreval("Variação média de peso de todos os elementos no período de 12 meses; : ",MedPeso12m)
   escreval("O número de elementos que excederam a média foi :",elemAcimMedia)
   escreval("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-")
   escreval("A Variação mensal de cada elemento foi: ")
   para linha de 1 ate n faca

      para coluna de 1 ate 12 faca
         SomaMesTotalIndv:=0
         MedMensalPesoIndv:=0
         elemAbaixMedia := 0
         
         SomaMesTotalIndv:= matriz[linha,coluna] + SomaMesTotalIndv
         MedMensalPesoIndv:= SomaMesTotalIndv/12
         
          se MedMensalPesoIndv > matriz[linha,coluna]entao
            elemAbaixMedia := elemAbaixMedia + 1
         fimse
         
      fimpara

      escreval("O",linha,"º teve uma variação mensal de peso de :",MedMensalPesoIndv)
      escreval("Tendo ficando abaixo da sua média de peso",elemAbaixMedia,"vezes")
      escreval("-")
   fimpara
   escreval("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-")

fimalgoritmo
