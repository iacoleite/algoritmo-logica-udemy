import java.util.Scanner;
import java.util.Locale;

public class duracao {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int segundos;

        System.out.print("Digite a duração em segundos: ");
        segundos = sc.nextInt();
        sc.nextLine();
        System.out.println(segundos);

    }
}
