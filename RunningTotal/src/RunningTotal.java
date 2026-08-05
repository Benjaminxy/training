/*


Q35 — Running Total (Cumulative Sum)

A budget tracker shows a running balance after each transaction.

Input:

ArrayList<Integer> transactions = new ArrayList<>(List.of(100, -30, 50, -20, 75));

Expected Output:

Running totals: [100, 70, 120, 100, 175]

Constraint: Each output element = sum of all input elements up to and including that index.

*/
import java.util.ArrayList;
import java.util.List;

class RunningTotal {
    public static void main(String[] args) {


        ArrayList<Integer> transactions = new ArrayList<>(List.of(100, -30, 50, -20, 75));

        runningTotal(transactions);
    }
    private static void runningTotal (ArrayList<Integer> transactions) {

        ArrayList<Integer> total = new ArrayList<>();
        int temp = 0 ;
        for (int i = 0; i<transactions.size(); i++){


            temp+=transactions.get(i);

            total.add(temp);


        }





        System.out.println("Running totals:" + total);

    }

}