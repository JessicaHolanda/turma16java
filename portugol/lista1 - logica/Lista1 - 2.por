programa
{
	
	funcao inicio()
	{
		inteiro anos, meses, dias, idade
		
		
		escreva("Digite sua idade em dias: ")
		leia (idade)

		anos = idade/365
		meses = (idade % 365) /30
		dias = idade % meses
		
		
		//resultado = ((anos*365)+(meses*30)+dias)

		escreva ("Sua idade é: " + anos + " anos " + meses + " meses e " + dias + " dias" )
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 342; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */