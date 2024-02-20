import java.util.Locale;
import java.util.Scanner;

public class coordenadas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        double valorX, valorY;

        System.out.print("Valor de X: ");
        valorX = sc.nextDouble();
        System.out.print("Valor de Y: ");
        valorY = sc.nextDouble();

        if (valorX == 0 && valorY == 0) {
            System.out.println("Origem");
        } else if (valorX == 0 && valorY != 0){
            System.out.println("Eixo Y");
        } else if (valorX != 0 && valorY == 0){
            System.out.println("Eixo X");
        } else if (valorX > 0 && valorY > 0) {
            System.out.println("Q1");
        } else if (valorX > 0 && valorY < 0) {
            System.out.println("Q4");
        } if (valorX < 0 && valorY > 0) {
            System.out.println("Q2");
        } else if (valorX < 0 && valorY < 0) {
            System.out.println("Q3");
        } 
    sc.close();
    }
}

