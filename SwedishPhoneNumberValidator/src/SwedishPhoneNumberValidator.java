/*
Q74 — Swedish Phone Number Validator

The municipality contact form accepts Swedish phone numbers.
Valid formats: `07XXXXXXXX` (10 digits starting with 07) or `+467XXXXXXXX` (starts with +46).

**Input:**

```
String[] phones = {"0701234567", "+46701234567", "123456", "07012345678", "+4670123456"};
```

**Expected Output:**

```
0701234567     → VALID (local format)
+46701234567   → VALID (international format)
123456         → INVALID (too short)
07012345678    → INVALID (too long)
+4670123456    → INVALID (too short for international)
```
0701234567  10
+46701234567  12
123456  6
123456  → INVALID (too short)
07012345678  11
+4670123456  11

**Constraint:** Check `startsWith()`, then `length()`, then that all remaining characters are digits using a loop.

 */

public class SwedishPhoneNumberValidator {

    public static void main(String[] args) {

        String[] phones = {
                "0701234567",
                "+46701234567",
                "123456",
                "07012345678",
                "+4670123456"
        };

        for (int i = 0; i < phones.length; i++) {
            validatePhoneNumber(phones[i]);
        }
    }

    private static void validatePhoneNumber(String phone) {

        if (phone.startsWith("07")) {

            if (phone.length() < 10) {
                System.out.println(phone + " → INVALID (too short)");
                return;
            }

            if (phone.length() > 10) {
                System.out.println(phone + " → INVALID (too long)");
                return;
            }

            if (containsOnlyDigits(phone, 0)) {
                System.out.println(phone + " → VALID (local format)");
            } else {
                System.out.println(phone + " → INVALID (contains non-digits)");
            }

        } else if (phone.startsWith("+467")) {

            if (phone.length() < 12) {
                System.out.println(phone + " → INVALID (too short for international)");
                return;
            }

            if (phone.length() > 12) {
                System.out.println(phone + " → INVALID (too long for international)");
                return;
            }

            // Start at index 1 to skip the plus sign
            if (containsOnlyDigits(phone, 1)) {
                System.out.println(phone + " → VALID (international format)");
            } else {
                System.out.println(phone + " → INVALID (contains non-digits)");
            }

        } else if (phone.length() < 10) {
            System.out.println(phone + " → INVALID (too short)");

        } else {
            System.out.println(phone + " → INVALID (wrong format)");
        }
    }

    private static boolean containsOnlyDigits(String phone, int startIndex) {

        for (int i = startIndex; i < phone.length(); i++) {
            char character = phone.charAt(i);

            if (character < '0' || character > '9') {
                return false;
            }
        }

        return true;
    }
}