

public class OOPSBannerApp {

    public static void main(String[] args) {

        Map<Character, String[]> patterns = new HashMap<>();

        patterns.put('O', new String[]{
                " OOO ",
                "O   O",
                "O   O",
                "O   O",
                " OOO "
        });

        patterns.put('P', new String[]{
                "PPPP ",
                "P   P",
                "PPPP ",
                "P    ",
                "P    "
        });

        patterns.put('S', new String[]{
                " SSSS",
                "S    ",
                " SSS ",
                "    S",
                "SSSS "
        });

        renderBanner("OOPS", patterns);
    }

    /**
     * Function to render banner
     */
    public static void renderBanner(String word, Map<Character, String[]> patterns) {

        int height = 5;

        for (int i = 0; i < height; i++) {

            for (char c : word.toCharArray()) {

                String[] pattern = patterns.get(c);

                if (pattern != null) {
                    System.out.print(pattern[i] + "   ");
                }
            }

            System.out.println();
        }
    }
}