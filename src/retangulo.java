import java.util.Locale;
import java.util.Scanner;
import java.lang.Math;

public class retangulo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double base, altura, area, perimetro, diagonal;

        System.out.print("Base do retângulo: ");
        base = sc.nextDouble();
        System.out.print("Altura do retângulo: ");
        altura = sc.nextDouble();
        sc.close();
        
        area = base * altura;
        perimetro = (base * 2) + (altura * 2);
        diagonal = Math.sqrt((Math.pow(base,2)) + (Math.pow(altura,2)));

        System.out.printf("Área do retângulo: %.4f", area);
        System.out.println();
        System.out.printf("Perímetro do retângulo: %.4f", perimetro);
        System.out.println();
        System.out.printf("Diagonal do retângulo: %.4f", diagonal);

    }
}
