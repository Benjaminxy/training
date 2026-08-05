import java.util.ArrayList;
import java.util.List;

public class SlidingWindowSum {

    public static void main(String[] args) {

        ArrayList<Integer> revenue = new ArrayList<>(List.of(10, 20, 30, 40, 50));

        int k = 3;

        ArrayList<Integer> windowSums = new ArrayList<>();

        int winSum = 0;

        for (int i =0 ; i<k ; i++ ) {

            winSum+=  revenue.get(i);


            //System.out.println(winSum);
        }
        windowSums.add(winSum);


        for (int i = k; i<revenue.size(); i++)
        {
            int outgoing = revenue.get(i-k);
            int incoming =revenue.get(i);

            winSum = winSum -outgoing+incoming;
            windowSums.add(winSum);

        }
        System.out.println("Window sums: " + windowSums);

    }
}
