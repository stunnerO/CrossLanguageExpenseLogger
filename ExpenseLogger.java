package CrossLanguageExpenseLogger.java;
/* 

    import java.util.Scanner;

public class ExpenseLogger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter date (YYYY-MM-DD): ");
        String date = scanner.nextLine();

        System.out.print("Enter category (e.g., Food, Transport): ");
        String category = scanner.nextLine();

        System.out.print("Enter amount: ");
        String amount = scanner.nextLine();

        System.out.println("\nExpense Recorded:");
        System.out.println("Date: " + date);
        System.out.println("Category: " + category);
        System.out.println("Amount: " + amount);
    }
}
    

 */

 import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ExpenseLogger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter date (YYYY-MM-DD): ");
        String date = scanner.nextLine();

        System.out.print("Enter category (e.g., Food, Transport): ");
        String category = scanner.nextLine();

        System.out.print("Enter amount: ");
        String amount = scanner.nextLine();

        // Write to CSV
        try (FileWriter writer = new FileWriter("C:\\Users\\nowus\\Music\\coding Project\\CrossLanguageExpenseLogger\\expenses.csv" , true)) {
            writer.write(date + "," + category + "," + amount + "\n");
            System.out.println("\nExpense saved to expenses.csv!");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }

        if (date.isEmpty() || category.isEmpty() || amount.isEmpty()) {
        System.out.println("All fields are required.");
        return;
}
    }
}


