/*

Q58 — Simple Text Obfuscator

A system obfuscates short codes by reversing the characters before storing them.

Input:

String[] codes = {"ABC123", "Hello", "racecar", "Sweden"};

Expected Output:

"ABC123"  → "321CBA"
"Hello"   → "olleH"
"racecar" → "racecar"
"Sweden"  → "nedewS"

Constraint: Use a StringBuilder and its reverse() method. Then re-solve it a second time using a manual loop with charAt() to understand what reverse() does internally.

*/

class SimpleTextObfuscator {
    public static void main(String[] args) {
        String[] codes = {"ABC123", "Hello", "racecar", "Sweden"};
        for (int i = 0; i<codes.length; i++   ){

            String res=simpleTextObfuscator(codes[i]);

            System.out.println(codes [i] + "  → "  + res);}


    }

    public static String simpleTextObfuscator (String code ) {

        StringBuilder sb = new StringBuilder();
        sb.reverse(code);

        return "jest" ;
    }


}