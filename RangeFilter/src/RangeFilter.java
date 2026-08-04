/*


Q15 — Range Filter

A sensor log stores readings. Keep only readings within a valid operating range.

**Input:**

```
ArrayList<Integer> readings = new ArrayList<>(List.of(-5, 12, 45, 102, 30, 8, 99));
int min = 0, max = 100;
```

**Expected Output:**

```
In range [0, 100]: [12, 45, 30, 8, 99]
```

**Constraint:** Inclusive bounds — a reading exactly equal to `min` or `max` is valid.

---
```
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RangeFilter {


    public static void main(String[] args) {

        ArrayList<Integer> readings = new ArrayList<>(List.of(-5, 12, 45, 102, 30, 8, 99));
        int min = 0, max = 100;
        rangeFilter(readings , min , max) ;

    }

    private static void rangeFilter(ArrayList<Integer> readings, int min, int max) {


        Iterator <Integer> it = readings.iterator();

        while (it.hasNext()) {

            int val = it.next();

          if (  val> max  || val < min     )
          {
              it.remove();

          }
        }
        System.out.println(readings);
    }
}
