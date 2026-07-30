/*

Q69 — Email Domain Grouper

A company analytics tool groups users by their email domain to see which organisations are signing up.

**Input:**

```
String[] emails = {
    "anna@gmail.com",
    "erik@stockholm.se",
    "ali@gmail.com",
    "fatima@malmo.se",
    "lars@hotmail.com"
};
```

**Expected Output:**

```
anna@gmail.com    → domain: gmail.com
erik@stockholm.se → domain: stockholm.se
ali@gmail.com     → domain: gmail.com
fatima@malmo.se   → domain: malmo.se
lars@hotmail.com  → domain: hotmail.com
```

**Constraint:** Use `indexOf("@")` and `substring()`. Do not use `split()` for this one.

---
 */

public class EmailDomainGrouper {

    public static void main(String[] args) {


        String[] emails = {
                "anna@gmail.com",
                "erik@stockholm.se",
                "ali@gmail.com",
                "fatima@malmo.se",
                "lars@hotmail.com"
        };

        for (int i = 0 ; i<emails.length; i++) {
            String res = emailDomainGrouper(emails [i]);

            System.out.println(emails[i] + "\t→ domain: " + res);
        }
    }

    private static String emailDomainGrouper(String email) {

        int start = email.indexOf("@");

       email= email.substring(start+1 );



        return email;
    }
}
