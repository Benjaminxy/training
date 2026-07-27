
class palindromeDetector {
    public static void main(String[] args) {
        String[] words = {"racecar", "Racecar", "hello", "level", "Java", "madam"};

        for (int i = 0; i < words.length; i++) {
            String res = palindromeDetector(words[i]);
            System.out.println("\"" + words[i] + "\" " + res);
        }
    }

    public static String palindromeDetector(String word) {

        String cleanWord = word.toLowerCase();

        int i = 0;
        int j = cleanWord.length() - 1;

        // Step 2: Stop when pointers meet in the middle
        while (i < j) {
            if (cleanWord.charAt(i) == cleanWord.charAt(j)) {
                i++;
                j--;
            } else {
                return "→ NOT a palindrome";
            }
        }

        return "→ PALINDROME";
    }
}