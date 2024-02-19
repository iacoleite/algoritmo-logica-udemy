import java.util.Scanner;
import java.util.Locale;

public class medidas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        double a, b, c;

        System.out.print("Digite a medida de A: ");
        a = sc.nextDouble();
        sc.nextLine();
        System.out.print("Digite a medida de B: ");
        b = sc.nextDouble();
        sc.nextLine();
        System.out.print("Digite a medida de C: ");
        c = sc.nextDouble();
        sc.nextLine();

        sc.close();

        double areaQuadrado = a * a;
        double areaTriangulo = (a * b) / 2;
        double areaTrapezio = ((a + b) / 2) * c;
         
        System.out.printf("AREA DO QUADRADO = %.4f\n", areaQuadrado);
        System.out.println("AREA DO TRIANGULO = " + String.format("%.4f", areaTriangulo));
        System.out.println("AREA DO TRAPEZIO = " + String.format("%.4f", areaTrapezio));
    }
}
