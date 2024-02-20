import java.util.Locale;
import java.util.Scanner;

public class tempoDeJogo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int horaInicio, horaFinal, duracao;
        System.out.print("Hora inicial: ");
        horaInicio = sc.nextInt();
        System.out.print("Hora final: ");
        horaFinal = sc.nextInt();

        if (horaFinal > horaInicio) {
            duracao = horaFinal - horaInicio;
            System.out.printf("O jogo durou %d horas.", duracao);
        } else if (horaFinal <= horaInicio) {
            duracao = (24 - horaInicio) + horaFinal;
            System.out.printf("O jogo durou %d horas.", duracao);
        }
        sc.close();
    }
}