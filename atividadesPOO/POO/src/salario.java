import java.util.Locale;
import java.util.Scanner;

public class att2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        double salarioFixo, totalVendas, totalReceber;
        String nome;
        Scanner ler = new Scanner(System.in);
        System.out.printf("Nome do vendedor: ");
        nome = ler.next();
        System.out.printf("Salário fixo: ");
        salarioFixo = ler.nextDouble();
        System.out.printf("Valor das vendas: ");
        totalVendas = ler.nextDouble();
        double comissao = totalVendas*0.15;
        totalReceber = salarioFixo + comissao;
        System.out.printf("TOTAL DAS VENDAS DE %s = R$ %.2f%n", nome, totalReceber);


    }
}





/*import java.util.Scanner;

public class att2 {
    public static void main(String[] args) {
        Scanner funcionario = new Scanner(System.in);

        System.out.print("Nome do vendedor: ");
        String nome = funcionario.nextLine();

        System.out.print("Salário fixo: ");
        double salarioFixo = funcionario.nextDouble();

        System.out.print("Valor das vendas: ");
        double totalVendas = funcionario.nextDouble();

        double comissao = totalVendas * 0.15;
        double totalReceber = salarioFixo + comissao;

        System.out.printf("TOTAL DAS VENDAS DE %s = R$ %.2f%n", nome, totalReceber);


        funcionario.close();
    }
}
*/