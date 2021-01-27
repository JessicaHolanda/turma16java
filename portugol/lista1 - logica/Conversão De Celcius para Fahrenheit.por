programa
{
	
	funcao inicio()
	{
		real celcius
		real fahrenheit

		escreva ("****************************************\n")
		escreva (" Conversão De Celcius para Fahrenheit\n")
		escreva ("****************************************\n\n")
		escreva("Digite a temperatura em Celcius: ")
		leia (celcius)
		
		fahrenheit = (celcius * 1.8 + 32)

		escreva("\nA temperatura em Fahrenheit é: " + fahrenheit + " °F")
		escreva("\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 437; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */