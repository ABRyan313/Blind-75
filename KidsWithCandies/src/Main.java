import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int [] candies = {2, 3, 5, 1, 3};
        int extraCandies = 3;
        System.out.println(KidsWithCandies(candies, extraCandies));

    }

    public static List<Boolean> KidsWithCandies(int [] candies, int extraCandies ){
        List<Boolean> result = new ArrayList<>();
        int maxCandies = 0;

        for(int candy: candies){
            if(candy > maxCandies){
                maxCandies = candy;
            }
        }

        for(int candy: candies){
            result.add(candy + extraCandies >= maxCandies);
        }
        return result;
    }

}