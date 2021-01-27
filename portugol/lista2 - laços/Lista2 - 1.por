programa
{
	
	funcao inicio()
	{
		real peso, excesso, multa, kg = 50.00
		
		escreva("Digite o peso: ")
		leia(peso)

		limpa()

		se (peso > kg) {
			excesso = peso - kg
			escreva ("\n" + excesso)
			multa = excesso*4.00
			escreva("\n O peso excedente é " + peso+ "\n O valor da multa é: " +multa )		
		} senao
			escreva("\nPeso atual: 50kg \nExcesso:0 \nMulta: R$ 0,00\n")
	}
}




/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 229; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */