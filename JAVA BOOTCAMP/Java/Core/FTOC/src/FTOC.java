import java.util.Scanner;

public class FTOC {
    public static void main(String[] args) {

        int temp;

        Scanner in =new Scanner(System.in);

        System.out.println("Enter temp in celcuis :");
        temp=in.nextInt();

        temp=((temp* 9/5)+32);

        System.out.println("Temp in celcuis is : " + temp);


    }
}
