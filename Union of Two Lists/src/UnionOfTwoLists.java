/*

Q18 — Union of Two Lists (No Duplicates)

Combine two mailing lists into one, without repeating any email.

**Input:**

```
ArrayList<String> listA = new ArrayList<>(List.of("a@x.com", "b@x.com", "c@x.com"));
ArrayList<String> listB = new ArrayList<>(List.of("b@x.com", "d@x.com"));
```

**Expected Output:**

```
Union: [a@x.com, b@x.com, c@x.com, d@x.com]
```

**Constraint:** Do not use `addAll()` + dedup shortcuts blindly — check for existence with `contains()` before adding each element.

---
 */


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UnionOfTwoLists {


    public static void main(String[] args) {

        ArrayList<String>listA = new ArrayList<>(List.of("a@x.com", "b@x.com", "c@x.com"));
        ArrayList<String> listB = new ArrayList<>(List.of("b@x.com", "d@x.com"));


            unionOfTwoLists(listA ,listB);


    }

    private static void unionOfTwoLists(ArrayList<String> listA, ArrayList<String> listB) {

        Iterator <String> it = listA.iterator();

        ArrayList <String> union = new ArrayList<>();
        for (String li :  listA)
        {
            if (!union.contains(li)) {
                union.add(li);
            }
        }

        for (String li :  listB)
        {
            if (!union.contains(li)) {
                union.add(li);
            }
        }




        System.out.println(union);
    }
}
