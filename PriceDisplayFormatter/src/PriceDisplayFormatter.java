/*


Q84 — Price Display Formatter

A product catalog must always display prices with exactly **2 decimal places**.

**Input:**

```
double[] prices = {9.9, 100.0, 4.567, 0.1, 1299.99, 50.0};
```

**Expected Output:**

```
9.9    → 9.90
100.0  → 100.00
4.567  → 4.57  (rounded)
0.1    → 0.10
1299.99 → 1299.99
50.0   → 50.00
```

**Constraint:** Use `String.format("%.2f", value)` to format. Then separately verify your understanding: what does `%.2f` mean and what does the `f` stand for?

 */

public class PriceDisplayFormatter {

    public static void main(String[] args) {

        double[] prices = {9.9, 100.0, 4.567, 0.1, 1299.99, 50.0};


        for (int i = 0; i<prices.length; i++){
            double value=prices[i];
            System.out.println(String.format(prices[i] +" %.2f", value));
        }
    }
}
