import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RemoveSpamUser {

    public static void main(String[] args) {
        ArrayList<String> users = new ArrayList<>(List.of("ali", "spamuser1", "anna", "botxyz", "erik"));
        ArrayList<String> blacklist = new ArrayList<>(List.of("spamuser1", "botxyz"));

        removeSpamUser(users , blacklist);
    }

    private static void removeSpamUser(ArrayList<String> users, ArrayList<String> blacklist) {

        Iterator <String> it = users.iterator();

        while (it.hasNext()){

           String val = it.next();
           if(blacklist.contains(val)){
               it.remove();

           }
        }

        System.out.println(users);
    }
}
