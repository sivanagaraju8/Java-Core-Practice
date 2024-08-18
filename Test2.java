import java.util.Arrays;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        String str = "bacdaa";
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int sum = numbers.stream().filter(num -> num % 2 == 0).mapToInt(Integer::intValue).sum();

        System.out.println(getLenOfLonSubString(str, 2));

    }

    public static int countDistinct(int[] freq) {
        int distinct = 0;

        for (int i = 0; i < 26; i++) {
            if (freq[i] > 0) {
                distinct++;
            }
        }
        System.out.println("Distinct "+ distinct);
        return distinct;
    }

    public static int getLenOfLonSubString(String s, int k) {
        int longestLength = 0;
        int n = s.length();
        System.out.println(n);

        for (int i = 0; i < n; i++) {

            int[] freq = new int[26];


            for (int j = i; j < n; j++) {
                freq[s.charAt(j) - 'a']++;

                if (countDistinct(freq) <= k) {
                    longestLength = Math.max(longestLength, j - i +1 );
                    System.out.println("longest length "+ longestLength);
                    System.out.println("String "+ s.substring(i,j));

                }

            }


        }
        return longestLength;
    }
}
