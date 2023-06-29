package estruturas_condicionais;

import java.util.Scanner;

public class expressão_ternaria {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
        
        System.out.println("Insira o preção total da compra:");
        
        double valorTotal = sc.nextDouble();

        //double desconto;
        //if (valorTotal < 20.0) {
        //desconto = valorTotal * 0.1;
        //} 
        //else {
        //desconto = valorTotal * 0.05;
        //}

        double desconto = (valorTotal < 20.0) ? valorTotal * 0.1 : valorTotal * 0.05;

        System.out.printf("O desconto é de %.2f\n", desconto);

        sc.close();

    }
}