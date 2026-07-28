public class URLSlugGenerator {

    public static void main(String[] args) {

        String[] titles = {
                "How to Learn Java Fast",
                "Top 10 Tips for Developers!",
                "Why Sweden is Great for Tech?"
        };

        for (int i = 0; i < titles.length; i++) {
            String res = checkURLSlugGenerator(titles[i]);

            System.out.println(titles[i] + " → " + res);
        }
    }

    private static String checkURLSlugGenerator(String title) {

        title = title.toLowerCase();
        title = title.replace(" ", "-");

        char[] c = title.toCharArray();
        char[] clean = new char[c.length];

        int pos = 0;

        for (int i = 0; i < c.length; i++) {

            if (Character.isLetterOrDigit(c[i]) || c[i] == '-') {
                clean[pos] = c[i];
                pos++;
            }
        }

        return new String(clean, 0, pos);
    }
}