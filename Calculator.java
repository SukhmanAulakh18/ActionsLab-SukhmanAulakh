public class Calculator {
    // Adds two integers and returns the result
    public int add(int a, int b) {
        return a + b;
    }

    // Subtracts b from a and returns the result
    public int subtract(int a, int b) {
        return a - b;
    }

    // Simple manual test runner (optional)
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("2 + 3 = " + calc.add(2, 3));
        System.out.println("5 - 2 = " + calc.subtract(5, 2));
    }
}
// Small change to trigger CI run