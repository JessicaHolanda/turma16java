programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		inteiro vetor[4], quadrado[4], aux, aux2

		para (inteiro i=0; i<4;i++){
			escreva("Digite um número: ")
			leia(aux)
			vetor[i] = aux
		}

		para (inteiro i=0; i<4;i++){
			aux = vetor[i]
			aux2 = mat.potencia(aux, 2)
			quadrado[i] = aux2
		}

		limpa()
		se (quadrado[2] >= 1000)
			escreva("O valor do terceiro é: " + quadrado[2])
		senao
			escreva("Primeiro: "+ vetor[0]+ " e quadrado: " +quadrado[0]+ "\nSegundo: " +vetor[1]+ 
			" e quadrado: " +quadrado[1]+ "\nTerceiro: " +vetor[2]+ " e quadrado: " +quadrado[3]+"\nQuarto: " +vetor[3]+ 
			" e quadrado: " +quadrado[3])
		
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 670; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */