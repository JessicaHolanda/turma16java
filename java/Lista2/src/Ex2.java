public class Ex2 {
	public static void main(String[] args) {
		int i,j, aux, numero[] = {6, 4, 3};
		
		System.out.println("Vetor desordenado: \n");
		for(int num : numero)
			System.out.printf("[ %d ]", num);
		
		for(i=0; i<numero.length;i++) {
			for(j = 0; j<numero.length -1; j++){
				if(numero[j] > numero[j + 1]){
					aux = numero[j];
					numero[j] = numero[j+1];
					numero[j+1] = aux;
				}
			}
		}
		System.out.println("\n\nVetor ordenado:\n");
		for(int num : numero)
			System.out.printf("[ %d ]", num);
	}
}
