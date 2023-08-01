import java.util.Scanner;

public class exercicio2 {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        String dia;

        if (num == 1) {
            dia = "Domingo";
        } else if (num == 2) {
            dia = "Segunda";
        } else if (num == 3){
            dia = "Terça";
        } else if (num == 4){
            dia = "Quarta";
        } else if (num == 5){
            dia = "Quinta";
        } else if (num == 6){
            dia = "Sexta";
        } else if (num == 7){
            dia = "Sabado";
        } else {
            dia = "Valor inválido";
        }
        System.out.println("Dia da semana: " + dia);

        sc.close();
    }
}
