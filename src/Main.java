import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        SalesManager salesManager = new SalesManager(new int[]{11, 21, 48, 34, 14, 1, 42, 8});
        System.out.println();
        System.out.println("\"Sales analysis\"");
        System.out.printf("In this list  %s   " + "max:%n%s у.е.%n", Arrays.toString(salesManager.sales), salesManager.max());
    }
}
