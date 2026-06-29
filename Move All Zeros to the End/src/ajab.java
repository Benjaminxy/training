/*Q10 — Move All Zeros to the End

A sensor array records readings every minute. A value of `0` means "no signal received".
Move all zeros to the **end** of the array while keeping the **original order** of non-zero readings.

        **Input:**

        ```
int[] readings = {4, 0, 7, 0, 0, 3, 9, 0, 5};
```

        **Expected Output:**

        ```
Before: [4, 0, 7, 0, 0, 3, 9, 0, 5]
After:  [4, 7, 3, 9, 5, 0, 0, 0, 0]
        ```

        **Constraint:** Do not create a second array. Modify in-place. Order of non-zero elements must be preserved.


 */
public class ajab {


    public static void main(String[] args) {

        int[] readings = {4, 0, 7, 0, 0, 3, 9, 0, 5};


        move(readings);

        for (int i = 0 ; i <readings.length ; i++){

            System.out.println(readings[i]);
        }


    }


    public static void move(int[] readings) {

        int pos = 0;

        for (int i = 0; i < readings.length; i++) {
            if (readings[i] != 0) {
                readings[pos] = readings[i];
                pos++;
            }
        }

        while (pos < readings.length) {
            readings[pos] = 0;
            pos++;
        }
    }

}