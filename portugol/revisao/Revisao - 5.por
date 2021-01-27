programa
{
	inclua biblioteca Util
	
	funcao inicio()
	{
		real vetor[5] = {5.5, 6.6, 2.7, 11.8, 17.1}
		inteiro codigo, i

		escreva(" 1 - Vetor em ordem direta"+
		"\n 2 - Vetor em ordem inversa: "+
		"\nDigite o código correspondente a visualização desejada: ")
		leia(codigo)
		
		se (codigo==1){
			escreva("\nOrdem direta: ")	
			para(i=0; i<5; i++){
				escreva(vetor[i], "\t")
			}
			escreva("\n")
		}
		senao se (codigo==2){
			escreva("\nOrdem inversa: ")	
			para(i=4; i>=0; i--){
				escreva(vetor[i], "\t")
			}
			escreva("\n")
		}
		senao
			escreva("\nCÓDIGO INVÁLIDO!!!\n")	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 593; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */