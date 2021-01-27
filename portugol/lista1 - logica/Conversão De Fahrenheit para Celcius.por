programa
{
	
	funcao inicio()
	{
		real celcius
		real fahrenheit

		escreva ("****************************************\n")
		escreva (" Conversão De Fahrenheit para Celcius\n")
		escreva ("****************************************\n\n")
		escreva("Digite a temperatura em Fahrenheit : ")
		leia (fahrenheit)
		
		celcius = ((fahrenheit - 32)/1.8)

		escreva("\nA temperatura em Celcius é: " + celcius + " °C")
		escreva("\n")
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 173; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */