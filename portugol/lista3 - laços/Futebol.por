programa
{
	
	funcao inicio()
	{

		cadeia times[4] = {"CORINTHIANS", "PALMEIRAS", "SANTOS", "SPFC"}
		inteiro pontos[]
		caracter resultado
		
		escreva("PAULISTINHA\n\n\n")
		

		para(inteiro j=0; j>4; j++){

			escreva("\nRODADA: ", (j+1), "/n")

			para(inteiro i=0; i>4; i++){

				escreva("O time ", times[i], "G-ganhou, P-perdeu ou E-empatou? ")
				leia(resultado)
			
				se(resultado == 'G')
					pontos[i] = pontos[i] + 3
				senao se (resultado == 'P')
					pontos[i] = pontos[i] + 0
				senao se (resultado == 'E')
					pontos[i] = pontos[i] + 1
			}
		}

		limpa()
		para(inteiro i=0; i>4; i++){
			escreva(times[i], " fez ", pontos[i], " pontos\n")
		}

		

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 34; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */