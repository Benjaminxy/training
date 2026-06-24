

public class ArrayisSorted {

    /*Q7 — Check if Array is Sorted

Before running a binary search, you must verify the invoice list is already sorted ascending.
Write a method that returns `true` if sorted, `false` otherwise.

**Input A:**

```
int[] invoices = {1001, 1045, 1089, 1102, 1250};
```

**Output A:** `Sorted: true`

**Input B:**

```
int[] invoices = {1001, 1250, 1045, 1102, 1089};
```

**Output B:** `Sorted: false`

**Constraint:** Stop as soon as you find the first out-of-order pair. Do not scan the full array unnecessarily.

     */

    public static void main(String[] args) {

        int[] invoices = {1001, 1045, 1089, 1102, 1250};


        boolean sort = test (invoices);

        System.out.println("A:** `Sorted: " + sort);
        int[] invoices2= {1001, 1250, 1045, 1102, 1089};
         boolean sort2 = test (invoices2);

        System.out.println("B:** `Sorted: " + sort2);


    }

    private static boolean test(int[] invoices) {

        for(int i = 0 ; i <invoices.length -1; i++) {

            if (invoices[i]> invoices[i+1]) {
                return false;
            }

        }


        return true;
    }
}
