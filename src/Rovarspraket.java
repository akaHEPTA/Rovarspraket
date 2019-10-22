public class Rovarspraket {
    private Rovarspraket() {
    }

    public static String getRovarspraket(String strOrig) {
        char[] charOrig = strOrig.toLowerCase().toCharArray();
        String strRst = "";

        for (char ch : charOrig) {
            if ("aeiou".contains(String.valueOf(ch))) {
                strRst += ch;
            } else {
                strRst += ch;
                strRst += getSecond(ch);
                strRst += getThird(ch);
            }
        }

        return strRst;
    }

    private static boolean isVowel(char ch) {
        return "aeiou".contains(String.valueOf(ch));
    }

    private static char getSecond(char ch) {
        if (ch >= 97 && ch <= 99) return 'a';
        else if (ch > 99 && ch <= 103) return 'e';
        else if (ch > 103 && ch <= 108) return 'i';
        else if (ch > 108 && ch <= 114) return 'o';
        else return 'u';
    }

    private static char getThird(char ch) {
        // if the input is 'z'
        if (ch == 'z') return 'z';
        // if the input is not 'z' && the next letter of input is not vowel
        else if (!isVowel((char) (ch + 1))) return (char) (ch + 1);
        // if the input is not 'z' && the next letter of input is vowel
        else return (char) (ch + 2);
    }
}
