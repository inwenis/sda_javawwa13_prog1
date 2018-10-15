public class Exercise9 {
    public static void main(String[] args) {

        System.out.println("***");
        System.out.println("* *");
        System.out.println("***");

        System.out.println(asteriskSquare(3));
        System.out.println(asteriskSquare(4));
        System.out.println(asteriskSquare2(4));
    }

    public static String asteriskSquare(int length) {
        String result = "";
        for (int i = 0; i < length; i++) {
            result += "*";
        }
        result += "\n";
        for (int i = 0; i < length - 2; i++) {
            result += "*";
            for (int j = 0; j < length - 2; j++) {
                result += " ";
            }
            result += "*";
            result += "\n";
        }
        for (int i = 0; i < length; i++) {
            result += "*";
        }
        return result;
    }

    // lets refactor
    public static String asteriskSquare2(int length) {
        String result = "";
        result = repeat(length, "*");
        result += "\n";
        for (int i = 0; i < length - 2; i++) {
            result += "*";
            result += repeat(length - 2, " ");
            result += "*";
            result += "\n";
        }
        result += repeat(length, "*");
        return result;
    }

    private static String repeat(int length, String character) {
        String result = "";
        for (int i = 0; i < length; i++) {
            result += character;
        }
        return result;
    }
}
