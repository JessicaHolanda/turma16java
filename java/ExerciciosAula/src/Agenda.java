import java.util.Scanner;

public class Agenda {

	public static void main(String[] args) {
		
		int i, j, hora, dia;   //i = hora; j = dia
		String nome, agenda[][] = new String[24][31], tarefa;
		char continua, verAgenda, recomeca;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("TO DO LIST - SEJA BEM VINDO\n");
				
		System.out.println("Digite seu nome: ");
		nome = scan.next();
		
		do{
			do{
				System.out.println("Digite o dia, entre 1 e 31, em que deseja agendar seu evento: ");
				dia = scan.nextInt();
				System.out.println("Digite o horário, entre 0 e 23, em que deseja agendar seu evento: ");
				hora = scan.nextInt();
				
			}while(dia < 1 || dia >31 && hora < 0 || hora >23);
			
			dia -= 1; //Ajuste para evitar erros ao ler a matriz --- [0][30]
			
			if (agenda[hora][dia] != null)
				System.out.println("A data e horário escolhida já está ocupada\n");
			else{
				System.out.println("Informe a tarefa: ");
				tarefa = scan.next();
				agenda[hora][dia] = nome + " - " + tarefa;
				
				System.out.printf("\nHorário agendado:\n Dia %d  às %d:00 \nTarefa agendada: %s",dia+1, hora, agenda[hora][dia]);
			}	
	
			System.out.println("\n");
	
			System.out.println("Deseja continuar realizando agendamentos? S/N ");
			continua = scan.next().toUpperCase().charAt(0);	
			
			if(continua != 'S'){
				System.out.println("\nDeseja ver a agenda atual: S/N ");
				verAgenda = scan.next().toUpperCase().charAt(0);
				if(verAgenda == 'S'){

					//exibindo a matriz
					System.out.println("\n\nAGENDA ATUAL:\n");
					for(i=0; i<24; i++){
						for(j=0; j<31; j++){
							if (agenda[i][j] != null)
								System.out.printf("Dia %d às %d:00 \nEvento: %s\n", j+1, i, agenda[i][j]);
						}
					}
				} 	
			}
		}while (continua == 'S');		
			
			// RECOMEÇAR
			System.out.println("\nDeseja recomeçar do zero? S/N ");
			recomeca = scan.next().toUpperCase().charAt(0);
			if(recomeca == 'S'){
				main(args);
			}
	}

}
