import java.util.Scanner;

public class soma {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x, y;

		y = sc.nextInt();
		x = sc.nextInt();
		
		var resultado = (x + y);
		
		System.out.println("Soma = " + resultado);

		sc.close();
	}

}
