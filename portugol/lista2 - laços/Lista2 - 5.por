programa
{
	
	funcao inicio()
	{
		real poluicao
		//poluição aceitavel = 0,05 - 0,25

		escreva("Qual o índice de poluição medido: ")
		leia(poluicao)
		
		se (poluicao >= 0.3 e poluicao <= 0.39)
			escreva("\nPrimeiro grupo intimado a suspender suas atividades\n")

		senao se (poluicao >= 0.4 e poluicao <= 0.49)
			escreva("\nPrimeiro e segundo grupo intimados a suspenderem suas atividades\n")

		senao se (poluicao >= 0.5)
			escreva("\nTodos os grupos são notificados e devem suspender suas atividades\n")
		senao
			escreva("\nOs indices de poluição estão baixos\n")

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 200; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */