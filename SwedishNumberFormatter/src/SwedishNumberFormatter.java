public class SwedishNumberFormatter {

    public static void main(String[] args) {
        int[] amounts = {0, 999, 1000, 85000, 1250000, 9999999};

        for (int i = 0; i < amounts.length; i++) {
            System.out.printf("%-10d → %s%n", amounts[i], formatSwedishNumber(amounts[i]));
        }
    }

    private static String formatSwedishNumber(int amount) {
        String str = Integer.toString(amount);
        StringBuilder sb = new StringBuilder();

        int digitCount = 0;

        // Traverse digits from right to left
        for (int i = str.length() - 1; i >= 0; i--) {
            // Add the current digit to the builder
            sb.append(str.charAt(i));
            digitCount++;

            // Insert a space after every 3 digits, provided we aren't at the first digit
            if (digitCount % 3 == 0 && i != 0) {
                sb.append(" ");
            }
        }

        // Since we built it backwards (right-to-left), reverse it at the end
        return sb.reverse().toString();
    }
}