programa
{
	
	funcao inicio()
	{

		real custoFabrica, custoCarroNovo, pctDistribuidor, pctImpostos
		
		escreva("Digite o valor de fabrica do veículo: ")
		leia(custoFabrica)


		pctDistribuidor = custoFabrica * 0.28

		pctImpostos = custoFabrica * 0.45

		custoCarroNovo = custoFabrica + pctDistribuidor + pctImpostos

		escreva("\n O valor do veículo é: " + custoCarroNovo)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 353; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */