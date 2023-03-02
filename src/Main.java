
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        SalesManager salesManager = new SalesManager(new long[]{11, 21, 48, 34, 14, 1, 42,8});
        System.out.println();
        System.out.println("\"Analysis of sales statistics\"");
        System.out.printf("In the specified list %s we get the maximum amount of sales : %s у.е.%n", Arrays.toString(salesManager.sales), salesManager.max());
        System.out.println("Average calculation: " + salesManager.cropAverage() + " у.е.");
    }
}
