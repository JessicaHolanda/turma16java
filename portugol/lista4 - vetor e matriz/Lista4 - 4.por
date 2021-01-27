programa
{
	funcao inicio()
	{
		inteiro matriz[3][3], i, j, somaMatriz=0, somaDiagonal=0

		// *********  CRIANDO MATRIZ   *********
		para(i=0; i<3; i++){
			
			para(j=0; j<3; j++){
				escreva("\n\n Informe o valor da linha e da Coluna ", "[", i, ",", j, "] da Matriz: ")
				leia(matriz[i][j])
			}
		}

		//***********  EXIBINDO A MATRIZ  *********
		limpa()
		para(i=0; i<3; i++){
			
			para(j=0; j<3; j++){
				escreva("[", matriz[i][j], "]")
			}
			escreva("\n")	
		}
		// CONTINUA{...}
		
		//   {...} CONTINUAÇÃO EX4
		
		//************* SOMA DOS ELEMENTOS E DA DIAGONAL DA MATRIZ *********

		para(i=0; i<3; i++){
			para(j=0; j<3; j++){
				somaMatriz = somaMatriz + (matriz[i][j])
				se(i == j)
					somaDiagonal += matriz[i][j]
			}
		}
		escreva("\nA soma dos elementos da Matriz é: ", somaMatriz)
		escreva("\n\nA soma dos elementos da Diagonal da Matriz é: ", somaDiagonal, "\n")
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 497; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */