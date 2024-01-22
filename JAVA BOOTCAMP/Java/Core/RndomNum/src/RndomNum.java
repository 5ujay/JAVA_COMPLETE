public class RndomNum {
    public static void main(String[] args) {

//        for (int i=1 ; i<=5; i++){
//            System.out.println((int)(Math.random()*100));
//        }


        int min=1;
        int max=100;

        System.out.println("Random int value:");

        int a= (int)(Math.random()*(max-min+1)+min);
        System.out.println(a);

        System.out.println("Random double value:");

        double b=(double) (Math.random()*(max-min+1)+min);
        System.out.println(b);
    }
}
