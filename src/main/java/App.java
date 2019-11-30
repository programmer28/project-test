/**
 * Created by Yaroslav on 01.12.2019.
 */
public class App {
    public static void main(String[] args) {
        int a = 10;
        int b = 7;
        System.out.println(sum(a,b));
        System.out.println(div(a,b));
    }
    public static int sum(int a, int b){
        return a + b;
    }

    public static int div(int a, int b){
        return a - b;
    }
}
