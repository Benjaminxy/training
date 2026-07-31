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

        String[] phones = {"0701234567", "+46701234567", "123456", "07012345678", "+4670123456"};

        for (int i=0; i<phones.length; i++) {

            swedishPhoneNumberValidator (phones [i]) ;
        }

    }

    private static void swedishPhoneNumberValidator(String phone) {

       // System.out.println( phone +"  " + phone.length());

        if (!phone.startsWith("+") && phone.length()!=12) {
            System.out.println(phone + " " +"invalid");

        }else {
            System.out.println(phone +"→ VALID (international format)");

        }
        if (phone.length()<10) {
            System.out.println(phone + "  → INVALID (too short)");
        } else if (phone.length()>11) {


        }

    }
}
