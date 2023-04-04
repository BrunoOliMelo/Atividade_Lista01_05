import java.util.Scanner;

public class Lista05 {
    public static void main(String[]args){
        try (Scanner input = new Scanner(System.in)) {
            System.out.printf("metros: ");
            double metros = input.nextDouble(); 

            System.out.printf("centimetros: %.2f", metros * 100);
        }

    }
}
