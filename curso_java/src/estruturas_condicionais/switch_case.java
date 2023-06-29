package estruturas_condicionais;

import java.util.Scanner;

public class switch_case {
    
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
        System.out.println("A semana tem sete dias! Se Domingo é 1 e 7 é Sábado, em qual dia estamos?");
		int numeroDiaSemana = sc.nextInt();
		
        String diaSemana;

        switch (numeroDiaSemana) {
        case 1:
            diaSemana = "Domingo";
            break;
        case 2:
            diaSemana = "Segunda";
            break;
        case 3:
            diaSemana = "Terça";
            break;
        case 4:
            diaSemana = "Quarta";
            break;
        case 5:
            diaSemana = "Quinta";
            break;
        case 6:
            diaSemana = "Sexta";
            break;
        case 7:
            diaSemana = "Sábado";
            break;
            
        default:
            diaSemana = "Valor inserido inválido.";
            break;
        }
		
        System.out.printf("O dia da semana em que estamos é (%s)\n", diaSemana);

		sc.close();
	}

}
