/*


Q36 — First N / Last N Extractor

Get a preview (first 3) and a recent-activity view (last 3) of a user's action log.

Input:

ArrayList<String> log = new ArrayList<>(List.of("login", "view", "click", "purchase", "logout"));

Expected Output:

First 3: [login, view, click]
Last 3:  [click, purchase, logout]

Constraint: Use subList() and copy the result into a new ArrayList (raw subList() is a live view — be aware of that pitfall and explain it in a comment... actually, no comments — just handle it correctly by wrapping in new ArrayList<>(...)).

*/

import java.util.ArrayList;
import java.util.List;

class FirstLastExtractor {
    public static void main(String[] args) {

        ArrayList<String> log = new ArrayList<>(List.of("login", "view", "click", "purchase", "logout"));

        System.out.println("Start small. Ship something.");

        firstLastExtractor(log);
    }
    public static void firstLastExtractor(ArrayList<String> log){


        ArrayList<String> first = new ArrayList<>(log.subList(0,3));
        ArrayList<String> last = new ArrayList<>(log.subList(log.size()-3,log.size()));

        System.out.println("First 3: " + first);
        System.out.println("Last 3: " + last);

    }

}
