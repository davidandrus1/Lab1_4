import java.util.Arrays;

public class MarkusShop {

    public static int cheapestKeyboard(int[] keyboards) {
        int min = keyboards[0];
        for (int i = 1; i < keyboards.length; i++) {
            if (keyboards[i] < min) {
                min = keyboards[i];
            }
        }
        return min;
    }

    public static int mostExpensiveItem(int[] keyboards, int[] usbs) {
        int maxKeyboard = keyboards[0];
        for (int i = 1; i < keyboards.length; i++) {
            if (keyboards[i] > maxKeyboard) {
                maxKeyboard = keyboards[i];
            }
        }

        int maxUsb = usbs[0];
        for (int i = 1; i < usbs.length; i++) {
            if (usbs[i] > maxUsb) {
                maxUsb = usbs[i];
            }
        }

        return Math.max(maxKeyboard, maxUsb);
    }


    public static void main(String[] args) {
        int[] keyboards = {40, 35, 70, 15, 45};
        int[] usbs = {20, 15, 40, 15};
        int budget = 60;

        System.out.println("Cea mai ieftin tastatura: " + cheapestKeyboard(keyboards));
        
        System.out.println("Cel mai scump obiect: " + mostExpensiveItem(keyboards, usbs));

    }
}
