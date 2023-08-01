import java.util.Locale;
import java.util.Scanner;

public class exercicio1 {

    public static void main(String args[]){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int minutos = sc.nextInt();

        double valor = 50.0;

        if (minutos > 100) {
            valor = valor + (minutos - 100) * 2.0;
        }

        System.out.printf("Valor da conta = R$ %.2f%n", valor);

        sc.close();
    }
}
