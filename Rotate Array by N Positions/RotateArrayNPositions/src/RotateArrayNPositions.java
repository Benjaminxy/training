
/*Rotate Array by N Positions

A weekly schedule is stored as 7 time slots (Monday to Sunday).
Rotate the schedule **right by 2 positions** so the last 2 days shift to the front.

**Input:**

```
String[] schedule = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
N = 2
```
**Expected Output:**
```
Before: [Mon, Tue, Wed, Thu, Fri, Sat, Sun]
After:  [Sat, Sun, Mon, Tue, Wed, Thu, Fri]
```
**Constraint:** Make it work for any value of N, including N larger than the array length.

 */


public class RotateArrayNPositions {


    public static void main(String[] args) {

        String[] schedule = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};


        int N = 2;
        schedule = RotateArrayN(schedule, N);

        for (int i = 0; i<schedule.length ; i++) {

            System.out.println(schedule[i] +" ,");
        }


    }

    private static String [] RotateArrayN(String[] schedule, int n) {
        String[] newSchedules = new String[schedule.length];

        for (int i = 0; i < schedule.length; i++) {

            // this is very imortant **********************
            newSchedules[(i+n)%schedule.length] = schedule[i] ;

        }
       return newSchedules ;

    }
}