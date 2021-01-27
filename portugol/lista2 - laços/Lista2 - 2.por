programa
{
	
	funcao inicio()
	{
		real codigo, numeroH, excesso, hora = 10.00, horaE = 20.00, salarioTotal, salarioExcedente=0.00
	
		escreva("Digite seu código: ")
		leia(codigo)
		escreva("Digite o número de horas trabalhadas: ")
		leia(numeroH)

		limpa()
		se (numeroH > 50){
			excesso = numeroH - 50
			salarioExcedente = excesso * horaE
			salarioTotal = 500.00 + salarioExcedente
			escreva ("O salário total de " +codigo+ " é: R$ " + salarioTotal+ "\nE o salário excedente foi: R$ " + salarioExcedente)
		}
		senao {
			salarioTotal = numeroH * hora
			escreva ("O salário total de " +codigo+ " é: R$ " +salarioTotal+ " e não ouve excedente")
		}

		escreva("\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 350; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */