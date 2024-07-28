public class Task2 {
    public static void main(String[] args) {
        int x = 88;
        int y = 150;
        int d = 225;
        int g = 32456;
        System.out.println("Original value: " + x);
        System.out.println("Original Value:" + d);
        System.out.println("Binary Form:" + Integer.toBinaryString(d));
        System.out.println("Binary form: " + Integer.toBinaryString(x));
        x = x << 1;
        x = x >> 2;
        System.out.println("After left shift by 1:" + x);
        System.out.println("Desimal value:" + x);
        System.out.println("Binary form: " + Integer.toBinaryString(x));
        System.out.println("After left shift by 1:" + d);
        System.out.println("Desimal value:" + d);
        System.out.println("Binary form: " + Integer.toBinaryString(d));
    }
}