/*

Q73 — Email Address Validator

A registration form must validate email addresses before submission.
An email is valid if it has: one `@`, at least one character before `@`, a dot after `@`, and characters after the dot.

**Input:**

```
String[] emails = {
    "ali@gmail.com",
    "missing-at-sign.com",
    "@nodomain.com",
    "nodot@domain",
    "valid@sub.domain.se",
    "double@@at.com"
};
```

**Expected Output:**

```
ali@gmail.com       → VALID
missing-at-sign.com → INVALID (no @)
@nodomain.com       → INVALID (nothing before @)
nodot@domain        → INVALID (no dot after @)
valid@sub.domain.se → VALID
double@@at.com      → INVALID (multiple @)
```

**Constraint:** No regex. Use `indexOf()`, `lastIndexOf()`, and `length()` checks only.

---
 */

public class EmailAddressValidator {

    public static void main(String[] args) {

        String[] emails = {
                "ali@gmail.com",
                "missing-at-sign.com",
                "@nodomain.com",
                "nodot@domain",
                "valid@sub.domain.se",
                "double@@at.com"
        };

        for (int i = 0; i < emails.length; i++) {
            validateEmail(emails[i]);
        }
    }

    private static void validateEmail(String email) {

        int firstAtIndex = email.indexOf("@");
        int lastAtIndex = email.lastIndexOf("@");

        if (firstAtIndex == -1) {
            System.out.println(email + " → INVALID (no @)");

        } else if (firstAtIndex != lastAtIndex) {
            System.out.println(email + " → INVALID (multiple @)");

        } else if (firstAtIndex == 0) {
            System.out.println(email + " → INVALID (nothing before @)");

        } else {
            int dotIndex = email.indexOf(".", firstAtIndex + 1);

            if (dotIndex == -1) {
                System.out.println(email + " → INVALID (no dot after @)");

            } else if (dotIndex == email.length() - 1) {
                System.out.println(email + " → INVALID (nothing after dot)");

            } else {
                System.out.println(email + " → VALID");
            }
        }
    }
}
