public class NameValidation {

    public static void main(String[] args) {

        String[] names = {
                "Anna Karlsson",
                "Lars123",
                "Erik-Sven",
                "   ",
                "Mohamed Ali"
        };

        for (int i = 0; i < names.length; i++) {
            String result = checkNameValidation(names[i]);

            System.out.println("\"" + names[i] + "\" → " + result);
        }
    }

    private static String checkNameValidation(String name) {

        if (name == null || name.isBlank()) {
            return "INVALID (blank)";
        }

        for (int i = 0; i < name.length(); i++) {

            char character = name.charAt(i);

            if (Character.isDigit(character)) {
                return "INVALID (contains digit)";
            }

            if (character == '-') {
                return "INVALID (contains hyphen)";
            }

            if (!Character.isLetter(character)
                    && !Character.isSpaceChar(character)) {
                return "INVALID (contains symbol)";
            }
        }

        return "VALID";
    }
}