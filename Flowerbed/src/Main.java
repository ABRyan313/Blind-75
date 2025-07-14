//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static boolean canPlantTree(int [] flowerbed, int n){
        int length = flowerbed.length;
        for(int i=0; i<length && n>0; i++){
            boolean emptyLeft = (i == 0) || (flowerbed[i-1] == 0);
            boolean emptyRight = (i == length - 1) || (flowerbed[i+1] == 0);

            if(emptyLeft && emptyRight){
                flowerbed[i] = 1;
                n--;
            }
        }
        return n<=0;
    }

    public static void main(String[] args) {
        int [] flowerbed = {1, 0, 0, 0, 1};
        int n = 2;
        boolean result = canPlantTree(flowerbed, n);
        System.out.println(result);
    }
}