/*Q76 — Swedish Personnummer Validator

A government system validates Swedish personal identity numbers (personnummer).
Format: `YYMMDD-XXXX` — 6 digits, a hyphen, then 4 digits. Total 11 characters.

**Input:**

        ```
String[] ids = {"900115-1234", "19900115-1234", "900115-123", "90011A-1234", "900115-12345"};
```

        **Expected Output:**

        ```
        900115-1234   → VALID
19900115-1234 → INVALID (wrong format, should be YYMMDD)
900115-123    → INVALID (too short after hyphen)
90011A-1234   → INVALID (contains letter)
900115-12345  → INVALID (too long after hyphen)
```

        **Constraint:** Check total length == 11, then `charAt(6) == '-'`, then that all other characters are digits.
*/
public class SwedishPersonNr {

    public static void main(String[] args) {

        String[] ids = {"900115-1234", "19900115-1234", "900115-123", "90011A-1234", "900115-12345"};
for (int i = 0; i<ids.length; i++) {
    swedishPersonNr(ids[i]);
}

    }

    private static void swedishPersonNr(String id) {

        
        if (containsOnlyDigits (id)) {

            if (id.length()- id.indexOf('-')==4){

                System.out.println( id + "  →  INVALID (too short after hyphen)");

            }
            if(!id.startsWith("9") && !id.startsWith("0")) {

                System.out.println(id + "  → INVALID (wrong format, should be YYMMDD)");
            }
            if (!containsOnlyDigits(id)) {

                System.out.println("→ INVALID (contains letter)");


            }

            
            
        }
            
            
    }

    private static boolean containsOnlyDigits(String id) {

        char [] c = id.toCharArray();

        for (int i = 0; i <c.length ; i++)
            if (Character.isDigit(c[i]) && c [id.length()-5] ==  '-') {
                return true ;

            }

        }
        return false;
    }
}
