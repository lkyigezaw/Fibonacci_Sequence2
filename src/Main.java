import java.util.Scanner;

/**
 * Created by Lyigezaw on 1/31/2017.
 */
public class Main {
    public static void main(String args []){
        //initating varaibles, scanner class
        Scanner reader = new Scanner(System.in);
        int sequence;
        int first = 0;
        int second = 1;
        int i = 2;

        //input from the user
        System.out.println("How many numbers to the nth would you like to print for the fibonacci sequence: ");
        sequence = reader.nextInt();

        //fibonacci sequence
        System.out.print(first + ",");
        System.out.print(second + ",");
        while(i < sequence) {
            first = first + second;
            System.out.print(first + ",");
            i++;
            if(i >= sequence){
                break;
            }
            second = second + first;
            System.out.print(second + ",");
            i++;
        }
    }
}
