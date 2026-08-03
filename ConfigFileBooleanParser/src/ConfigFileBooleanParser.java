/*


Q82 — Config File Boolean Parser

A configuration loader reads true/false settings from a `.properties` file as strings.
Parse them into actual `boolean` values, accepting common variations.

**Input:**

```
String[] values = {"true", "false", "TRUE", "FALSE", "yes", "no", "1", "0", "maybe"};
```

**Expected Output:**

```
"true"  → true
"false" → false
"TRUE"  → true
"FALSE" → false
"yes"   → true
"no"    → false
"1"     → true
"0"     → false
"maybe" → false (unrecognized defaults to false)
```

**Constraint:** Use `toLowerCase()` first, then compare with `equals()`. Do NOT use `Boolean.parseBoolean()` — it silently defaults unknown values to false without you controlling the logic.
 */
public class ConfigFileBooleanParser {
    public static void main(String[] args) {
        String[] values = {"true", "false", "TRUE", "FALSE", "yes", "no", "1", "0", "maybe"};

        for(int i = 0; i<values.length; i++)
        {
            configFileBooleanParser(values[i]);
        }

    }

    private static void configFileBooleanParser(String value) {
         value = value.toLowerCase().trim();
        if(value.equals("yes")|| value.equals("1")|| value.equals("true")){
            System.out.println( value + "  →  true");
        }else {
            System.out.println(value + "   →  false");
        }
    }
}
