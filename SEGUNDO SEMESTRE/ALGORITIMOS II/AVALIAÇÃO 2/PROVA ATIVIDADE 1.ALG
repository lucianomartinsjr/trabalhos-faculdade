algoritmo "semnome"

var
   vet: vetor [0..9] de inteiro
   i,ia,ib,aux,menor: inteiro
Inicio

   vet[0]:=15
   vet[1]:=10
   vet[2]:=16
   vet[3]:=28
   vet[4]:=23
   vet[5]:=5
   vet[6]:=11
   vet[7]:=21
   vet[8]:=22
   vet[9]:=13


   escreval("- VETOR INICIAL")
   para i de 0 ate 9 faca
      escreva(" | ",vet[i]:2)
   fimpara
   escreva(" |")
   escreval("")

   para i de 0 ate 9 faca
   
       se i = 5 entao
         escreval("")
         escreval("- Vetor na quinta passagem :")
         para ib de 0 ate 9 faca
            escreva(" | ",vet[ib]:2)
         fimpara
         escreva(" | ")
         escreval("")
      fimse
   
      menor:=i

      para ia de i+1 ate 9 faca
         se vet[menor] > vet[ia] entao
            menor:=ia
         fimse

      fimpara

      se i <> menor entao
         aux:= vet[i]
         vet[i]:= vet[menor]
         vet[menor]:= aux
      fimse



   fimpara
   escreval("")
   escreval("- Vetor em Ordem Crescente :")
   para i de 0 ate 9 faca
      escreva(" | ",vet[i]:2)
   fimpara
   escreva(" | ")
fimalgoritmo
