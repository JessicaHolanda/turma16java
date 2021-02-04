package calculo;

public class TestaEmpregado {

	public static void main(String[] args) {
		
		Empregado emp1 = new Empregado("jjj", 66, 50, 30.00);
		Terceiro ter1 = new Terceiro("hhh", 55, 40, 30.00, 0.1);
		
		System.out.println(emp1.salario());
		System.out.println(ter1.salario());
		
	}

}
