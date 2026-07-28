/*
Q52 — Form Input Cleaner

Users submit a contact form at the municipality website.
The input often has extra spaces at the start, end, and between words.
Clean it up before saving.

**Input:**

```
String raw = "   Erik    von    Otter   ";
```

**Expected Output:**

```
Before: "   Erik    von    Otter   "
After:  "Erik von Otter"
```

**Constraint:** First use `trim()` for outer spaces. Then use a loop or `replace()` to collapse inner multiple spaces into one. Do not use regex.
 */


    public class InputClear {
        public static void main(String[] args) {

            String raw = "   Erik    von    Otter   ";

            raw= raw.trim();
            System.out.println(raw);

            while(raw.contains("  ")) {
                raw = raw.replace("  ", " ");

            }


            System.out.printf(raw);

        }



}
