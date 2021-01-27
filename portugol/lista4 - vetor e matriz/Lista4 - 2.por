programa
{
	inclua biblioteca Util
	funcao inicio()
	{
		inteiro lancamentos[10], soma=0, jogadas=10, maior=0, qtd=0, media

		para (inteiro i=0; i<jogadas; i++){
			lancamentos[i] = Util.sorteia(1, 6)
			escreva(" ", lancamentos[i])
		}
		
		para (inteiro i=0; i < jogadas; i++){
			soma += lancamentos[i] 

			se (lancamentos[i] >= maior){
				se (lancamentos[i] == maior){
					qtd++
				} senao qtd=1
				maior = lancamentos[i]
			}
		}
		media = soma / jogadas

		escreva("\nA soma dos valores é: ", soma, "\nA media dos valores é: ", media, "\nA maior pontuação que apareceu foi: ",maior+
		"\nA maior pontuação apareceu ", qtd, " vezes\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 293; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */