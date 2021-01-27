programa
{
	inclua biblioteca Texto
	funcao inicio()
	{
		real salario, imposto=0.00, salarioNovo=0.00
		cadeia nome, apelido=""
		caracter sexo 
		
		escreva ("Digite o seu nome: ")
		leia(nome)
				
		faca {
			escreva ("Digite o seu sexo F/M: ")
			leia (sexo)
		} enquanto(sexo != 'f' e sexo != 'm' e sexo !='F' e sexo !='M')
		
		escreva("\nDigite seu salário: ")
		leia(salario)

		limpa()

		se(salario <= 1100){
			se (sexo == 'f')
				apelido = "Sra "
			senao se (sexo == 'm')
				apelido = "Sr "
			escreva(apelido + nome + "\nVocê é isento(a) de imposto\n")
		}
		senao se (salario > 1100 e salario <= 3500){
			se (sexo == 'f')
				apelido = "Sra "
			senao se (sexo == 'm')
				apelido = "Sr "
			imposto = salario * 0.09
			salarioNovo = salario - imposto
			escreva(apelido + nome +"\nSalário inicial: " +salario+ "\nImposto: " +imposto+ "\nSalário após dedução de impostos: " +salarioNovo+ "\n")
		}
		senao se (salario > 3500 e salario <= 10000){
			se (sexo == 'f')
				apelido = "Sra "
			senao se (sexo == 'm')
				apelido = "Sr "
			imposto = salario * 0.15
			salarioNovo = salario - imposto
			escreva(apelido + nome +"\nSalário inicial: " +salario+ "\nImposto: " +imposto+ "\nSalário após dedução de impostos: " +salarioNovo+ "\n")
		}
		senao {
			se (sexo == 'f')
				apelido = "Sra "
			senao se (sexo == 'm')
				apelido = "Sr "
			imposto = salario * 0.27
			salarioNovo = salario - imposto
			escreva(apelido + nome +"\nSalário inicial: " +salario+ "\nImposto: " +imposto+ "\nSalário após dedução de impostos: " +salarioNovo+ "\n")
		}			
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 330; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */