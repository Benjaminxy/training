import java.util.ArrayList;
import java.util.List;

public class SlidingWindowMaximum {

    public static void main(String[] args) {

        ArrayList<Integer> temps =
                new ArrayList<>(List.of(4, 9, 2, 7, 5, 3, 8));

        int k = 3;

        ArrayList<Integer> windowMaxes = new ArrayList<>();

        for(int i = 0; i<=temps.size()-k; i++){

            int max = temps.get(i);

            for (int j = i ; j<i+k; j++)
            {
                if (max<temps.get(j)){
                    max = temps.get(j);
                }

            }
            windowMaxes.add(max);


        }


        System.out.println("Window maxes: " + windowMaxes);
    }
}