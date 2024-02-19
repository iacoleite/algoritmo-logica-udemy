import java.util.Locale;
import java.util.Scanner;

public class glicose {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double glicose;

        System.out.print("Digite o valor medido de glicosa: ");
        glicose = sc.nextDouble();

        sc.close();
        if (glicose <= 100) {
            System.out.println("Classificação: normal");
        } else if (glicose <= 140) {
            System.out.println("Classificação: elevado");
        } else {
            System.out.println("Classificação: diabetes");
        }
    }
}
