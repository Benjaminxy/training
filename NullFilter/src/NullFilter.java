/*Q14 — Null Filter

A CSV import produced a list with some missing (`null`) entries. Remove all nulls, keep everything else.

**Input:**

```
ArrayList<String> rows = new ArrayList<>(Arrays.asList("Ali", null, "Anna", null, "Erik"));
```

**Expected Output:**

```
Cleaned: [Ali, Anna, Erik]
```

**Constraint:** Do not modify the list while iterating over it directly with a for-each loop (this throws `ConcurrentModificationException`) — build a new list or use `Iterator.remove()`.

 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class NullFilter {


    public static void main(String[] args) {

        ArrayList<String> rows = new ArrayList<>(Arrays.asList("Ali", null, "Anna", null, "Erik"));

        nullFilter(rows);

    }

    private static void nullFilter(ArrayList<String> rows) {

        Iterator <String> it = rows.iterator();

        while (it.hasNext())
        {

            if (it.next() == null) {
                it.remove();
            }
        }
        System.out.println("Cleaned: " +rows);
    }
}
