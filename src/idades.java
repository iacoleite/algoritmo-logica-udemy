import java.util.Locale;
import java.util.Scanner;

public class idades {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String nome1, nome2;
        int idade1, idade2;
        double mediaIdade, idaded1, idaded2;

        System.out.println("Dados da primeira pessoa");
        System.out.print("Nome: ");
        nome1 = sc.nextLine();
        System.out.print("Idade: ");
        idade1 = sc.nextInt();
        sc.nextLine();
        System.out.println("Dados da segunda pessoa");
        System.out.print("Nome: ");
        nome2 = sc.nextLine();
        System.out.print("Idade: ");
        idade2 = sc.nextInt();
        sc.nextLine();
        sc.close();
        
        // int to double 
        idaded1 = Double.valueOf(idade1);
        idaded2 = Double.valueOf(idade2);

        mediaIdade = (idaded1 + idaded2) / 2;

        System.out.printf("A idade média de %s e %s é de %s.", nome1, nome2, mediaIdade);
    }
}
