package caculator;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        // Caculator ca = new Caculator();
        // App app = new App();

        String stringPrompt = ("Please enter a string: ");
        String doublePrompt = ("Please enter a double: ");

        double num1 = App.getDouble(doublePrompt);
        double num2 = App.getDouble(doublePrompt);
        double num3 = Caculator.sum(num1, num2);
        double num4 = Caculator.Multiply(num1, num2);
        double num5 = Caculator.Divide(num1, num2);
        String nums = String.format("You want to add %.2f and %.2f", num1, num2);
        System.out.println(nums);
        System.out.println(num3);
    }
    static final Scanner inputScanner = new Scanner(System.in);
    
       
        private static String getString(String prompt) {
           System.out.println(prompt);
           String userInput = inputScanner.nextLine();
           return userInput;

        }

        private static double getDouble(String prompt) {
            System.out.println(prompt);
            double userInput = inputScanner.nextDouble();
            return userInput;
        }

    
}