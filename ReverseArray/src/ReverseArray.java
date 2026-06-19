
/*
Reverse an Array In-Place
A task manager stores tasks in the order they were created. Reverse the list in-place so the most recently added task appears first.

Input: String[] tasks = {"Send email", "Fix bug", "Write report", "Deploy app", "Review PR"};

Expected Output: Before: [Send email, Fix bug, Write report, Deploy app, Review PR] After: [Review PR, Deploy app, Write report, Fix bug, Send email]

Constraint: Do not create a second array. Swap elements within the same array using a temp variable.
 */

public class ReverseArray {
    public static void main(String[] args) {


        String[] tasks = {"Send email", "Fix bug", "Write report", "Deploy app", "Review PR"};

        System.out.print("Before: [");

        for (int  i = 0 ; i<tasks.length; i++)
        {
            System.out.print(  tasks[i] );
            if (i< tasks.length-1) {
                System.out.print(", ");
            }


        }
        System.out.println("]");

        System.out.print("After: [");



        reversArray(tasks) ;

        for (int  i = 0 ; i<tasks.length; i++)
        {
            System.out.print(  tasks[i]  );
            if (i< tasks.length-1) {
                System.out.print(", ");
            }


        }

        System.out.printf("]");

    }

    private static void reversArray(String[] tasks) {




        for(int i = 0 ; i<((tasks.length/2)); i++)
        {

            String temp = tasks[i];
            tasks[i] = tasks[tasks.length-1-i];
            tasks[tasks.length-1-i] = temp ;


        }
    }
}
