Algoritmo "semnome"
// Disciplina   : [Linguagem e L�gica de Programa��o]
// Professor   : Antonio Carlos Nicolodi
// Descri��o   : Aqui voc� descreve o que o programa faz! (fun��o)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 04/08/2021
Var
   n_criancas,mascmortas,cri24m,mesesvida,totalMortas:inteiro
   porc_mortasper,porcmascmortas,porcCri24m:real
   sexo:caractere


Inicio
   sexo := "N"
   totalMortas:= 0
   escreval("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=")
   escreval("")
   escreva("Informe o n�mero de crian�as nascidas no periodo: ")
   leia(n_criancas)
   escreval("")
   enquanto ( sexo <> "" ) faca
      limpatela

      escreval("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=")
      escreval(" F - Feminino")
      escreval(" M - Masculino")
      escreval("Deixar em branco finalizar� a contagem.")
      escreval("")
      escreva("Informe o sexo : ")
      leia(sexo)
      se (sexo = "") entao
         limpatela
         escreval("Sexo informado foi em branco.")
         timer(500)
         escreval("Finalizando contagem dos dados")
         escreva(".")
         escreva(".")
         escreva(".")
         timer(0)
         limpatela
      senao
         enquanto ( sexo <> "M") e (sexo <> "m" ) e (sexo <> "F") e (sexo <> "f") faca
            limpatela
            escreval("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=")
            escreval("Codigo informado incorreto.")
            escreval(" F - Feminino")
            escreval(" M - Masculino")
            escreval("Deixar em branco finalizar� a contagem.")
            leia(sexo)
            se (sexo = "") entao
               limpatela
               escreval("Sexo informado foi em branco.")
               timer(500)
               escreval("Finalizando contagem dos dados")
               escreva(".")
               escreva(".")
               escreva(".")
               timer(0)
               limpatela
            fimse
         fimenquanto
         escreva("Informe os meses de vida da crian�a: " )
         leia(mesesvida)
         enquanto mesesvida < 0 faca
            escreval("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=")
            escreval(" ----    Meses de vida menor ou igual a 0  ----")
            escreval("")
            escreva("Informe os meses de vida da crian�a: " )
            leia(mesesvida)
         fimenquanto
      fimse
      se (mesesvida <= 24) entao
         cri24m:= cri24m+1
      fimse

      se ( sexo = "M") ou (sexo = "m") entao
         mascmortas:= mascmortas + 1
      fimse

      totalMortas:= totalMortas + 1
      
fimenquanto

//calculando porcentagens

porc_mortasper := ((totalMortas / n_criancas) * 100)
porcmascmortas := (( mascmortas / totalMortas) * 100)
porcCri24m := ((cri24m / totalMortas) * 100)

//imprimindo resultados
escreval("N� de criancas nascidas :",n_criancas)
escreval("N� de criancas mortas :",totalMortas)
escreval("N� de criancas masculinas mortas :",mascmortas)
escreval("N� de criancas mortas com menos de 24 meses :",cri24m )
escreval("")
escreval("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=")
escreval("Porcentagem de mortas no periodo: ", porc_mortasper)
escreval("Porcentagem do sexo masc mortas no periodo: ", porcmascmortas)
escreval("Porcentagem de crian�as mortas com 24 meses ou menos: ", porcCri24m)
escreval("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=")

Fimalgoritmo