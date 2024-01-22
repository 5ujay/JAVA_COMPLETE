public class Methods {
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println("Its me");
        System.out.println("I am dead");

        int num1=10;
        int num2=20;

        int result = minimumnumber (num1,num2);
        System.out.println(result);
    }

    private static int minimumnumber(int num1,int num2) {
        int min;
        if (num1 > num2){
            min=num2;
        }
        else {
            min=num1;
        }
        return min;
    }
}
