programa
{
	funcao inicio()
	{

		inteiro numero=0, soma = 0, media=0, qtd=0

		enquanto(numero >= 0){
			escreva("\nDigite um número: ")
			leia (numero)
			se (numero >= 0){
				qtd++
				soma = soma + numero
			}	
		}

		media = soma / qtd

		escreva("\n A soma dos valores é: " +soma)
		escreva ("\n A média dos valores é: " +media)
		escreva ("\n A quantidade valores digitados é: " , qtd)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 175; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */