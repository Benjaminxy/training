/*Count Occurrences of a Specific Value
A support system logs ticket priorities as numbers (1 = Low, 2 = Medium, 3 = High). Count how many tickets have priority 1, priority 2, and priority 3.

Input: int[] tickets = {1, 3, 2, 1, 3, 1, 2, 3, 3, 1};


Expected Output: Priority 1 (Low): 4 tickets Priority 2 (Medium): 2 tickets Priority 3 (High): 4 tickets
Constraint: Use a single loop. Do not hardcode three separate loops. */

public class CountOccurrences {


    public static void main(String[] args) {

        int[] tickets = {1, 3, 2, 1, 3, 1, 2, 3, 3, 1};


        int [] count = new int [3];


        countOccurrences (tickets ,  count);

        System.out.println(

    "Priority 1 (Low): "+count[0]  + " tickets Priority 2 (Medium): " +count[1]   + " tickets Priority 3 (High): "+ count[2]   + " tickets"
        );




    }

    private static void countOccurrences(int[] tickets ,  int[] count) {

        for (int i =0 ; i < tickets.length ; i++)
        {
//this is very important ******************
            count[tickets[i] - 1]++;



        }


        }
    }


