Algoritmo "semnome"

Var
   salas_total,salas_ausen,n_alunos,matricula,i,ausentes,presentes:inteiro
   sala,salaaux,presenca,ap_alun:caractere
   porc :real
   contadoralunos:inteiro


Inicio
   para salas_total de 1 ate 14 faca
      escreva("Informe a letra da turma: ")
      leia(sala)
      escreva("Informe o numero de alunos da turma '",sala,"' : ")
      leia(n_alunos)
      //condiçào de entrada de matriculados
      enquanto (n_alunos < 0 ) faca
         escreval("Numeros de alunos menor que 0")
         escreva("Informe novamente: ")
         leia(n_alunos)
      fimenquanto

      limpatela
      contadoralunos := n_alunos
      ausentes:=0
      
      para i de 1 ate n_alunos faca

         escreval("---------------------------------")
         escreval("           -  TURMA ",sala," -   ")
         escreva("Informe a matricula do aluno: ")
         leia(matricula)
         escreval("")
         escreval("Para alunos AUSENTES  informe > A < ")
         escreval("Para alunos PRESENTES informe > P < ")
         escreval("")
         escreva("Informe se o aluno está presente ou ausente: ")
         leia(ap_alun)

         se ((ap_alun = "a") ou (ap_alun = "A")) entao
            ausentes := ausentes + 1
         fimse

         limpatela

         contadoralunos := contadoralunos - 1
         escreval(" Restam ",contadoralunos," Alunos a serem lidos.")
      fimpara
      
      presentes:= ( n_alunos - ausentes)
      //calculo da porcentagem de ausencia
      porc := ((ausentes*100)/n_alunos)
      //verificando se é maior que 5% de ausencias
      //se ( porc > 5 ) entao
         //salas_ausen := salas_ausen + 1
         //deixando o ambiente limpo
         limpatela
         escreval("----------------------------------------")
         escreval("A turma '",sala,"' que possui ",n_alunos)
         escreval("Contabilizando ", porc,"% ausência")
         escreval("Teve ",presentes," Alunos Presentes")
         escreval("  E  ",ausentes,"  Alunos Ausentes ")
         escreval("----------------------------------------")
         escreval("")

      fimpara
      limpatela
      escreval("----------------------------------------")
      escreval("")
      escreval("A totalizamos ",salas_ausen," salas com mais 5% de ausencia")
      escreval("")
      escreval("----------------------------------------")



Fimalgoritmo