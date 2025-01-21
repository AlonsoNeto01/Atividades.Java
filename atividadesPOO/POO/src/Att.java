import java.util.Scanner;
public class Att {
public static void main(String args[]) {
		
		int X;
		int A;
		int B;
		Scanner ler = new Scanner(System.in);
		System.out.print("X = ");
		X = ler.nextInt();
		System.out.print("A = ");
		A = ler.nextInt();
		System.out.print("B = ");
		B = ler.nextInt();
		
		int funcao = (A * X) + B;
		
		System.out.printf("f(%d) = %d * (%d) + %d%n", X, A, X, B);
		System.out.printf("f(%d) = %d" , X, funcao);

}
}

