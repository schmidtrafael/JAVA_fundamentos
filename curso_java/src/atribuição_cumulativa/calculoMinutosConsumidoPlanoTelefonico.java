package atribuição_cumulativa;

import java.util.Scanner;

public class calculoMinutosConsumidoPlanoTelefonico {

    public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

        System.out.println("Quantos minutos o cliente utilizou do plano telefonico?");    
        int minutoUtilizados = sc.nextInt();

        double conta = 50.0;
        
        if (minutoUtilizados > 100){
            conta = conta + (minutoUtilizados - 100) * 2.0;
        }

        System.out.printf("O valor total da conta é de %.2f!\n", conta);

		sc.close();
		
	}
}
