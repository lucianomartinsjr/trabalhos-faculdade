Algoritmo "atvd3"

Var
    nome : caractere
    nomesC : vetor[1..10] de caractere
    i, total : inteiro

Inicio
    para i de 1 ate 10 faca
        escreva("Digite um nome: ")
        leia(nome)

        se (copia(maiusc(nome), 1, 1) = "C") entao
            total := total + 1
            nomesC[total] := nome
        fimse
        limpatela
    fimpara

    escreval("=-=- Listagem de nomes que começam com 'C' é :  -=-=-")

    para i de 1 ate total faca
        escreval(NomesC[i])
    fimpara


Fimalgoritmo
