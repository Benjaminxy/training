import java.util.Arrays;

/*Q8 — Merge Two Sorted Arrays

Two departments each maintain a **sorted** list of employee IDs.
Merge both lists into one single **sorted** list.

**Input:**

        ```
int[] deptA = {101, 105, 110, 115};
int[] deptB = {103, 108, 112, 120};
```

        **Expected Output:**

        ```
Merged: [101, 103, 105, 108, 110, 112, 115, 120]
        ```

        **Constraint:** Do not merge first and sort after. Use the two-pointer merge technique — take advantage of the fact that both arrays are already sorted.

*/
public class MergeTwoSortedArrays {


    public static void main(String[] args) {

        int[] deptA = {101, 105, 110, 115};
        int[] deptB = {103, 108, 112, 120};

        int[] merged = mergeArrays(deptA, deptB);

        System.out.println("Merged: " + Arrays.toString(merged));
    }

    public static int[] mergeArrays(int[] deptA, int[] deptB) {

        int[] merged = new int[deptA.length + deptB.length];

        int i = 0; // Pointer for deptA
        int j = 0; // Pointer for deptB
        int k = 0; // Pointer for merged

        // Compare elements from both arrays
        while (i < deptA.length && j < deptB.length) {

            if (deptA[i] < deptB[j]) {
                merged[k] = deptA[i];
                i++;
            } else {
                merged[k] = deptB[j];
                j++;
            }

            k++;
        }

        // Copy remaining elements from deptA
        while (i < deptA.length) {
            merged[k] = deptA[i];
            i++;
            k++;
        }

        // Copy remaining elements from deptB
        while (j < deptB.length) {
            merged[k] = deptB[j];
            j++;
            k++;
        }

        return merged;
    }
}