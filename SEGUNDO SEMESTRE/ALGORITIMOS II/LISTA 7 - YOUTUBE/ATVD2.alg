Algoritmo "atvd2"

Var
    n1, n2, medias : vetor[1..4] de real
    nomes : vetor[1..4] de caractere
    medTurma, somaMedias : real

    i : inteiro


Inicio
    medTurma := 5.8

    para i de 1 ate 4 faca
        escreval("MATRICULA: ", i)
        escreva("Informe o nome: ")
        leia(nomes[i])
        escreva("Infome a primeira nota: ")
        leia(n1[i])
        escreva("Informe a segunda nota: ")
        leia(n2[i])
        limpatela
        medias[i] := (n1[i] + n2[i]) / 2
    fimpara

    limpatela

    escreval("")
    escreval("=-=-=-=-=-=- ALUNOS -=-=-=-=-=-=")

    para i de 1 ate 4 faca
        escreval(nomes[i]:15, medias[i])
    fimpara

    para i de 1 ate 4 faca
        se (medias[i] > medTurma) entao
            somaMedias := somaMedias + 1
        fimse
    fimpara


    escreval()
    escreval(somaMedias, " alunos ficaram acima da média que é ", medTurma)


Fimalgoritmo

