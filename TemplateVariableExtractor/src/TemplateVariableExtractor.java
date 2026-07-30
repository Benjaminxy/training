
/*
Q67 — Template Variable Extractor

A notification system uses templates with placeholders like `{{name}}` and `{{date}}`.
Extract every value found between `{{` and `}}` in the template.

**Input:**

```
String template = "Hello {{name}}, your appointment on {{date}} at {{time}} is confirmed.";
```

**Expected Output:**

```
Found placeholders:
1. name
2. date
3. time
Total: 3 placeholders
```

**Constraint:** Use `indexOf("{{")` and `indexOf("}}")` in a loop. Advance the position after each found placeholder.


 */


public class TemplateVariableExtractor {


    public static void main(String[] args) {

        String template = "Hello {{name}}, your appointment on {{date}} at {{time}} is confirmed.";

        int space = 2;
        int stassrt = template.indexOf("{{") + space ;

int start = 0;
int end = 0;
int counter = 0;
while (true)
{

    start = template.indexOf("{{", end) ;
    if (start ==-1){break;}
     end = template.indexOf("}}" , start) ;
    if (end== -1){break;}
    counter++;
     String items  = template.substring(start+space,end);
    end += 2;


    System.out.println(counter + ". " + items);
}
        System.out.println("Total:" + counter +" placeholders");







    }
}
