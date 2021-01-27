programa
{
	funcao inicio()
	{
		real salario, mediaSalario, mediaFilhos, salario100=0.00, percentualSalario, maiorSalario=0.0, somaSalario=0.0
		inteiro numeroFilhos, somaFilhos=0, habitantes=20
		
		para (inteiro i=0; i < habitantes ;i++){

			escreva("Informe seu salario: ")
			leia(salario)
			escreva("Quantos filhos você tem: ")
			leia(numeroFilhos)
			
				somaSalario = somaSalario + salario
				somaFilhos = somaFilhos + numeroFilhos
				se (salario <= 100)
					salario100 ++

				se (salario > maiorSalario)
					maiorSalario = salario
		}

		mediaSalario = somaSalario / habitantes
		mediaFilhos = somaFilhos / habitantes
		percentualSalario = (salario100 / habitantes) * 100

		escreva ("\nMédia do salário da população: ", mediaSalario)
		escreva ("\nMédia do número de filhos: ", mediaFilhos)
		escreva ("\nMaior salário: ", maiorSalario)
		escreva ("\nPercentual de pessoas com salário até R$100,00: é de ", percentualSalario, "%")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 960; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */