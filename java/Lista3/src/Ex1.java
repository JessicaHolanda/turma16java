
public class Ex1 {

	public static void main(String[] args) {
		int i;
		for(i = 1000; i<1999; i++) {
			if (i% 11 == 5) {
				System.out.printf("%d\t", i);
			}
		}
	}
}
