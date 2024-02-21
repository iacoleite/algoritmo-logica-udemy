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

        duracao = 0;

        if (horaFinal > horaInicio) {
            duracao = horaFinal - horaInicio;
            
        } else {
            duracao = (24 - horaInicio) + horaFinal;
            
        }
        System.out.printf("O jogo durou %d horas.", duracao);
        sc.close();
    }
}