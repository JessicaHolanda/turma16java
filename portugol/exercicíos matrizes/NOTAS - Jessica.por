programa
{
	funcao inicio()
	{

	cadeia alunos[] = {"ALONSO MENDES SILVA DE OLIVEIRA","ANDRESSA FERREIRA DOS SANTOS","ATHOS GIOM DE PAIVA MESQUITA","C NDIDO JURELMO DOS SANTOS CAVALEIRO","CAROLINA GUIDA","DANIELE DOS SANTOS PINHEIRO","DÉBORA VIDEIRA MONTEIRO","DENILSON TEIXEIRA DE SOUZA","DENISE BRITO ANJOS","FELIPE CASAGRANDE TEIXEIRA DE CASTRO","FERNANDO BEDNARSKI RAMOS","FERNANDO DE BARROS SABALETE","GISELE DE OLIVEIRA PAZ","GUSTAVO DE SOUZA GUILHEN","GUSTAVO ESTEBAN CARRERAS JORGE","GUSTAVO LIMA DE SOUZA","IGOR MILHOMENS DOS SANTOS","JEAN PABLO CESARIO DA SILVA","JESSICA REGINA RODRIGUES HOLANDA","KAREN BERNARDI","KEWIN SOUTO BARROS","LEONARDO LIMA CINTRA","LEONARDO QUEIROZ BURJATO","LUCAS ALVES SCHIMIT","LUCAS DE BARROS PAIFAR","LUCAS LOIOLA DE ALMEIDA","MARCOS DOS SANTOS","MARIA NAZARE CORTEZ LIMA","MARIANA LIMA","MATHEUS RIBEIRO VILLELA","MAYARA CARDINOT MAFIOLETTI","MILTON JUNIOR CAVALCANTE DA PENHA","NATÃ DE ARAUJO GRECU","OSVALDO TAVARES VELASCO","PAOLA ALENCAR LISBOA","RAPHAEL EUZÉBIO SCAZITI","RENATO ANDRÉ NASCIMENTO SILVA","RUI ALMEIDA DE ANDRADE","TATIANE TISSONI ANTUNES","VICTOR DE MORAIS ARAUJO"}
	cadeia matricula[40], situacao[40], aux
	inteiro notas[40], i
	caracter resp

		para (i=0; i<40; i++){
			matricula[i] = ("G16-"+(i+1))
			escreva(matricula[i],"\t\t" ,alunos[i],"\n")
		}

		//ATRIBUIÇÃO DE NOTA
		faca{
			escreva ("\n******************************\n")
			escreva("    ATRIBUIÇÃO DE NOTAS\n")
			escreva ("******************************\n")
			escreva("\nDigite a matricula do aluno: ")
			leia(aux)
				
			para (i=0; i<40; i++){
				se(matricula[i] == aux){
					escreva("\n\nAluno: ", matricula[i],"\t\t" ,alunos[i],"\n\n")
					faca{
						escreva("Digite a nota para o aluno selecionado [1-10]: ")
						leia(notas[i])
						se (notas[i]<0 ou notas[i] >10){
							escreva("\nApenas notas de 0 a 10\n")
						}

					}enquanto(notas[i] < 0 ou notas[i] > 10)
	
				} 
			}

			escreva("\n\nDeseja cadastrar outra nota?")
			leia(resp)
		}enquanto(resp == 'S')

		limpa()
		escreva ("\n******************************\n")
		escreva ("    SITUAÇÃO DOS ALUNOS\n")
		escreva ("******************************\n\n")
		para (i=0; i<40; i++){
			se(notas[i]>=8)
				situacao[i]= "APROVADO"
			senao se (notas[i]>=5 e notas[i]<8 )
				situacao[i]= "EM ANALISE"
			senao
				situacao[i]= "REPROVADO"
					
			escreva(matricula[i],"\t\t", notas[i], "\t\t", situacao[i], "\t\t" ,alunos[i], "\n")
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1892; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */