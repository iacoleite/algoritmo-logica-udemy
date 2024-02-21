import java.util.Locale;
import java.util.Scanner;

public class aumento {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double salario, aumento, novoSalario;
        int porcentagem;

        System.out.print("Digite o salário da pessoa: ");
        salario = sc.nextDouble();

        if (salario <= 1000) {
            porcentagem = 20;
            aumento = salario * porcentagem / 100;
            novoSalario = salario + aumento;
            
        } else if (salario <= 3000) {
            porcentagem = 15;
            aumento = salario * porcentagem / 100;
            novoSalario = salario + aumento;
            
        } else if (salario <= 8000) {
            porcentagem = 10;
            aumento = salario * porcentagem / 100;
            novoSalario = salario + aumento;
            
        } else {
            porcentagem = 5;
            aumento = salario * porcentagem / 100;
            novoSalario = salario + aumento;
              
        }
        System.out.printf("Novo salário = R$ %.2f\n", novoSalario);
        System.out.printf("Aumento = R$ %.2f\n", aumento);
        System.out.println("Porcentagem = " + (porcentagem) + " %"); 
        sc.close();
    }
}
