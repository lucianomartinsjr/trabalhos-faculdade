Algoritmo "semnome"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi
// Descrição   : Aqui você descreve o que o programa faz! (função)
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
   escreva("Informe o número de crianças nascidas no periodo: ")
   leia(n_criancas)
   escreval("")
   enquanto ( sexo <> "" ) faca
      limpatela

      escreval("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=")
      escreval(" F - Feminino")
      escreval(" M - Masculino")
      escreval("Deixar em branco finalizará a contagem.")
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
            escreval("Deixar em branco finalizará a contagem.")
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
         escreva("Informe os meses de vida da criança: " )
         leia(mesesvida)
         enquanto mesesvida < 0 faca
            escreval("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=")
            escreval(" ----    Meses de vida menor ou igual a 0  ----")
            escreval("")
            escreva("Informe os meses de vida da criança: " )
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
escreval("Nº de criancas nascidas :",n_criancas)
escreval("Nº de criancas mortas :",totalMortas)
escreval("Nº de criancas masculinas mortas :",mascmortas)
escreval("Nº de criancas mortas com menos de 24 meses :",cri24m )
escreval("")
escreval("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=")
escreval("Porcentagem de mortas no periodo: ", porc_mortasper)
escreval("Porcentagem do sexo masc mortas no periodo: ", porcmascmortas)
escreval("Porcentagem de crianças mortas com 24 meses ou menos: ", porcCri24m)
escreval("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=")

Fimalgoritmo