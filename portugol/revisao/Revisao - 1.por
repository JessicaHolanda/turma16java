programa
{
	inclua biblioteca Matematica --> mat

	funcao inicio()
	{
		real precoEtiqueta=0.00
		escreva("Insira o valor da etiqueta do produto: ")
		leia(precoEtiqueta)
		
		escreva("\n ESCOLHA A FORMA DE PAGAMENTO \n")
		escreva("\n 1 - Para pagamento à vista no dinheiro ou cheque")
		escreva("\n 2 - Para pagamento à vista no cartão de crédito")
		escreva("\n 3 - Para pagamento parcelado em duas vezes")
		escreva("\n 4 - Para pagamento parcelado em três vezes")
		escreva("\n\nDigite a opção desejada: ")

		inteiro codigo
		leia(codigo)
		escolha (codigo){
			caso 1:
				escreva("\nTotal a pagar: R$ ",dinheiroCheque(precoEtiqueta),"\n")
			pare
			caso 2:
				escreva("\nTotal a pagar: R$ ",aVistaCartao(precoEtiqueta), "\n")
			pare
			caso 3:
				escreva("\nTotal a pagar: R$ ", precoEtiqueta, "\n")
			pare
			caso 4:
				escreva("\nTotal a pagar: R$ ",parcelado3(precoEtiqueta), "\n")
			pare
		}	

		
	}

	funcao real dinheiroCheque(real produto){
		real desconto
		desconto = produto * 0.8
		retorne desconto
	}

	funcao real aVistaCartao(real produto){
		real desconto 
		desconto = produto * 0.75
		retorne desconto
	}

	funcao real parcelado3(real produto){
		real novoPreco 
		novoPreco = produto * 1.1
		retorne mat.arredondar(novoPreco, 2) 
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 488; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */