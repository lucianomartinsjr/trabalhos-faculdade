Algoritmo "L2E4"
Var
   DiaA, mesA, anoA:inteiro
   diaB, mesB, anoB:inteiro
   diasAno, diaMes, dia, i, j, datai : inteiro

Inicio
   DiaA:=1

   enquanto DiaA > 0 faca
      diaMes:=0
      escreval("-=-=- Informe um numero negativo para encerrar o código -=-=-")
      escreval("")
      escreval("Informe a data mais antiga na ordem dia/mês/ano: ")
      escreva("Dia: ")
      leia(DiaA)
      se(DiaA>0)entao
      escreva("Mês: ")
         leia(mesA)
      escreva("Ano: ")
         leia(anoA)
      limpatela
      
      escreval("-=-=- Informe um numero negativo para encerrar o código -=-=-")
      escreval("")
         escreval("Informe a data mais recente na ordem dia/mês/ano: ")
         escreva("Dia: ")
         leia(diaB)
         escreva("Mês: ")
         leia(mesB)
         escreva("Ano: ")
         leia(anoB)
         escreval("")

         diasAno:= anoB-anoA
         diasAno:=diasAno*365

         para i de anoA ate anoB faca
            se(i mod 4 = 0)e(i mod 100 <> 0)entao
               diasAno:=diasAno+1
            fimse
         fimpara

         se(mesA <> mesB)entao
            se(mesA > mesB)entao
               j:=mesB

               enquanto (j <> mesA) faca
                  se (j=1) ou (j=3) ou (j=5) ou (j=7) ou (j=8) ou (j=10) ou (j=12) entao
                     diaMes:=diaMes-31
                  fimse

                  se(j=2)entao
                     diaMes:=diaMes-28
                  fimse
                  se (j=4)ou(j=6)ou(j=9)ou(j=11)entao
                     diaMes:=diaMes-30
                  fimse
                  j:= j+1
               fimenquanto
            fimse

            se(mesB>mesA)entao
               j:=mesA
               enquanto (j <> mesB) faca
                  se (j=1) ou (j=3) ou (j=5) ou (j=7) ou (j=8) ou (j=10) ou (j=12) entao
                     diaMes:=diaMes+31
                  fimse
                  se(j=2)entao
                     diaMes:=diaMes+28
                  fimse
                  se (j=4)ou(j=6)ou(j=9)ou(j=11)entao
                     diaMes:=diaMes+30
                  fimse
                  j:=j+1
               fimenquanto
            fimse
         fimse

         dia:=diaB-DiaA
         dia:=dia+diaMes+diasAno
         escreval("Total de dias: ",dia)

      fimse
      timer(500)
      escreval("")
      escreval("")
      limpatela
      timer(0)
   fimenquanto
Fimalgoritmo