import java.util.Scanner;

public class Ex8 {
	public static void main(String[] args) {
		double custoFabrica, custoCarroNovo, pctDistribuidor, pctImpostos;
		Scanner scan = new Scanner(System.in);
		

		System.out.println("Digite o valor de fabrica do veículo: ");
		custoFabrica = scan.nextDouble();


		pctDistribuidor = custoFabrica * 0.28;

		pctImpostos = custoFabrica * 0.45;

		custoCarroNovo = custoFabrica + pctDistribuidor + pctImpostos;

		System.out.println("\n O valor do veículo é: " + custoCarroNovo);
	}
	
}
