import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		int idade;
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Digite a sua idade");
		idade = scan.nextInt();
		
		if(idade >= 10 && idade <=14) 
			System.out.println("Voc� � considerado infantil"); 
		else if(idade >=15 && idade <= 17) 
			System.out.println("Voc� � considerado juvenil"); 
		else if(idade >= 18 && idade <=25) 
			System.out.println("Voc� � considerado adulto"); 
		else System.out.println("Idade n�o listada em uma categoria!");
	}
}
