import java.util.Scanner;

public class crescente {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x, y;
        
        
        System.out.println("Digite dois números");
        System.out.print("Número 1: ");
        x = sc.nextInt();
        System.out.print("Número 2: ");
        y = sc.nextInt();

        while (x != y) {
            if (x < y) {
                System.out.println("Crescente!");
            } else if (x > y)  {
                System.out.println("Decrescente!");
            } else {
            }
            System.out.println("Digite outros dois números");
            System.out.print("Número 1: ");
            x = sc.nextInt();
            System.out.print("Número 2: ");
            y = sc.nextInt();
        }

        sc.close();
    }
}
