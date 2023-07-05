package estruturas_repetitivas;

import java.util.Scanner;

public class EstruturaRepetitivaFor {
       
    public static void main(String[] agrs) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos numeros vamos somar?");
        int N = sc.nextInt();

        int soma = 0;

        for (int i=0; i<N; i++) {
            System.out.println("Insira mais um numero!");
            int x = sc.nextInt();
            soma = soma + x;

        }

        System.out.printf("A soma total dos numeros inseridos = %d \n", soma);

        sc.close();
    }
}