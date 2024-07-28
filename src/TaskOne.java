public class TaskOne{
    public static void main(String[] args) {
        int x = 9;
        int y = 17;
        System.out.println("Original value: " + x);
        System.out.println("Binary form: " + Integer.toBinaryString(x));
        x = x << 1;
        int sum = ++x + y;
        System.out.println("y:" + x);
        System.out.println("x:" + y);
        System.out.println("sum (with prefix increment):+sum ");

    }

}