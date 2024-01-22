import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int temp ;

        System.out.println("Enter a temp:");
        temp= in.nextInt();



        if (temp < 35){
            System.out.println("It is cool");
        }else {
            System.out.println("It is Hot");
        }


    }
}
