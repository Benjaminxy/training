/*

Q11 — Active User Filter

A municipality user registry stores ages. Filter out only the adults (18+) into a new `ArrayList<Integer>`.

**Input:**

```
ArrayList<Integer> ages = new ArrayList<>(List.of(15, 22, 17, 40, 8, 19, 65));
```

**Expected Output:**

```
Adults (18+): [22, 40, 19, 65]
```

**Constraint:** Do not use streams (`.filter()`). Build the result with a loop and `add()`.

---
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ActiveUserFilter {

    public static void main(String[] args) {
        ArrayList<Integer> ages = new ArrayList<>(List.of(15, 22, 17, 40, 8, 19, 65));


        activeUserFilter(ages);

        System.out.println(ages);
    }

    private static void activeUserFilter(ArrayList<Integer> ages) {

        Iterator <Integer> it = ages.iterator();

        while(it.hasNext())
        {
            if (it.next()<18)
            {
                it.remove();
            }
        }

    }
}
