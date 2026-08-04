/*

Q12 — Even/Odd Partitioner

Split a list of ticket numbers into two separate lists: even and odd.

**Input:**

```
ArrayList<Integer> tickets = new ArrayList<>(List.of(4, 7, 10, 13, 18, 21, 26));
```

**Expected Output:**

```
Even: [4, 10, 18, 26]
Odd:  [7, 13, 21]
```

**Constraint:** Single pass through the list. Two output `ArrayList<Integer>` objects.
 */


import java.util.ArrayList;
import java.util.List;

public class EvenOddArrayList {


    public static void main(String[] args) {

        ArrayList<Integer> tickets = new ArrayList<>(List.of(4, 7, 10, 13, 18, 21, 26));

        evenOddArrayList(tickets);

    }

    private static void evenOddArrayList(ArrayList<Integer> tickets) {


        ArrayList<Integer> evenList = new ArrayList<>();
        ArrayList<Integer> oddList = new ArrayList<>();


        for (int i = 0 ; i<tickets.size();i++)
        {

            if (tickets.get(i) %2 == 0) {
                evenList.add(tickets.get(i));


            }else {

                oddList.add(tickets.get(i));
            }
        }

        System.out.println("Even: " + evenList);
        System.out.println("Odd: " + oddList);



    }

}
