/*

Q22 — Uppercase Transformer

Normalize a list of country codes to uppercase before storing.

**Input:**

```
ArrayList<String> codes = new ArrayList<>(List.of("se", "no", "Dk", "FI"));
```

**Expected Output:**

```
Normalized: [SE, NO, DK, FI]
```

**Constraint:** Modify the list in place using `set(index, value)` — do not build a second list.
 */


import java.util.ArrayList;
import java.util.List;

public class UpperCaseArrayList {


    public static void main(String[] args) {
        ArrayList<String> codes = new ArrayList<>(List.of("se", "no", "Dk", "FI"));


        for (int i = 0; i < codes.size(); i++) {
            codes.set(i, codes.get(i).toUpperCase());
        }



        System.out.println("Normalized:  " + codes);

    }
}
