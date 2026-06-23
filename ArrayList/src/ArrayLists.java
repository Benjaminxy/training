
import java.util.ArrayList;
import java.util.Arrays;

public class  ArrayLists {
    public static void main(String[] args) {
        String[] nameArray = new String[4];
        String[] nameArray2 = {"benjamin", "ali", "hassan", "karim"};

        ArrayList<String> nameArrayList = new ArrayList<String>();
        ArrayList<String> nameArrayList2 = new ArrayList<String>(Arrays.asList("benjamin", "ali", "hassan", "karim"));

        System.out.println(nameArray[1]);
        System.out.println(nameArrayList2.get(1));

        System.out.println(nameArray2.length);
        System.out.println(nameArrayList2.size());

        nameArrayList2.add("Mike");


        nameArray2[0] = "ajab";
        nameArrayList2.set(0, "ajab");

        nameArrayList2.remove("Mike");

        System.out.println(nameArrayList2);

    }
}
