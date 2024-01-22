public class ExerciseArray {
    public static void main(String[] args) {
        int Array[]={10,20,30,40,50};

//      printing all elements in array
        for (int i=0; i<Array.length; i++){
            System.out.println(Array[i]);
        }

//      printing the largest element in array
        int largest = Array[0];

        for (int i=1; i< Array.length; i++){
            if (Array[i]>largest){
                largest=Array[i];
            }
        }
        System.out.println(largest);

//      Adding all elements in array
        int sum = 0 ;

        for (int i=0; i<Array.length; i++){
            sum =sum+Array[i];
        }
        System.out.println(sum);

    }
}
