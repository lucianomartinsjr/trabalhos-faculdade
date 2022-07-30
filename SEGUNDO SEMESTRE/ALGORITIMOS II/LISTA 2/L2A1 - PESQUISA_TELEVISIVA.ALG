Algoritmo "Pesquisa_Televisiva"

Var
   //numero de pessoas
   a_cultura,a_SBT,a_globo,a_record,a_MTV,a_TVA : inteiro
   a_manchete,a_band,emissora,espec,casas:inteiro

   //variaveis para calculo de porcentagem
   porc_cultura,porc_SBT,porc_globo,porc_record: real
   porc_MTV,porc_TVA,porc_manchete,porc_band,porcm:real

   maiorA,menorA:caractere

   //variavel para controle de excecução
   exec: logico
   ncontrole:inteiro
   contador: inteiro

Inicio
   contador:=0
   exec:= verdadeiro
   enquanto exec = verdadeiro faca
      escreval("-----------------Pesquisa Televisiva-------------------")
      escreval("Escolha qual Emissora o entrevistado está assistindo:")
      escreval("1 - Cultura")
      escreval("2 - SBT")
      escreval("3 - Globo")
      escreval("4 - Record")
      escreval("5 - MTV")
      escreval("6 - TVA")
      escreval("7 - Manchete ")
      escreval("8 - Bandeirantes")
      escreval("9 - Desligada")
      escreval("")

      escreva("Informe o codigo da emissora : ")
      leia(emissora)

      //verificação para codigo da emissora
      enquanto ( emissora < 1 ) ou ( emissora > 9 ) faca
         escreval("")
         escreval("---- Codigo da emissora incorreto  --")
         escreva("Informe o codigo da emissora novamente: ")
         escreval("")
         leia(emissora)
      fimenquanto

      se emissora = 9 entao
         Escreva("- TV Desligada -")
      senao
         escreva("Informe o número de espectadores: ")
         leia(espec)

         se emissora = 1 entao
            a_cultura := espec + a_cultura
            contador:=contador+espec
         fimse

         se emissora = 2 entao
            a_SBT := espec + a_SBT
            contador:=contador+espec
         fimse

         se emissora = 3 entao
            a_globo := espec + a_globo
            contador:=contador+espec
         fimse

         se emissora = 4 entao
            a_record := espec + a_record
            contador:=contador+espec
         fimse

         se emissora = 5 entao
            a_MTV := espec + a_MTV
            contador:=contador+espec
         fimse

         se emissora = 6 entao
            a_TVA := espec + a_TVA
            contador:=contador+espec
         fimse

         se emissora = 7 entao
            a_manchete := espec + a_manchete
            contador:=contador+espec
         fimse

         se emissora = 8 entao
            a_band := espec + a_band
            contador:=contador+espec
         fimse
      fimse

      //controle de execução
      ncontrole:= 0
      casas:=casas+1

      enquanto (ncontrole < 1 ) ou ( ncontrole > 2 ) faça
         limpatela
         escreval("-----------------Pesquisa Televisiva-------------------")
         escreval("")
         Escreval("----------------------------------")
         Escreval("|           1 - Continuar        |")
         Escreval("|           2 - Fim              |")
         Escreval("----------------------------------")
         escreva("Deseja continuar com a pesquisa? : ")
         leia(ncontrole)
      fimenquanto

      se(ncontrole = 1 ) entao
         exec:= verdadeiro
      senao
         exec:= falso
      fimse

      limpatela

   fimenquanto

   //calculo das porcentagens

   porc_cultura := ((a_cultura*100)/contador))
   porc_SBT := ((a_SBT*100)/contador))
   porc_globo := ((a_globo*100)/contador))
   porc_record := ((a_record*100)/contador))
   porc_MTV := ((a_MTV*100)/contador))
   porc_TVA := ((a_TVA*100)/contador))
   porc_MANCHETE := ((a_manchete*100)/contador))
   porc_BAND := ((a_band*100)/contador))

   //comparação de maiores audiencias

   se ((a_cultura > a_SBT) e (a_cultura > a_globo) e (a_cultura > a_record) e (a_cultura > a_MTV) e (a_cultura > a_TVA) e (a_cultura > a_manchete) e (a_cultura > a_band)) entao
      maiorA := "Cultura"
   fimse

   se ((a_SBT > a_cultura) e (a_SBT > a_globo) e (a_SBT > a_record) e (a_SBT > a_MTV) e (a_SBT > a_TVA) e (a_SBT > a_manchete) e (a_SBT > a_band)) entao
      maiorA := "SBT"
   fimse

   se ((a_globo > a_SBT) e (a_globo > a_cultura) e (a_globo > a_record) e (a_globo > a_MTV) e (a_globo > a_TVA) e (a_globo > a_manchete) e (a_globo > a_band)) entao
      maiorA := "Globo"
   fimse

   se ((a_record > a_SBT) e (a_record > a_globo) e (a_record > a_cultura) e (a_record > a_MTV) e (a_record > a_tva) e (a_record > a_manchete) e (a_record > a_band)) entao
      maiorA := "Record"
   fimse

   se ((a_MTV > a_SBT) e (a_MTV > a_globo) e (a_MTV > a_record) e (a_MTV > a_cultura) e (a_MTV > a_TVA) e (a_MTV > a_manchete) e (a_MTV > a_band)) entao
      maiorA := "MTV"
   fimse

   se ((a_TVA > a_SBT) e (a_TVA > a_globo) e (a_TVA > a_record) e (a_TVA > a_MTV) e (a_TVA > a_cultura) e (a_TVA > a_manchete) e (a_TVA > a_band)) entao
      maiorA := "TVA"
   fimse

   se ((a_manchete > a_SBT) e (a_manchete > a_globo) e (a_manchete > a_record) e (a_manchete > a_MTV) e (a_manchete > a_TVA) e (a_manchete > a_cultura) e (a_manchete > a_band)) entao
      maiorA := "Manchete"
   fimse

   se ((a_band > a_SBT) e (a_band > a_globo) e (a_band > a_record) e (a_band > a_MTV) e (a_band > a_TVA) e (a_band > a_manchete) e (a_band > a_cultura)) entao
      maiorA := "Bandeirantes"
   fimse

   // menores audiencias

   se ((a_cultura <= a_SBT) e (a_cultura <= a_globo) e (a_cultura <=  a_record) e (a_cultura <= a_MTV) e (a_cultura <= a_TVA) e (a_cultura <= a_manchete) e (a_cultura <= a_band)) entao
      menorA := "Cultura"
   fimse

   se ((a_SBT <= a_cultura) e (a_SBT <= a_globo) e (a_SBT <= a_record) e (a_SBT <= a_MTV) e (a_SBT <= a_TVA) e (a_SBT <= a_manchete) e (a_SBT <= a_band)) entao
      menorA := "SBT"
   fimse

   se ((a_globo <= a_SBT) e (a_globo <= a_cultura) e (a_globo <= a_record) e (a_globo <= a_MTV) e (a_globo <= a_TVA) e (a_globo <= a_manchete) e (a_globo <= a_band)) entao
      menorA := "Globo"
   fimse

   se ((a_record <= a_SBT) e (a_record <= a_globo) e (a_record <= a_cultura) e (a_record <= a_MTV) e (a_record <= a_tva) e (a_record <= a_manchete) e (a_record <= a_band)) entao
      menorA := "Record"
   fimse

   se ((a_MTV <= a_SBT) e (a_MTV <= a_globo) e (a_MTV <= a_record) e (a_MTV <= a_cultura) e (a_MTV <= a_TVA) e (a_MTV <= a_manchete) e (a_MTV <= a_band)) entao
      menorA := "MTV"
   fimse

   se ((a_TVA <= a_SBT) e (a_TVA <= a_globo) e (a_TVA <= a_record) e (a_TVA <= a_MTV) e (a_TVA <= a_cultura) e (a_TVA <= a_manchete) e (a_TVA <= a_band)) entao
      menorA := "TVA"
   fimse

   se ((a_manchete <= a_SBT) e (a_manchete <= a_globo) e (a_manchete <= a_record) e (a_manchete <= a_MTV) e (a_manchete <= a_TVA) e (a_manchete <= a_cultura) e (a_manchete <= a_band)) entao
      menorA := "Manchete"
   fimse

   se ((a_band <= a_SBT) e (a_band <= a_globo) e (a_band <= a_record) e (a_band <= a_MTV) e (a_band <= a_TVA) e (a_band <= a_manchete) e (a_band <= a_cultura)) entao
      menorA := "Bandeirantes"
   fimse



   //impressão de resultados

   timer(200)
   escreval("----------------- Resultados -----------------")
   escreval("      Cultura:",porc_cultura ,"% ")
   escreval("          SBT:",porc_SBT ,"% ")
   escreval("        Globo:",porc_globo ,"% ")
   escreval("       Record:",porc_record ,"% ")
   escreval("          MTV:",porc_MTV ,"% ")
   escreval("          TVA:",porc_TVA ,"% ")
   escreval("     Manchete:",porc_manchete ,"% ")
   escreval(" Bandeirantes:",porc_band ,"% ")
   escreval("----------------------------------------------")
   timer(0)
   escreval("Número de pessoas assistindo: ",contador)
   escreval("Número de casas visitadas: ",casas)
   escreval("")
   escreval("A MAIOR audiencia foi : ",maiorA)
   escreval("A MENOR audiencia foi : ",menorA)

Fimalgoritmo