import java.util.Arrays;
import java.util.Scanner;

public class AnagramString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();

        if ((str1.length()) != (str2.length())) {
            System.out.println("Not anagram");
        } else {
            char[] arr1 = str1.toCharArray();
            char[] arr2 = str2.toCharArray();
            Arrays.sort(arr1);
            Arrays.sort(arr2);

            for (int i = 0; i < str1.length(); i++) {
                if (arr1[i] == arr2[i]) {

                }
            }
            System.out.println("Anagram");
        }
    }

}