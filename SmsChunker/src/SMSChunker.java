/*
Q64 — SMS Chunker

An SMS gateway can only send messages of maximum **160 characters** per message.
Split a long message into chunks of 160 characters each.

**Input:**

```
String message = "This is a very long message that needs to be split into multiple SMS parts because it exceeds the maximum allowed length of one hundred and sixty characters per single SMS message sent through the gateway system.";
```

**Expected Output:**

```
Part 1 (160 chars): "This is a very long message that needs to be split into multiple SMS parts because it exceeds the maximum allowed length of one "
Part 2 (52 chars):  "hundred and sixty characters per single SMS message sent through the gateway system."
Total parts: 2
```

**Constraint:** Use a loop with `substring(start, end)`. Handle the last chunk which may be shorter than 160 characters.
 */

public class SMSChunker {

    public static void main(String[] args) {


        String message = "This is a very long message that needs to be split into multiple SMS parts because it exceeds the maximum allowed length of one hundred and sixty characters per single SMS message sent through the gateway system.";
        smsChunker(message);
    }

    private static void smsChunker(String message) {


        int part = 1;
        int limit = 160;
        int start = 0 ;

       /* for (int i = 0; i<chunk; i++) {

            int start = i*limit;
           // (temp = message.length()-start)
            System.out.println( "part" + part + "("+  (temp = message.length()-start)  + "chars)"+ " " +message.substring(start));



        part++;

            //System.out.println( "part" + part + "("+  (temp = message.length()-start)  + "chars)"+ " " +message.substring(start));




        }


        */

        int j = 0;

        while(message.length() >start){

            int  end = start + limit;

            if (end>limit){

                end = message.length();
            }
            int remaining = end -start ;


                System.out.println("part" + part + "(" + remaining + "chars)" + " " + message.substring(start, end));

j++;
part++;
start = end;
        }
    }
}
