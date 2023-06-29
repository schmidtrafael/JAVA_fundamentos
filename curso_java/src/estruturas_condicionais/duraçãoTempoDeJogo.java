package estruturas_condicionais;

import java.util.Scanner;

public class duraçãoTempoDeJogo {
    
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

        System.out.println("Qual foi a hora que o jogo iniciou?");
		int horaInicioJogo = sc.nextInt();
        
        System.out.println("Qual foi a hora que o jogo encerrou?");
		int horaFimJogo = sc.nextInt();

        int duracao;

        if (horaInicioJogo < horaFimJogo) {
            duracao = horaFimJogo - horaInicioJogo;
        } else {
            duracao = 24 - horaInicioJogo + horaFimJogo;
        }

        System.out.printf("O tempo de duração do jogo foi de %d horas\n", duracao);

		sc.close();
	}

}
