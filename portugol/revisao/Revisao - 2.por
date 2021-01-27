programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		real peso, altura, imc
		escreva("Digite seu peso: ")
		leia(peso)
		escreva("Digite sua altura: ")
		leia(altura)

		imc = peso / mat.potencia(altura, 2)

		se (imc < 18.5) 
			escreva("\nSeu IMC é: ", imc, " e você está abaixo do peso ")	
		
		senao se (imc >= 18.5 e imc <= 25) 
			escreva("\nSeu IMC é: ", mat.arredondar(imc, 2), " e você está em seu peso ideal")
		senao se (imc > 25 e imc <= 30) 
			escreva("\nSeu IMC é: ", mat.arredondar(imc, 2), " e você está acima do peso ")
		senao //imc > 30 obeso
			escreva("\nSeu IMC é: ", mat.arredondar(imc, 2), " e você está obeso")
		escreva("\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 684; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */