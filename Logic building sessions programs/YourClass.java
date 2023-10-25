import java.util.Scanner;



public class YourClass {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] brr = new int[2][3]; // Initialize a 2D array

        int len;



        for (int i = 0; i < brr.length; i++) {

            len = sc.nextInt();

            brr[i] = new int[len]; // Initialize the inner arrays based on user input

            for (int j = 0; j < len; j++) {

                brr[i][j] = sc.nextInt();

            }

        }

    }

}