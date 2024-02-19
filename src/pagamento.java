import java.util.Locale;
import java.util.Scanner;

public class pagamento {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String nome;
        double precoHora, pagamento;
        int horasTrabalhadas;


        System.out.print("Nome: ");
        nome = sc.nextLine();
        System.out.print("Valor por hora: R$ ");
        precoHora = sc.nextDouble();
        System.out.print("Horas trabalhadas: ");
        horasTrabalhadas = sc.nextInt();
        sc.close();

        pagamento = horasTrabalhadas * precoHora;

        System.out.printf("O pagamento para %s deve ser R$ %.2f", nome, pagamento);

    }
}
