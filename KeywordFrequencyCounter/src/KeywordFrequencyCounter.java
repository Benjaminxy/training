
/*
Q50 — Keyword Frequency Counter

A document analysis tool counts how many times a specific keyword appears in a text.
The search must be **case-insensitive**.

        **Input:**

        ```
String text    = "Java is great. I love Java. Every developer should learn Java.";
String keyword = "java";
```

        **Expected Output:**

        ```
Keyword "java" found 3 times.
```

        **Constraint:** Do not use `split()` or regex. Use `indexOf()` in a loop, advancing the position after each match.

 */
public class KeywordFrequencyCounter {



    public static void main(String[] args) {

        String text    = "Java is great. I love Java. Every developer should learn Java.";
       String keyword = "java";


       int res =  keywordFrequencyCounter(text ,keyword );

        System.out.println( "Keyword java found " +res+ " times");


    }

    private static int keywordFrequencyCounter(String text, String keyword) {

      String best = text.toLowerCase();


      int index = 0;
      int count = 0;

       while (best.indexOf(keyword , index ) != -1) {

           index = best.indexOf(keyword , index);
           count++;
           index=index+keyword.length();

       }

      return count;
    }
}
