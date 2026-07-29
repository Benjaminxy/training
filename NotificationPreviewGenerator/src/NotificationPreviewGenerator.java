/*
Q61 — Notification Preview Generator

A mobile app shows a preview of long notifications. If the text exceeds 40 characters, truncate it and add "..." at the end.

Input:

String[] messages = {
    "Meeting at 10am",
    "Your package has been delivered to the pickup point near you",
    "Hi",
    "Please review the attached document and provide feedback before Friday"
};

Expected Output:

"Meeting at 10am"                                          → "Meeting at 10am"
"Your package has been delivered to the pickup point..."   → truncated
"Hi"                                                       → "Hi"
"Please review the attached document and provide feedb..." → truncated

Constraint: The final string including "..." must not exceed 43 characters. Use substring() and length().

*/

class NotificationPreviewGenerator {
    public static void main(String[] args) {
        String[] messages = {
                "Meeting at 10am",
                "Your package has been delivered to the pickup point near you",
                "Hi",
                "Please review the attached document and provide feedback before Friday"
        };
        for(int i =0; i<messages.length; i++){
            String res =  notificationPreviewGenerator(messages [i]);
            System.out.println(messages [i] + " ->  " + res );


        }



    }


    public static String notificationPreviewGenerator(String text) {






        if (text.length() <= 40)
        {

            return text ;
        }else {
            text = text.substring(0,40) + "..." ;
        }




        return text;
    }



}