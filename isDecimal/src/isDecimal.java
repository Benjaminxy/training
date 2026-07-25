public class isDecimal {

    public static void main(String[] args) {

        String[] inputs = {
                "19.99", "100", "12.3.4", "abc",
                ".50", "10.", "-19.99", "-100", "-"
        };

        for (int i = 0; i < inputs.length; i++) {

            boolean result = isDecimal(inputs[i]);

            if (result) {
                System.out.println("\"" + inputs[i] + "\" → VALID");
            } else {
                System.out.println("\"" + inputs[i] + "\" → INVALID");
            }
        }
    }

    private static boolean isDecimal(String input) {

        if (input == null || input.isBlank()) {
            return false;
        }

        int start = 0;

        if (input.charAt(0) == '-') {
            start = 1;
        }

        // Reject "-"
        if (start == input.length()) {
            return false;
        }

        // A dot cannot be first or last
        if (input.charAt(start) == '.' ||
                input.charAt(input.length() - 1) == '.') {
            return false;
        }

        int dotCount = 0;

        for (int i = start; i < input.length(); i++) {



            if (input.charAt(i) == '.') {
                dotCount++;

                if (dotCount > 1) {
                    return false;
                }
            } else if (!Character.isDigit(input.charAt(i))) {
                return false;
            }
        }

        return true;
    }
}