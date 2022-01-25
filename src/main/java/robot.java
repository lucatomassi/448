import java.util.Arrays;
import java.util.Scanner;

public class robot implements robot_interface{




    //define N-N Array
    //define Robot object
    public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            System.out.print("Enter a size for the board:");
            int n = input.nextInt();
            int[][] a = new int[n][n];

            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a.length; j++) {
                    a[i][j] = (i + 1) * (j + 1);
                }
            }

            for (int[] is : a) {
                System.out.println(Arrays.toString(is));
            }
        }




}
