import java.util.Locale;
import java.util.Scanner;

public class notas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double notaDeCorte, nota1, nota2, notaFinal;

        notaDeCorte = 60.0;
        
        System.out.print("Digite a primeira nota: ");
        nota1 = sc.nextDouble();
        
        System.out.print("Digite a segunda nota: ");
        nota2 = sc.nextDouble();

        sc.close();

        notaFinal = (nota1 + nota2);
        
        System.out.printf("Nota final = %s\n", notaFinal);
        if (notaFinal < notaDeCorte) {
            System.out.println("REPROVADO");
        }
    }
}
