public class Arithmetic {
    public static void main(String[] args) {
        // Variables to hold numbers
        int num1 = 150;
        int num2 = 5;

        // Performing basic math calculations
        int sum = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;
        int quotient = num1 / num2;
        int remainder = num1 % num2;

        // Displaying results in the console
        System.out.println("First Number: " + num1);
        System.out.println("Second Number: " + num2);
        System.out.println("---------------------");
        System.out.println("Addition (+):       " + sum);
        System.out.println("Subtraction (-):    " + difference);
        System.out.println("Multiplication (*): " + product);
        System.out.println("Division (/):       " + quotient);
        System.out.println("Remainder (%):      " + remainder);
    }
}
