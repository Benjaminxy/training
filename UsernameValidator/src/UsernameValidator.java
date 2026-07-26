/*

Q46 — Username Validator

A new system requires usernames to contain only letters and digits — no spaces, no symbols.
Minimum 3 characters, maximum 20 characters.

**Input:**

```
String[] usernames = {"ali99", "anna_k", "ab", "validUser123", "has space", "toolongusernamethatexceedslimit"};
```

**Expected Output:**

```
"ali99"                          → VALID
"anna_k"                         → INVALID (contains underscore)
"ab"                             → INVALID (too short)
"validUser123"                   → VALID
"has space"                      → INVALID (contains space)
"toolongusernamethatexceedslimit" → INVALID (too long)
```

**Constraint:** Use `Character.isLetterOrDigit()`. Check length before checking characters.
 */




public class UsernameValidator {


    public static void main(String[] args) {


        String[] usernames = {"ali99", "anna_k", "ab", "validUser123", "has space", "toolongusernamethatexceedslimit","jomung*"};


        for (int i = 0; i < usernames.length; i++) {
        String res = checkUsernameValidator(usernames[i]);

            System.out.println(usernames[i] + " : " + res);
        }

    }

    private static String checkUsernameValidator(String username) {

        if(username==null || username.isBlank()) {
            return " →  INVALID (Username is blank)";
        }

        if(username.length()>20) {

            return "→ INVALID (too long)";
        }
        if(username.length()<3) {

            return " → INVALID (too short)";

        }


        for(int i=0;i<username.length();i++) {
            if(username.charAt(i)==('_')) {

                return " → INVALID (contains underscore)";
            }

            if (Character.isWhitespace(username.charAt(i))){
                return "→ INVALID (contains space)";
            }
            if (!Character.isLetterOrDigit(username.charAt(i))){

                return "→ INVALID (contains symbols)";
            }
        }

        return "VALID";
    }


}
