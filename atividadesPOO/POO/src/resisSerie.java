package calculos;
import java.util.Scanner;
public class ResistenciaSerie {
	public static void main(String args[]) {
	
			double r1,r2,r3,r4;
			
			Scanner ler = new Scanner(System.in);
			
			r1 = ler.nextDouble();
			r2 = ler.nextDouble();
			r3 = ler.nextDouble();
			r4 = ler.nextDouble();
				
			
			double resistencia_Total = r1 + r2 + r3 + r4;
			System.out.printf("A resistencia total é = %.2f.", resistencia_Total);
}

}