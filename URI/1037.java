import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		float value = scanner.nextFloat();
		scanner.close();
		if(value >=0 && value <= 25 ) {
			System.out.printf("Intervalo [0,25]\n");
		}else if(value > 25  && value <= 50 ) {
			System.out.printf("Intervalo (25,50]\n");
		}else if(value > 50  && value <= 75 ) {
			System.out.printf("Intervalo (50,75]\n");
		}else if(value > 75  && value <= 100 ) {
			System.out.printf("Intervalo (75,100]\n");
		}else {
			System.out.printf("Fora de intervalo\n");
		}
	}	
}