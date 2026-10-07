public class IncrementExample {
    public static void main(String[] args) {
        int x = 7;
        int y = 3;

        // First: post-increment (y++)
        x = y++;   // Use current y (3), assign to x, then increment y to 4
        System.out.println("After x = y++: x = " + x + ", y = " + y);

        // Second: pre-increment (++y)
        x = ++y;   // Increment y first (from 4 to 5), then assign to x
        System.out.println("After x = ++y: x = " + x + ", y = " + y);
    }
}