/*
Q53 — Database Column Name Converter

A code generator reads Java variable names and converts them to database column names.
Java uses `camelCase`, databases use `snake_case`.

**Input:**

```
String[] javaNames = {"firstName", "lastName", "dateOfBirth", "emailAddress", "isActive"};
```

**Expected Output:**

```
firstName   → first_name
lastName    → last_name
dateOfBirth → date_of_birth
emailAddress → email_address
isActive    → is_active
```

**Constraint:** Loop through each character. When you find an uppercase letter, insert an underscore before it and convert it to lowercase.
 */


public class NameConverter {


    public static void main(String[] args) {

        String[] javaNames = {"firstName", "lastName", "dateOfBirth", "emailAddress", "isActive"};
        for (int i = 0 ; i< javaNames.length; i++){
            String res = convertor(javaNames [i]);

            System.out.print(res);
            System.out.print(",");



        }



    }

    private static String convertor(String javaNames) {

       char [] java = javaNames.toCharArray();
       char [] cleanJava = new char[java.length+2];

       int pos=0;


       for(int i = 0 ; i<java.length; i++) {

           cleanJava[pos]=java[i];

           if (Character.isUpperCase(java[i]))
           {
               java[i]=Character.toLowerCase(java[i]);
               cleanJava[pos]='_';
               pos++;
               cleanJava[pos]=java[i];




           }
           pos++;
       }


        return new String(cleanJava, 0, pos);


    }


}
