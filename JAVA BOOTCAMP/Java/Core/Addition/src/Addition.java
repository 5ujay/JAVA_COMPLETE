import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {

        int firstnum ;
        int secondnum ;
        int result;

        Scanner in = new Scanner( System.in );

        System.out.println("Enter number 1 ");
        firstnum = in.nextInt();

        System.out.println("Enter number 2");
        secondnum = in.nextInt();;

        System.out.println("Your added value is :");
        result = firstnum + secondnum;

        System.out.println(result);

    }
}
