
/*
Q57 — Sentence Reverser

A text processing tool reverses the order of words in a sentence. Multiple spaces between words should be normalized to one.

Input:

String s1 = "Hello World";
String s2 = "Java is fun to learn";
String s3 = "  too   many   spaces  ";

Expected Output:

"Hello World"          → "World Hello"
"Java is fun to learn" → "learn to fun is Java"
"  too   many   spaces  " → "spaces many too"

Constraint: Use trim() and split("\\s+") to handle multiple spaces. Reverse the resulting array manually without using Collections.reverse().
*/
class SentenceReverser {
    public static void main(String[] args) {
        String word [] = {"Hello World","Java is fun to learn","  too   many   spaces  "};


        for (int i =0; i<word.length; i++)
        {
            String res=  sentenceReverser (word[i]);

            System.out.println(res);


        }

    }


    public static String sentenceReverser (String word){
        word = word.trim();

        String words[] = word.split("\\s+");
        int j = words.length-1;
        String temp = "";
        for (int i = 0 ; i<words.length/2; i++)
        {
            temp = words [i] ;
            words [i] = words [j];
            words [j] = temp;

            j--;
        }

        return String.join ( " " , words);
    }

}

