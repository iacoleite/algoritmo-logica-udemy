import java.util.Locale;
import java.util.Scanner;

public class aprovados {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int numeroAlunos;
        double media, notas1[], notas2[]; 
        String alunos[];
        
        System.out.print("Quantos alunos serão digitados? ");
        numeroAlunos = sc.nextInt();
        notas1 = new double[numeroAlunos];
        notas2 = new double[numeroAlunos];
        alunos = new String[numeroAlunos];

        for (int i = 0; i < numeroAlunos; i++) {
            System.out.printf("Digite nome, primeira e segunda nota do %do aluno:\n", (i + 1)); 
            sc.nextLine();
            alunos[i] = sc.nextLine();
            notas1[i] = sc.nextDouble();    
            notas2[i] = sc.nextDouble();    
        }

        System.out.println("Alunos aprovados:");
        for (int i = 0; i < numeroAlunos; i++) {
            media = (notas1[i] + notas2[i]) / 2;
            if (media >= 6.0) {
                System.out.println(alunos[i]);
            }
        }
        sc.close();
    }
}
