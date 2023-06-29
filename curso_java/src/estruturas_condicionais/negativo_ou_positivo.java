package estruturas_condicionais;

import java.util.Scanner;

public class negativo_ou_positivo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Digite um numero:");
		
		numero = sc.nextInt();
		
			if (numero < 0 ) {
				System.out.printf("Valor digitaro (%d) é negativo.", numero);
			}
			else {
				System.out.printf("Valor digitaro (%d) é positivo.", numero);

		}
			
		sc.close();
		
	}

}
