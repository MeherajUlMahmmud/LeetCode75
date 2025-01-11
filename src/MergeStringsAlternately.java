public class MergeStringsAlternately {
    public static void main(String[] args) {
        String word1 = "abcd";
        String word2 = "pq";

        System.out.println("Merged string " + solution1(word1, word2));
    }

    public static String solution1(String word1, String word2) {
        StringBuilder merged = new StringBuilder();
        int i = 0, j =0;
        while (i < Math.max(word1.length(), word2.length())) {
            if (i < word1.length()) merged.append(word1.charAt(i));
            if (j < word2.length()) merged.append(word2.charAt(j));
            i++;
            j++;
        }
        return merged.toString();
    }

}