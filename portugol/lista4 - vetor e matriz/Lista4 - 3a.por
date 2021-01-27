programa
{
	funcao inicio()
	{
		inteiro N1[4][6], N2[4][6] , M1[4][6], i, j
		// ********* CRIANDO MATRIZ N1
		para(i=0; i<4; i++){
			
			para(j=0; j<6; j++){
				escreva("\n\n Informe o valor da linha e da Coluna ", "[", i, ",", j, "] da Matriz N1: ")
				leia(N1[i][j])
			}
		escreva("\n")	
		}

		//*********** EXIBINDO MATRIZ N1
		limpa()
		para(i=0; i<4; i++){
			
			para(j=0; j<6; j++){
				escreva("[", N1[i][j], "]")
			}
			escreva("\n")	
		}
		//***********  CRIANDO MATRIZ N2
		limpa()
		para(i=0; i<4; i++){
			
			para(j=0; j<6; j++){
				escreva("\n\n Informe o valor da linha e da Coluna ", "[", i, ",", j, "] da Matriz N2: ")
				leia(N2[i][j])
			}
		escreva("\n")	
		}
		//************  EXIBINDO MATRIZ N2
		limpa()
		para(i=0; i<4; i++){
			para(j=0; j<6; j++){
				escreva("[", N2[i][j], "]")
			}
			escreva("\n")	
		}

		//************* SOMA DAS MATRIZES N1 E N2 = M1
		para(i=0; i<4; i++) {
            para(j=0; j<6; j++) {
                M1[i][j] = N1[i][j] + N2[i][j]
                escreva("[", M1[i][j], "]")
            }
            escreva("\n")
        }
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 461; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */