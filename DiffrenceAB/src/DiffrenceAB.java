/*

Q19 — Difference (A − B)

Find employee IDs that are in department A's roster but NOT in department B's roster.

**Input:**

```
ArrayList<Integer> deptA = new ArrayList<>(List.of(101, 102, 103, 104));
ArrayList<Integer> deptB = new ArrayList<>(List.of(103, 104, 105));
```

**Expected Output:**

```
A - B: [101, 102]
```

**Constraint:** Do not use `removeAll()`. Implement manually.
 */

import java.util.ArrayList;
import java.util.List;

public class DiffrenceAB {


    public static void main(String[] args) {

        ArrayList<Integer> deptA = new ArrayList<>(List.of(101, 102, 103, 104));
        ArrayList<Integer> deptB = new ArrayList<>(List.of(103, 104, 105));
        ArrayList <Integer> diffrence = new ArrayList<>( );
        diffrenceAB (deptA , deptB ,diffrence);
        System.out.println("A - B: " +diffrence);
        diffrenceAB (deptB , deptA, diffrence );
        System.out.println("Symmetric difference:" + diffrence);

    }

    private static void diffrenceAB(ArrayList<Integer> deptA, ArrayList<Integer> deptB , ArrayList<Integer> diffrence) {



        for (int i = 0; i<deptA.size(); i++) {
            int diffA = deptA.get(i);
            boolean exist = false;
            for (int j = 0; j < deptB.size(); j++) {
                int diffB = deptB.get(j);


                if (diffA == diffB) {
                    exist= true;
                   // System.out.println(diffA);
                break;

                }


            }
            if (!exist)
            {
                diffrence.add(diffA);
            }


        }

    }}



