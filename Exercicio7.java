class SqueakyClean {

    static String clean(String identifier) {

        StringBuilder result = new StringBuilder();
        boolean makeNextUppercase = false;

        for (char ch : identifier.toCharArray()) {

            if (Character.isWhitespace(ch)) {
                result.append('_');
                makeNextUppercase = false;
                continue;
            }

            if (ch == '-') {
                makeNextUppercase = true;
                continue;
            }

            switch (ch) {
                case '4': ch = 'a'; break;
                case '3': ch = 'e'; break;
                case '0': ch = 'o'; break;
                case '1': ch = 'l'; break;
                case '7': ch = 't'; break;
            }

            if (Character.isLetter(ch) || ch == '_') {
                if (makeNextUppercase) {
                    result.append(Character.toUpperCase(ch));
                    makeNextUppercase = false;
                } else {
                    result.append(ch);
                }
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {

        System.out.println(SqueakyClean.clean("my   Id"));
        System.out.println(SqueakyClean.clean("a-bc"));
        System.out.println(SqueakyClean.clean("H3ll0 W0rld"));
        System.out.println(SqueakyClean.clean("4 73s7"));
        System.out.println(SqueakyClean.clean("a$#.b"));
    }
}
