import java.util.Scanner;
public class resistencia {
    public static void main(String[] args) {
        double r1, r2, r3;
        Scanner ler = new Scanner(System.in);
        System.out.printf("Informe o primeiro valor: ");
        r1 = ler.nextDouble();
        System.out.printf("Informe o segundo valor: ");
        r2 = ler.nextDouble();
        System.out.printf("Informe o terceiro valor: ");
        r3 = ler.nextDouble();
        System.out.printf("Digite 1 ou 2: ");
        /*int opcao = ler.nextInt();*/
        String opcao = ler.next();
        double resistencia;
        
        switch (opcao) {
            case "1":{
                resistencia = r1 + r2 + r3;
            break;
        }
            case "2":{
                resistencia = (1/r1) + (1/r2) + (1/r3);
                break;

            }
            default:{
                System.out.println("Opção inválida");
                resistencia = 0;
            }
        }
        
        /*if (opcao == 1) {
            resistencia = r1 + r2 + r3;

        }else{
            resistencia = (1/r1) + (1/r2) + (1/r3); 
        }*/
        System.out.println("A resistência total é: " + resistencia);
    
}}
