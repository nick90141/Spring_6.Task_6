public class YourClass {
    public int divide(int dividend, int divisor) {
        if (divisor == 0) {
            throw new IllegalArgumentException("Деление на ноль запрещено.");
        }
        return dividend / divisor;
    }
}
