/*Q56 — Name Formatter

A certificate generator receives names in various formats and must display them in proper Title Case.

Input:

String[] names = {"anna karlsson", "ERIK SVENSSON", "mohamed ali hassan", "lena"};

Expected Output:

anna karlsson      → Anna Karlsson
ERIK SVENSSON      → Erik Svensson
mohamed ali hassan → Mohamed Ali Hassan
lena               → Lena

Constraint: Use split(" ") to get words, capitalize the first letter of each word using charAt(0) and substring(1), then join with String.join().
*/


import java.util.Arrays;

class  NameFormatter {
    public static void main(String[] args) {

        String[] names = {"anna karlsson", "ERIK SVENSSON", "mohamed ali hassan", "lena"};


        for (int i = 0;  i<names.length ; i++) {



            String res = nameFormater (names[i]);
            System.out.println( names[i] + " →  " +    res);


        }
    }

    public static String nameFormater(String name){
        String [] names =  name.split(" ");
        String [] newName = new String[names.length];

        for (int i =0 ; i<names.length; i++)
        {

            String word = names[i].toLowerCase();

            newName [i]= Character.toUpperCase(word.charAt(0)) + word.substring(1);

        }

        return String.join(" ", newName);
    }

}