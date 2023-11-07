public class Main {
    public static void main(String[] args) {
        YourClass yourClass = new YourClass();

        try {
            int result = yourClass.divide(10, 2);
            System.out.println("Результат деления: " + result);

            result = yourClass.divide(10, 0);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
