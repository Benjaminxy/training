
/*


Q66 — Formatted List Printer

A report generator must display a list of items formatted as `[item1, item2, item3]`.

**Input:**

```
String[] items = {"Apple", "Banana", "Cherry", "Date"};
```

**Expected Output:**

```
[Apple, Banana, Cherry, Date]
```

**Bonus — also produce:**

```
Items: Apple | Banana | Cherry | Date :End
```

**Constraint:** Use `String.join()` for the first output. Use `StringBuilder` with manual prefix and suffix for the bonus output.

---

 */

import java.sql.SQLOutput;

public class FormattedListPrinter {

    public static void main(String[] args) {


        String[] items = {"Apple", "Banana", "Cherry", "Date"};

        String item = String.join(", ",items);

        StringBuilder sb = new StringBuilder();
        sb.append(item);
        sb.insert(0 , "[" );
        sb.append("]");
        System.out.print(sb);

        System.out.println("");



        String item2 = String.join(" | ",items);

        StringBuilder sb2 = new StringBuilder();
        sb2.append(item2);
        sb2.insert(0 , "Items: " );
        sb2.append(" :End");
        System.out.print(sb2);






    }

}
