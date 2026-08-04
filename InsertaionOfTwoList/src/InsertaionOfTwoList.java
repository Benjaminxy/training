/*

Q17 — Intersection of Two Lists

Two departments each submit a list of employee IDs attending a training. Find employees in **both** lists.

**Input:**

```
ArrayList<Integer> listA = new ArrayList<>(List.of(101, 102, 103, 104));
ArrayList<Integer> listB = new ArrayList<>(List.of(103, 104, 105, 106));
```

**Expected Output:**

```
Intersection: [103, 104]
```

**Constraint:** Do not use `retainAll()`. Implement it manually with nested loops or `contains()`.
 */


import java.util.ArrayList;
import java.util.List;

public class InsertaionOfTwoList {

    public static void main(String[] args) {


        ArrayList<Integer> listA = new ArrayList<>(List.of(101, 102, 103, 104,103));
        ArrayList<Integer> listB = new ArrayList<>(List.of(103, 104, 105, 106,104));

       insertaionOfTwoList (listA , listB);

    }

    private static void insertaionOfTwoList(ArrayList<Integer> listA, ArrayList<Integer> listB) {
        ArrayList<Integer> newvalue = new ArrayList<>();

        for(int list :listA)
        {
            if (listB.contains(list) && !newvalue.contains(list))
            {
                newvalue.add(list);
            }
        }


        System.out.println( "Intersection: " + newvalue);
    }


}
