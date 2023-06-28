import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		double x = 10.35848;

		double altura = 1.89;
		
		
		
		int idade = 27;
		
		char sexo = 'M';
		
		double salarioMensal = 1.500;
		
		String name = "rafael";
		
		System.out.println("O " + name + " tem " + idade + " com " + altura + " de altura, sendo do sexo " + sexo);
		
		System.out.printf("%.2f%n", x);
		
		System.out.printf("Eu %s tenho %d e ganho por mês %.3f", name, idade, salarioMensal);
		
	}

}
