
/*
Q9 — Find the Second-Largest Value

In a coding competition, you need to display the **runner-up score** on the leaderboard.
Find the second-highest score. Assume all scores are unique.

**Input:**

        ```
int[] scores = {88, 95, 72, 91, 85, 60, 99, 78};
```

        **Expected Output:**

        ```
Winner score:    99
Runner-up score: 95
        ```

        **Constraint:** Do not sort the array. Solve it in a single pass using two variable

 */

public class SecondLargestValue {

    public static void main(String[] args) {

        int[] scores = {5, 4, 3, 2};

        int largest = 0;
        int secondLargest = 0;

        for (int i = 0; i < scores.length; i++) {

            if (scores[i] > largest) {

                secondLargest = largest;
                largest = scores[i];

            }else if (scores[i] > secondLargest && scores[i] < largest) {

                secondLargest = scores[i];
            }
        }

        System.out.println("Winner score:    " + largest);
        System.out.println("Runner-up score: " + secondLargest);
    }
}

