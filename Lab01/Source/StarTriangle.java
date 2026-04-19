package Lab01.Source;
import java.util.Scanner;

public class StarTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please input the height of the triangle: ");
        int height = scanner.nextInt();

        for(int i = 1; i <= height; i++){
            for(int j = i; j < height; j++){
                System.out.print(" ");
            }
            for(int k = 1; k <= 2 * i - 1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
        scanner.close();
    }
}