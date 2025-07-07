//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println(mergeAlternately("abc", "defgh"));    // Output: adbecfgh
        System.out.println(mergeAlternately("dfgdshg", "wesgrfh"));
    }
    

    public static String mergeAlternately(String word1, String word2) {

        StringBuilder merged = new StringBuilder();
        int i = 0;
        int j = 0;
        while (i <word1.length() || j<word2.length() ){
            if(i <word1.length()){
                merged.append(word1.charAt(i));
                i++;
            }
            if(j < word2.length()){
                merged.append(word2.charAt(j));
                j++;
            }
        }
        return merged.toString();
    }
}