public class RequiredFieldChecker {

    public static void main(String[] args) {

        String[] inputs = {"25", "  ", "abc", "17.5", "-3", "120", "0"};

        for (int i = 0; i < inputs.length; i++) {

            String result = fileChecker(inputs[i]);

            System.out.println("\"" + inputs[i] + "\" → " + result);
        }
    }

    private static String fileChecker(String input) {

        if (input == null || input.isBlank()) {
            return "INVALID (blank)";
        }

        int start = 0;

        if (input.charAt(0) == '-') {
            start = 1;
        }

        // "-" alone is not an integer
        if (start == input.length()) {
            return "INVALID (not a number)";
        }

        for (int i = start; i < input.length(); i++) {

            if (input.charAt(i) == '.') {
                return "INVALID (decimal, not integer)";
            }

            if (!Character.isDigit(input.charAt(i))) {
                return "INVALID (not a number)";
            }
        }

        return "VALID integer";
    }
}