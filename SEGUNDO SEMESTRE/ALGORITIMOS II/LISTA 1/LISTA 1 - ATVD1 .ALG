 algoritmo "semnome"
 var
 a,b,c,i: inteiro

 inicio
 i:= 1
 enquanto ( i = 1) faca
   escreval("Informar somente numeros inteiros e distintos")
      escreval("")
      escreva("Informe o primeiro n�mero: ")
      leia(a)

      escreval("")
      escreva("Informe o segundo n�mero: ")
      leia(b)

        enquanto (b = a) faca
         escreval("")
         escreval("Este n�mero j� foi informado.")
         escreva("Escreva novamente o segundo n�mero: ")
         leia(b)
        fimenquanto

         escreval("")
         escreva("Informe o terceiro n�mero: ")
         leia(c)
         escreval("")

            enquanto ( a = c ) ou ( b = c )  faca
               escreval("")
               escreval("Este n�mero j� foi informado.")
               escreva("Escreva novamente o terceiro n�mero: ")
               escreval("")
               leia(c)
            fimenquanto

            se (a=b) e (a=c) entao
               escreval ("A ordem crescente �:",c,",",b,",",a)
            senao
               se ((a>=b) e (a>=c)) entao
                  se (b>=c) entao
                     escreval ("Em ordem crescente �:",c,",",b,",",a)
                  senao
                     escreval ("Em ordem crescente �:",b,",",c,",",a)
                  fimse
               fimse
               se ((b>=a) e (b>=c)) entao
                  se (a>=c) entao
                     escreval ("Em ordem crescente �:",c,",",a,",",b)
                  senao
                     escreval ("Em ordem crescente �:",a,",",c,",",b)
                  fimse
               fimse
               se ((c>=a) e (c>=b)) entao
                  se (a>=b) entao
                     escreval ("Em ordem crescente �:",b,",",a,",",c)
                  senao
                     escreval ("Em ordem crescente �:",a,",",b,",",c)
                  fimse
               fimse
            fimse

      escreval("-----------------------------")
      escreval("Para rodar novamente informe:")
      escreval("1 - Sim")
      escreval("2 - N�o")
      escreval("-----------------------------")
      escreva("Deseja Continuar ? :")
      leia(i)
      limpatela

   fimenquanto
 fimalgoritmo
