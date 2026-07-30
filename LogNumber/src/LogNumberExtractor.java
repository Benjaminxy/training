/*


Q68 — Log Number Extractor

A monitoring system reads error log lines and extracts all numeric values for analysis.

**Input:**

```
String log1 = "Error 404 occurred at line 87 after 3 retries";
String log2 = "Memory usage at 92% with 1024MB allocated and 512MB free";
```

**Expected Output:**

```
log1 → [404, 87, 3]
log2 → [92, 1024, 512]
```

**Constraint:** Loop through each character using `charAt()`. Use `Character.isDigit()` to detect number start/end. Build each number character by character using `StringBuilder`.

---
 */



public class LogNumberExtractor {

    public static void main(String[] args) {
        String log1 = "Error 404 occurred at line 87 after 3 retries";
        String log2 = "Memory usage at 92% with 1024MB allocated and 512MB free";

        logNumberExtractor(log1);
        logNumberExtractor(log2);
    }

    private static void logNumberExtractor(String log) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < log.length(); i++) {
            char ch = log.charAt(i);

            // If it's a digit, keep it
            if (Character.isDigit(ch)) {
                sb.append(ch);
            }
            else {
                sb.append(" ");
            }
        }

        String numbersOnly = sb.toString().trim().replaceAll("\\s+", ", ");
        System.out.println("[" + numbersOnly + "]");
    }
}
