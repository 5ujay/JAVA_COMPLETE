public class ArrayType {
    public static void main(String[] args) {
        int score =40;

        int AnotherScore[]={1,2,3,4,5,6};

        AnotherScore[0] =12;

        System.out.println(AnotherScore[0]);

        for (int i=0; i<AnotherScore.length; i++){
            AnotherScore[i]=i*10;
        }
        System.out.println(AnotherScore[0]);
        System.out.println(AnotherScore[1]);
        System.out.println(AnotherScore[2]);
    }
}
