programa
{
	
	funcao inicio()
	{
		inteiro idade
		
		escreva("Digite a idade do nadador: ")
		leia(idade)

		
		se (idade >=5 e idade <= 7)
			escreva("\nO nadador pertence a categoria: Infantil A\n")
		
		senao se(idade >= 8 e idade <= 11)
			escreva("\nO nadador pertence a categoria: Infantil B\n")
		
		senao se(idade >= 12 e idade <= 13)
			escreva("\nO nadador pertence a categoria: Juvenil A\n")
		
		senao se(idade >= 14 e idade <= 17)
			escreva("\nO nadador pertence a categoria: Juvenil B\n")
		
		senao se(idade >= 18)
			escreva("\nO nadador pertence a categoria: Adultos\n")
		senao
			escreva("\n" +idade + " anos é muito jovem para fazer parte de uma categoria\n")

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 685; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */