import java.util.Scanner;

public class Fcatorial {
    public static void main(String[] args) {
        int number;
        int factorial =1;

        Scanner in = new Scanner(System.in);

        System.out.println("Enter number for factorial : ");

        number= in.nextInt();

        if (number <0 ){
            System.out.println("Enter number grater than zero ");
        }else {
            for (int l=1;l<=number; l++){
             factorial=factorial*l;
            }
        }
        System.out.println(factorial);
//
//        int i,fact=1;
//        int number=5;//It is the number to calculate factorial
//        for(i=1;i<=number;i++){
//            fact=fact*i;
//        }
//        System.out.println("Factorial of "+number+" is: "+fact);
    }
}
