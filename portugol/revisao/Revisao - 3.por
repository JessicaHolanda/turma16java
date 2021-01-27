programa
{
	
	funcao inicio()
	{
		inteiro numero, cont1=0, cont2=0, cont3=0, cont4=0
		
		faca{
			escreva("\nDigite um número: ")
			leia(numero)
			se (numero >=0 e numero <= 25)
				cont1++
			senao se (numero >=26 e numero <= 50)
				cont2++
			senao se (numero >=51 e numero <= 75)
				cont3++
			senao se (numero >=76 e numero <= 100)
				cont4++
		}enquanto(numero >=0)

		escreva("\n\nO intervalo [0-25] apareceu ", cont1, " vezes")
		escreva("\nO intervalo [26-50] apareceu ", cont2, " vezes")
		escreva("\nO intervalo [51-75] apareceu ", cont3, " vezes")
		escreva("\nO intervalo [76-100] apareceu ", cont4, " vezes")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 99; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */