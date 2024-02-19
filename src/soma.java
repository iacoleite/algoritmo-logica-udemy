
import java.util.Scanner;

public class soma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y, soma;

        System.out.print("Digite o valor de X: ");
        x = sc.nextInt();
        sc.nextLine();
        
        System.out.print("Digite o valor de Y: ");
        y = sc.nextInt();
        sc.nextLine();
        sc.close();
        soma = x + y; 
        

        System.out.printf("Soma = %s", soma);

    }
}
