
public class Value {

    public static void main(String[] args) {
        int s = 15, r = 19, totalint;
        double v = 98.2, totalDouble;
        char c = 'A', G = 'S', totalChar;
        totalint = larger(s, r);
        totalDouble = larger(r, v);
        totalChar = larger(G, c);
        display(totalint, totalChar, totalDouble);

    }

    public static int larger(int x, int a) {
        if (x >= a) {
            return a;
        } else {
            return a;
        }
    }

    public static double larger(int x, double a) {
        if (x > a) {
            return x;
        } else {
            return a;
        }
    }

    public static char larger(char x, char a) {
        if (x >= a) {
            return x;
        } else {
            return a;
        }
    }

    public static void display(int x, char y, double d) {
        System.out.println("The larger intger is : " + x + "\nThe larger double is : " + d + "\nThe larger char is : " + y);
    }

}
