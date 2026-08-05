/*
Q31 — Pass/Fail Grouper

Split exam scores into two `ArrayList<Integer>` groups: pass (≥50) and fail (<50).

**Input:**

```
ArrayList<Integer> scores = new ArrayList<>(List.of(45, 78, 50, 33, 92, 49, 61));
```

**Expected Output:**

```
Pass: [78, 50, 92, 61]
Fail: [45, 33, 49]
```

**Constraint:** No `HashMap` (not learned yet) — two separate `ArrayList` outputs.
 */


import java.util.ArrayList;
import java.util.List;

public class PassFailGrouper {



    public static void main(String[] args) {

        ArrayList<Integer> scores = new ArrayList<>(List.of(45, 78, 50, 33, 92, 49, 61));

        passFailGrouper(scores);
    }

    private static void passFailGrouper(ArrayList<Integer> scores) {

        ArrayList<Integer> pass = new ArrayList();
        ArrayList<Integer> fail = new ArrayList();
        for (int score: scores)
        {

            if(score >=50) {

                pass.add(score);


            }else {

                fail.add(score);
            }
        }
        System.out.println("Pass:" + pass);
        System.out.println("Fail: " + fail);
    }
}
