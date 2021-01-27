programa
{
	funcao inicio()
	{
		inteiro i, j, hora, dia   //i = hora; j = dia
		cadeia nome, agenda[24][31], tarefa
		caracter continua, verAgenda, recomeca

		escreva("TO DO LIST - SEJA BEM VINDO\n\n")
		
		escreva("Digite seu nome: ")
		leia(nome)
		faca{
			faca{
				escreva("Digite o dia, entre 1 e 31, em que deseja agendar seu evento: ")
				leia(dia)
				escreva("Digite o horário, entre 0 e 23, em que deseja agendar seu evento: ")
				leia(hora)
				
			}enquanto(dia < 1 ou dia >31 e hora < 0 ou hora >23)
			
			dia -= 1 //Ajuste para evitar erros ao ler a matriz --- [0][30]
			
			se (agenda[hora][dia] != "")
				escreva("A data e horário escolhida já está ocupada\n")
			senao{
				escreva("Informe a tarefa: ")
				leia(tarefa)
				agenda[hora][dia] = nome + " - " + tarefa
	
				escreva("\nHorário agendado:\n Dia ",dia+1, " às ", hora, ":00", "\nTarefa agendada: ", agenda[hora][dia] )
			}	
	
			escreva("\n\n")
	
			//Pergunta se quer continuar 
			escreva("Deseja continuar? S/N ")
			leia(continua)
		
			
			se(continua != 'S'){
				escreva("\nDeseja ver a agenda atual: S/N ")
				leia(verAgenda)
				se(verAgenda == 'S'){
					limpa()
					//exibindo a matriz
					escreva("\n\nAGENDA ATUAL:\n\n")
					para(i=0; i<24; i++){
						para(j=0; j<31; j++){
							se (agenda[i][j] != "")
								escreva("Dia ", j+1, " às ", i, ":00 \nEvento: ", agenda[i][j], "\n")
						}
					}
				} 	
			}
		} enquanto(continua == 'S')		
			
			// RECOMEÇAR
			escreva("\nDeseja recomeçar do zero? S/N ")
			leia(recomeca)
			se(recomeca == 'S'){
				inicio()
			}

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1125; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */