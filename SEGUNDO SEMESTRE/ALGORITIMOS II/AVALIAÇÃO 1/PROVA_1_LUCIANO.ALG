algoritmo "Prova_1_LUCIANO"
var
   nome_hotel:vetor[0..150] de caractere
   dist_centro:vetor[0..150] de real
   num_medio,tipo_acesso:vetor[0..150] de inteiro
   run:caractere
   i,nvezes,distmai15,n_hotelacesso,h:inteiro
   MediaVistSemAslf:real
inicio
   nvezes:=1
   i:=0
   run:="Sim"
   distmai15:= 0
   n_hotelacesso:=0

   enquanto (run <> "não") e (run <> "Não") e (run <> "nao") e (run <> "NAO") e (run <> "n")  e (run <> "N")  faca

      escreva("Informe o nome do hotel: ")
      leia(nome_hotel[i])

      escreva("Informe a distância do centro: ")
      leia(dist_centro[i])

      escreva("Informe o número médio de visitantes: ")
      leia(num_medio[i])

      escreval("0 – Acesso não asfaltado; 1 – Acesso asfaltado).")
      escreval("")
      escreva("Tipo de acesso ao hotel: ")
      leia(tipo_acesso[i])

      enquanto (tipo_acesso[i] <> 1) e (tipo_acesso[i] <> 0) faca
         limpatela
         escreval("TIPO ACESSO INFORMADO INCORRETO!!!")
         escreval("0 – Acesso não asfaltado")
         escreval("1 – Acesso asfaltado")
         escreval("")
         escreva("Informe novamente o tipo de acesso: ")
         leia(tipo_acesso[i])
      fimenquanto

      limpatela

      escreval("Deseja continuar informando hotéis ?")
      escreva("Sim ou Não: ")
      leia(run)
      limpatela
      i:=i+1
      nvezes:= nvezes+1

   fimenquanto

   //calculo dos resultados

   para i de 0 ate nvezes faca
      se dist_centro[i] > 15 entao
         distmai15:= distmai15 + 1
      fimse

      se tipo_acesso[i] = 0 entao
         MediaVistSemAslf:= MediaVistSemAslf + num_medio[i]
         n_hotelacesso:= n_hotelacesso+1
      fimse

   fimpara

   se n_hotelacesso = 0 entao
      escreval("Não é possivel dividir por 0")
   senao
      MediaVistSemAslf:=  MediaVistSemAslf / n_hotelacesso
   fimse


   //Impressão dos resultados
   // A)
   escreval("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=")
   escreval("Foi informado ",distmai15:2," Hotéis mais distantes que 15 KM do centro")
   escreval("")

   // B)
   escreval("A média de visitantes de com acesso não asfaltado foi de:",MediaVistSemAslf)
   escreval("")

   // C)
   escreval("Hotéis de acesso asfaltado que tiveram menos de 1.000 visitantes:")
   h:=0
   para i de 0 ate nvezes faca
      se (num_medio[i] < 1000) e (tipo_acesso[i] = 1) entao
         escreval("O hotel: ",nome_hotel[i],", á ",dist_centro[i]," km's do centro.")
         h:=h+1
      fimse
   fimpara

   se h = 0 entao
      escreval("-Não houve nesta pesquisa.-")
   fimse


fimalgoritmo