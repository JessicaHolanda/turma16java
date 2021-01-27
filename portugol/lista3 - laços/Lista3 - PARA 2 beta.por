programa
{
	
	funcao inicio()
	{

		inteiro numero[500], soma=0, aux=1

		/*para (inteiro i=0; i<500; i++){
			numero[i] = aux
			aux++
		}*/

		para (inteiro i=0; i<500; i++){
			numero[i] = aux
			aux++
			se(numero[i] % 2 != 0){
				se (numero[i] % 3 == 0){
					escreva(" " +numero[i])
					soma = soma + numero[i]
				}
			}
		}
		escreva("\n\n A soma é: " +soma)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 236; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */