/*

The reverse of Q53 — a tool reads database column names and generates Java variable names.

**Input:**

```
String[] dbColumns = {"first_name", "last_name", "date_of_birth", "email_address", "is_active"};
```

**Expected Output:**

```
first_name    → firstName
last_name     → lastName
date_of_birth → dateOfBirth
email_address → emailAddress
is_active     → isActive
```

**Constraint:** Use `split("_")` to get words, then capitalize the first letter of each word except the first one. Use `StringBuilder` to build the result.

---
 */

public class ConvertToCamelCase {

    public static void main(String[] args) {

        String[] dbColumns = {"first_name", "last_name", "date_of_birth", "email_address", "is_active"};
        for(int i= 0; i<dbColumns.length ; i++) {
        String res = convertToCamelCase(dbColumns[i]);
            System.out.println(res);

        }

    }

    private static String convertToCamelCase(String dbColumn) {


       String  [] db = dbColumn.split("_");
       StringBuilder sb = new StringBuilder();
       sb.append(db[0]);
       for (int i = 1; i<db.length; i++) {
           sb.append(Character.toUpperCase(db[i].charAt(0)));
          sb.append(db[i].substring(1)) ;

       }


        return sb.toString();
    }
}
