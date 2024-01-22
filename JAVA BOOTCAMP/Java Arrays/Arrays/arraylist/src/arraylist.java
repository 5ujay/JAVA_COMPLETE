import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class arraylist {
    public static void main(String[] args) {
        ArrayList<String> stocks = new ArrayList<String>();

        stocks.add("Fanko");
        stocks.add("power");
        stocks.add("softrek");

        System.out.println(stocks.get(0));
        System.out.println(stocks.get(1));
        System.out.println(stocks.get(2));

        stocks.set(0,"franko");



        stocks.add("none");
        System.out.println(stocks.size());

        Collections.sort(stocks);

        for (String stock : stocks ){
            System.out.println(stock);
        }

    }
}
