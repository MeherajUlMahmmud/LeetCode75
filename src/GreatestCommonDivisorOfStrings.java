public class GreatestCommonDivisorOfStrings {
    public static void main(String[] args) {
        String word1 = "ABCABC";
        String word2 = "ABC";
//        String word1 = "LEET";
//        String word2 = "CODE";

        System.out.println("Greatest Common Divisor of Strings " + solution1(word1, word2));
    }

    public static String solution1(String word1, String word2) {
        if (!(word1 + word2).equals(word2 + word1)) {
            return "";
        }
        int gcdLength = gcd(word1.length(), word2.length());
        return word1.substring(0, gcdLength);
    }

    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}
