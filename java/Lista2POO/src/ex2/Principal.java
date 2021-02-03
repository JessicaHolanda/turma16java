package ex2;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("VERIFICAÇÃO DE SALDOS DE FORNECEDOR");
		
		Fornecedor fornecedor1 = new Fornecedor("Tywin", "Westeros", "0101-0101");
		
		System.out.printf("\nFornecedor: %s\nEndereço: %s\nTelefone: %s", fornecedor1.getNome(), fornecedor1.getEndereco(), fornecedor1.getTelefone());
		
		fornecedor1.setValorCredito(10000.00);
		fornecedor1.setValorDivida(6000.00);
		
		System.out.printf("\n\nCrédito: R$ %.2f", fornecedor1.getValorCredito());
		System.out.printf("\nDébito: R$ %.2f", fornecedor1.getValorDivida() );
		
		fornecedor1.obterSaldo();
	}
}
