programa
{
	
	funcao inicio()
	{
		
		real base, altura, area

		faca {
		escreva("Digite a base: ")
		leia(base)
		} enquanto(base < 0)
		
		faca {
			escreva("Digite a altura: ")
			leia(altura)
		} enquanto(altura < 0)

		area = (base * altura) / 2

		escreva("\nA area do triangulo é: " +area)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 47; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */