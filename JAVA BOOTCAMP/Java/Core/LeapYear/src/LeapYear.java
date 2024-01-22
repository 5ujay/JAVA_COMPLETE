import java.time.Year;
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int year;

        System.out.println("Enter Year to check leap year or not : ");
        year = in.nextInt();

        if ((year % 400  == 0)||(year % 4 ==0 && year%100 != 0)){
            System.out.println(year + " this is leap year");
        }else {
            System.out.println(year + " it is not a leap year");
        }
    }
}
