import java.util.Locale;
import java.util.Scanner;

public class dados_pessoas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int pessoas, homens, mulheres;
        double alturas[], maiorAltura, menorAltura, somaMulheres, mediaMulheres;
        char genero[];

        System.out.print("Quantas pessoas serão digitadas? ");
        pessoas = sc.nextInt();
        

        alturas = new double[pessoas];
        genero = new char[pessoas];
       
        mediaMulheres = 0;
        homens = 0;
        somaMulheres = 0;
        mulheres = 0;

        for (int i = 0; i < pessoas; i++) {
            System.out.printf("Altura da %da pessoa: ", i + 1);
            alturas[i] = sc.nextDouble();
            sc.nextLine();
            System.out.printf("Genero da %da pessoa: ", i + 1);
            genero[i] = sc.nextLine().charAt(0);
        }
        
        maiorAltura = alturas[0];
        menorAltura = alturas[0];
        for (int i = 0; i < pessoas ; i++) {
            if (alturas[i] > maiorAltura){
                maiorAltura = alturas[i];
            }
            if (alturas[i] < menorAltura){
                menorAltura = alturas[i];
            }
        }
        System.out.printf("Menor altura = %.2f\n", menorAltura);
        System.out.printf("Maior altura = %.2f\n", maiorAltura);

        for (int i = 0; i < pessoas ; i++) {
            if (genero[i] == 'F') {
                somaMulheres += alturas[i];
                mulheres++;
            } else {
                homens++;
            }
        }
        mediaMulheres = somaMulheres / mulheres;
        System.out.printf("Média das alturas das mulheres = %.2f\n", mediaMulheres);
        System.out.printf("Número de homens = %d\n", homens);


    sc.close();
    }


}
