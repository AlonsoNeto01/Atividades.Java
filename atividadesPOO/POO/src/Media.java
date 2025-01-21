package calculos;
import java.util.Scanner;
public class Media {
	public static void main(String args[]) {
	double N1;
	double N2;
	
	Scanner ler = new Scanner(System.in);
	
	System.out.println("Algoritmo para calcular a média entre dois números");
	System.out.println("Digite o primeiro número: ");
	N1 = ler.nextDouble();
	System.out.println("Digite o segundo número: ");
	N2 = ler.nextDouble();
	double M = (N1 + N2) / 2;
	System.out.printf("O valor da média é: %.2f. ", M);
	}
}
