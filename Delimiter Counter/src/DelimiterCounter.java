/*
Delimiter Counter

A data import tool receives raw CSV text.
Before processing, count how many commas appear in the line to know how many fields to expect.

**Input:**

```
String line1 = "Ali,25,Stockholm,Developer,Sweden";
String line2 = "Anna,,Gothenburg,,";
String line3 = "NoCommasHere";
```

**Expected Output:**

```
line1 → 4 commas → 5 fields expected
line2 → 4 commas → 5 fields expected
line3 → 0 commas → 1 field expected
```

**Constraint:** Do not use `split()`. Count manually with a loop and `charAt()`.untitleduntitled
 */


public class DelimiterCounter {


    public static void main(String[] args) {


        String [] line = {"Ali,25,Stockholm,Developer,Sweden" ,"Anna,,Gothenburg,," , "NoCommasHere" };

        for (int i = 0; i < line.length; i++) {

       int res= delimiterCounter(line[i]);

            System.out.println("line"+ (i+1) + " → " + (res+1) + " commas" + " → " + res + " fields expected" );
        }
    }

    private static int delimiterCounter(String line) {
            int counter = 0;
        for (int i = 0; i < line.length(); i++) {
            if(line.charAt(i) == ','){
                counter++;

            }
        }
        return counter;
    }
}
