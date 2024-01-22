import java.util.ArrayList;
import java.util.LinkedList;

public class linkedlist {
    public static void main(String[] args) {

        ArrayList<Integer> Val =new ArrayList<>();

        Val.add(10);
        Val.add(20);
        Val.add(30);
        Val.add(40);

        for (int i=0;i<Val.size();i++){
            System.out.println(i+"---------"+Val.get(i));
        }

        System.out.println("===================================================================================");

        Val.add(0,22);

        for (int i=0;i<Val.size();i++){
            System.out.println(i+"---------"+Val.get(i));
        }


        System.out.println("======================================================================");

//        --------------------------------------------------------------------------------------------------------------------

        LinkedList<String> Lang = new LinkedList<String>();

        Lang.add("JON");
        Lang.add("HAI");
        Lang.add("Don");


        for (String lang: Lang){
            System.out.println(lang);
        }







    }
}
