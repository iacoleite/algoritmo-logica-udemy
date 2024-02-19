import java.util.Locale;
import java.util.Scanner;
import java.lang.Math;
import java.text.DecimalFormat;

public class circulo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.#####");
        
        double raio, area, pi;
        String piJava;
        piJava = df.format(Math.PI);
        pi = Double.parseDouble(piJava); 

        System.out.print("Digite o valor do raio do círculo: ");
        raio = sc.nextDouble();
        area = Math.pow(raio, 2) * pi;
        sc.close();

        System.out.printf("Área = %.3f", area);

    }
}
