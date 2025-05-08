public class Main {
    public static void main(String[] args) {
        MyCalculator calc = new MyCalculator();

        String expr1 = "2 3 + 1 4 + *";
        System.out.println("Ergebnis 1: " + calc.compute(expr1)); // 25

        String expr2 = "5 6 2 + *";
        System.out.println("Ergebnis 2: " + calc.compute(expr2)); // 40

        String expr3 = "10 2 - 2 / 3 +";
        System.out.println("Ergebnis 3: " + calc.compute(expr3)); // 7
    }
}