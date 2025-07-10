//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int arr[] = {2, 8, 15, 10, 6, 8, 12, 14, 9, 11};

        System.out.println(min(arr));
    }

       static int min(int [] arr){
            int ans = arr[0];
            for(int i = 1; i<arr.length; i++){
                if(arr[i] < ans){
                    ans = arr[i];
            }
        }
            return ans;
    }
}