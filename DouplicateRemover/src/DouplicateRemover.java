/*
Q13 — Duplicate Remover (Order-Preserving)

A form submits a list of selected tag IDs that may contain duplicates. Remove duplicates while keeping the first occurrence order.

**Input:**

```
ArrayList<Integer> tagIds = new ArrayList<>(List.of(3, 1, 3, 5, 1, 7, 5, 9));
```

**Expected Output:**

```
Before: [3, 1, 3, 5, 1, 7, 5, 9]
After:  [3, 1, 5, 7, 9]
```

**Constraint:** Do not use `HashSet` (not learned yet). Use a nested loop or `contains()` check against a result `ArrayList`.
 */

import java.util.ArrayList;
import java.util.List;

public class DouplicateRemover {

    public static void main(String[] args) {
        ArrayList<Integer> tagIds = new ArrayList<>(List.of(3, 1, 3, 5, 1, 7, 5, 9));
        douplicateRemover (tagIds);

    }

    private static void douplicateRemover(ArrayList<Integer> tagIds) {

        ArrayList<Integer> newTag = new ArrayList<>();
        for (int tagId : tagIds) {

            if (!newTag.contains(tagId)) {
                newTag.add(tagId);
            }



        }
        System.out.println(newTag);
    }
}
