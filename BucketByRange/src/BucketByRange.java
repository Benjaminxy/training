/*



Q34 — Bucket by Range

Categorize customer ages into three buckets: Young (0–17), Adult (18–64), Senior (65+).

Input:

ArrayList<Integer> ages = new ArrayList<>(List.of(12, 34, 70, 8, 45, 90, 17));

Expected Output:

Young:  [12, 8, 17]
Adult:  [34, 45]
Senior: [70, 90]

Constraint: Three separate ArrayList<Integer> outputs, one loop.

*/
import java.util.ArrayList;
import java.util.List;
class BucketByRange {
    public static void main(String[] args) {
        System.out.println("Hi Benjamin");

        ArrayList<Integer> ages = new ArrayList<>(List.of(12, 34, 70, 8, 45, 90, 17));

        bucketByRange (ages) ;


    }
    private static void bucketByRange (ArrayList <Integer> ages)  {

        ArrayList<Integer> young = new ArrayList<>();
        ArrayList <Integer> adult = new ArrayList<>();
        ArrayList <Integer> senior = new ArrayList<>();


        for(int age: ages) {

            if(age>= 65) {

                senior.add(age);
            } else if (age >= 18 && age<65){
                adult.add(age);
            }
            else if (age<18 &&age>0) {
                young.add(age);
            }
        }
        //Young (0–17), Adult (18–64), Senior (65+).
        System.out.println("Young: " + young);
        System.out.println("Adult: " + adult);
        System.out.println("Seniot: " + senior);

    }




}
