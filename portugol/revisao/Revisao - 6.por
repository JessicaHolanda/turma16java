programa
{
	inclua biblioteca Util 
	
	funcao inicio()
	{
		inteiro matriz[3][3], vetor[3], vetor2[3], i, j, soma

		escreva("\nMATRIZ: \n")
		para(i=0; i<3; i++){
			para(j=0; j<3; j++){
				matriz[i][j] = Util.sorteia(1, 9)
				escreva("[", matriz[i][j], "]")			
			}
		escreva("\n")	
		}

		escreva("\nVETOR: \n")
		para(i=0; i<3; i++){
			vetor[i] = Util.sorteia(1, 9)
			escreva("[", vetor[i], "]\t")
		} 
			
		escreva("\n\nRESULTADO: \n")
		para(i=0; i<3; i++){
			soma = 0
			para(j=0; j<3; j++){
				soma += vetor[j]*matriz[j][i]	
			}
			vetor2[i] = soma
			escreva("[", vetor2[i], "]\t")
		}
		escreva("\n ")		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 544; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */