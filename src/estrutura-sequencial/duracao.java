import java.util.Scanner;
import java.util.Locale;

public class duracao {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int segundosTotais, horas, minutos, resto, segundos;

        System.out.print("Digite a duração em segundos: ");
        segundosTotais = sc.nextInt();
        
        horas = segundosTotais / 3600;
        resto = segundosTotais % 3600;
        minutos = resto / 60;
        segundos = resto % 60;
        
        sc.close();
        System.out.printf("%d:%d:%d", horas, minutos, segundos);
    }
}
