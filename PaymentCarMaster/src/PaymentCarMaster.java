/*

Q78 — Payment Card Masker

A payment system must never display full card numbers.
Mask all digits except the last 4, replacing them with `*`.

**Input:**

```
String[] cards = {"1234567890123456", "4111111111111111", "378282246310005"};
```

**Expected Output:**

```
1234567890123456 → ************3456
4111111111111111 → ************1111
378282246310005  → ***********0005
```

**Constraint:** Use `substring()` to get the last 4 digits. Build the masked part using a loop that appends `*` for each hidden digit. Do not hardcode the number of stars.
 */



public class PaymentCarMaster {
    public static void main(String[] args) {
        String[] cards = {"1234567890123456", "4111111111111111", "378282246310005"};
        for (int i = 0; i<cards.length; i++) {
            paymentCarMaster(cards[i]);

        }

}

    private static void paymentCarMaster(String card) {

        StringBuilder sb = new StringBuilder();
        for (int i = 0 ; i<card.length()-4; i++)
        {
            sb.append("*");
        }
       sb.append( card.substring(card.length()-4 ));
        System.out.println(card + "  → " + sb.toString());
    }
}