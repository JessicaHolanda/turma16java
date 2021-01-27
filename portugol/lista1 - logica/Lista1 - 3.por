programa
{
	
	funcao inicio()
	{
		inteiro horas, minutos, segundos, inicial
		
		
		escreva("Digite sua idade em dias: ")
		leia (inicial)

		horas = inicial/3600
		minutos = (inicial % 3600) /60
		segundos = inicial % minutos
		
		
		//resultado = ((anos*365)+(meses*30)+dias)

		escreva ("A duração do evento é: " + horas + " horas " + minutos + " minutos e " + segundos + " segundos" )
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 232; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */