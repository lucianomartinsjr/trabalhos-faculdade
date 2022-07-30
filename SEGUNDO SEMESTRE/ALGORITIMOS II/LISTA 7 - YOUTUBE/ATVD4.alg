Algoritmo "atvd4"

Var
    num : vetor[1..4] de inteiro
    i, j, aux : inteiro

Inicio
    para i de 1 ate 4 faca
        escreva("Digite um número: ")
        leia(num[i])
    fimpara

    para i de 1 ate 3 faca
        para j de i + 1 ate 4 faca
             se (num[i] > num[j]) entao
                 aux := num[i]
                 num[i] := num[j]
                 num[j] := aux
             fimse
        fimpara
    fimpara

    escreval("")
    escreval("Vetor ordenado: ")

    para i de 1 ate 4 faca
        escreva(num[i], " ")
    fimpara

Fimalgoritmo
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

