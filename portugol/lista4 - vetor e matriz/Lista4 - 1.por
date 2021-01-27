programa
{
	funcao inicio()
	{

		inteiro pontuacoes[5], maior=0

		para (inteiro i=0; i<5; i++){
			escreva("Digite a pontuação: ")
			leia(pontuacoes[i])

			se (pontuacoes[i] > maior)
				maior = pontuacoes[i]
		}

		limpa()
		para (inteiro i=0; i<5; i++){
			escreva("A pontuação ", (i+1), " foi: ", pontuacoes[i], "\n")
		}
		
		escreva("\n\nA maior pontuação foi: ", maior)	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 383; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */