import java.util.Scanner;
public class Contadagua {
    public static void main(String[] args) {
        int consumo, consumofinal = 0;
        Scanner ler = new Scanner(System.in);
        System.out.printf("Informe o valor do consumo: ");
        consumo = ler.nextInt();
        if (consumo >= 0 && consumo <=10) {
            consumofinal = 7;
        }else
        if (consumo >= 11 && consumo <=30){
         consumo = (consumo-10) * 1;
         consumofinal = consumo + 7;
        }else
        if (consumo >=31 && consumo<=100) {
            consumo = (consumo-30) * 2;
            consumofinal = consumo + 7 + 20;
        }else
        if (consumo >100) {
            consumo = (consumo -100) * 5;
            consumofinal = consumo + 7 + 160;
        }
        System.out.println(consumofinal);
        //System.out.println("deseja continuar? S = sim N = Não");


}
}
