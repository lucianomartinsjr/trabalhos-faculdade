Algoritmo "atvd1"

Var
    num : vetor[1..7] de inteiro
    i, tPares : inteiro


Inicio
    tPares := 0
    
    para i de 1 ate 7 faca
        escreva("Digite o numero ", i, ": ")
        leia(num[i])
        limpatela
    fimpara
    
    para i de 1 ate 7 faca
        se (num[i] % 2 = 0) entao
            escreval("Valor par no indice:", i)
            tPares := tPares + 1
        fimse
    fimpara
    
    escreval("")
    escreval("O total de pares foi :", tPares)


Fimalgoritmo
