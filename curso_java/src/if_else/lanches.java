package if_else;

import java.util.Scanner;

public class lanches {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o código do produto:\n1-Dog 2-Xcarne 3-Xbacon 4-Misto 5-Coca");
		int codigo = sc.nextInt();

		System.out.println("Quantidade:");
		int quantidade = sc.nextInt();
		
		double total;
		if (codigo == 1) {
			total = quantidade * 4.0;
		}
		else if (codigo == 2) {
			total = quantidade * 4.5;
		}
		else if (codigo == 3) {
			total = quantidade * 5.0;
		}
		else if (codigo == 4) {
			total = quantidade * 2.0;
		}
		else {
			total = quantidade * 1.5;
		}

		
		System.out.printf("Total: R$ %.2f%n", total);
		
		sc.close();
	}
}
