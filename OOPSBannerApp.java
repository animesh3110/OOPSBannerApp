
public class OOPSBannerApp {

    public static void main(String[] args) {

        CharacterPattern O = new CharacterPattern('O', new String[]{
                " OOO ",
                "O   O",
                "O   O",
                "O   O",
                " OOO "
        });

        CharacterPattern P = new CharacterPattern('P', new String[]{
                "PPPP ",
                "P   P",
                "PPPP ",
                "P    ",
                "P    "
        });

        CharacterPattern S = new CharacterPattern('S', new String[]{
                " SSSS",
                "S    ",
                " SSS ",
                "    S",
                "SSSS "
        });

        CharacterPattern[] word = {O, O, P, S};

        for (int i = 0; i < 5; i++) {
            for (CharacterPattern c : word) {
                System.out.print(c.getPattern()[i] + "   ");
            }
            System.out.println();
        }
    }

    /**
     * Inner class to store character and its ASCII pattern
     */
    static class CharacterPattern {

        private char character;
        private String[] pattern;

        public CharacterPattern(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }
}