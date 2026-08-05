/*
Q32 — Conditional Counter

Count how many orders exceed a minimum spend threshold, without building a new list.

**Input:**

```
ArrayList<Double> orders = new ArrayList<>(List.of(25.0, 150.0, 89.5, 300.0, 12.0));
double threshold = 100.0;
```

**Expected Output:**

```
Orders above 100.0: 2
```

**Constraint:** Just a counter variable — no output list needed.
 */

import java.util.ArrayList;
import java.util.List;

public class ConditionalCounter {

    public static void main(String[] args) {
        ArrayList<Double> orders = new ArrayList<>(List.of(25.0, 150.0, 89.5, 300.0, 12.0));
        double threshold = 100.0;
        conditionalCounter(orders ,threshold) ;

    }

    private static void conditionalCounter(ArrayList<Double> orders , double threshold) {
        int counter = 0 ;
        for(double order: orders) {
        if (order>=threshold) {

            counter++;


        }

        }

        System.out.println("Orders above 100.0: " + counter);
    }
}
