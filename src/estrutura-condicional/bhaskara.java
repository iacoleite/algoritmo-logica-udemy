import java.util.Locale;
import java.util.Scanner;
import java.lang.Math;

public class bhaskara {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double coeficienteA, coeficienteB, coeficienteC, x1, x2, delta;

        System.out.println("Fórmula de Bhaskara");
        System.out.print("Coeficiente a: ");
        coeficienteA = sc.nextDouble();
        System.out.print("Coeficiente b: ");
        coeficienteB = sc.nextDouble();
        System.out.print("Coeficiente c: ");
        coeficienteC = sc.nextDouble();

        sc.close();
        delta = Math.pow(coeficienteB,2) - 4 * coeficienteA * coeficienteC;
        
        if (delta < 0){
            System.out.println("Esta equação não possui raízes reais.");
        } else if (delta == 0) {
            System.out.println("Esta equação possui dois resultados iguais.");
            x1 = (-coeficienteB + Math.sqrt(delta)) / (2 * coeficienteA);
            System.out.printf("X = %.4f\n", x1);
        } else {
            x1 = (-coeficienteB + Math.sqrt(delta)) / (2 * coeficienteA);
            x2 = (-coeficienteB - Math.sqrt(delta)) / (2 * coeficienteA);
            System.out.printf("X1 = %.4f\n", x1);
            System.out.printf("X2 = %.4f", x2);
        }
        
    }
}
