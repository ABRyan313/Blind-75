//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public String Solution(String s){
        s = s.trim();
        String [] words = s.split("\\s+");

        StringBuilder sb = new StringBuilder();
        for(int i=words.length-1; i>=0; i--){
            sb.append(words[i]);
            if(i>0){
                sb.append(" ");
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Main main = new Main();
        String s = "  Hello World!  ";
        String result = main.Solution(s);
        System.out.println(result); // Output: "World! Hello"
    }
}