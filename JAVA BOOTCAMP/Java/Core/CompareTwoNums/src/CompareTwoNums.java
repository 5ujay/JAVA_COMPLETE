public class CompareTwoNums {
    public static void main(String[] args) {
        int numOne= 100;
        int numTwo =100;

        if (numOne == numTwo) {
            System.out.println(numOne + " is equal to " + numTwo);
        } else if (numOne > numTwo){
            System.out.println(numOne+ " is greater than " + numTwo);
        }else {
            System.out.println(numOne + " is less than " + numTwo);
        }
    }
}
