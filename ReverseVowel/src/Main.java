import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static String reverseVowels(String s) {
        Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));

        char[] arr = s.toCharArray();
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            while (left < right && !vowels.contains(arr[left])) {
                left++;
            }

            while (left < right && !vowels.contains(arr[right])) {
                right--;
            }

            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
        return new String(arr);
    }

    public static void main(String[] args) {
        String input = "hello";
        String result = reverseVowels(input);
        System.out.println(result);// Output: holle
    }
}

