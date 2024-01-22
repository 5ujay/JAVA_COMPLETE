import java.util.Scanner;

public class LargestOfThreeNums {
    public static void main(String[] args) {
        int numOne;
        int numTwo;
        int numThree;

        Scanner in = new Scanner(System.in);

        System.out.println("Enter Three Numbers : ");

        numOne=in.nextInt();
        numTwo=in.nextInt();
        numThree=in.nextInt();

        if (numOne > numTwo && numOne > numThree) {
            System.out.println(numOne+ " is largest of all number " );
        } if (numTwo > numOne && numTwo > numThree){
            System.out.println(numTwo + "is largest of all number");
        }if (numThree > numOne && numThree > numOne){
            System.out.println(numThree + "is largest of all number");
        }
    }
}
