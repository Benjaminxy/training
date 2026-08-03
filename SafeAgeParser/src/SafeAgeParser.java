/*
Q80 — Safe Age Parser

A form accepts user age as text input. Parse it to an integer safely.
If the input is invalid, return a default value of `-1` instead of crashing.

**Input:**

```
String[] inputs = {"25", "abc", "  ", null, "17", "99.5"};
```

**Expected Output:**

```
"25"   → 25
"abc"  → -1 (invalid)
"  "   → -1 (blank)
null   → -1 (null)
"17"   → 17
"99.5" → -1 (decimal, not integer)
```

**Constraint:** Use `Integer.parseInt()` inside a `try-catch`. Handle `null` and blank before attempting to parse.

 */

public class SafeAgeParser {


    public static void main(String[] args) {


        String[] inputs = {"25", "abc", "  ", null, "17", "99.5"};


        for (int i = 0; i<inputs.length; i++){

            safeChecker(inputs[i]);
        }


    }

    private static void safeChecker(String input) {
        if (input == null ) {
            System.out.println(input +"  → " + -1 + " (null)");
            return;

        }

        if (input.isBlank()) {
            System.out.println(input +"  → " + -1 + "  (blank)");
            return;

        }
        // int age = Integer.parseInt(input) ;
        try {
            int age = Integer.parseInt(input) ;

            System.out.println(input +"  → " +age);

        }catch (NumberFormatException e) {
            for (int i = 0; i<input.length(); i++) {
                if(Character.isLetter(input.charAt(i)))
                {
                    System.out.println( input + "→ -1 (invalid)" );
                    return;
                }
                if (!Character.isDigit(input.charAt(i))) {

                    System.out.println( input + " → -1 (decimal, not integer)");
                    return;

                }

            }

            System.out.println(input +"  → " + -1);
        }


    }
}