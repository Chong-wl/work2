import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Enter the number of the program you want to run: ");
            System.out.println("1. Format Groceries");
            System.out.println("2. Format Groceries (Using Groceries.txt)");
            System.out.println("3. Format Groceries (Using Groceries.txt) and write to FormattedGroceries.txt");
            System.out.println("4. Exit");
            int choice = scanner.nextInt();
            switch (choice){
                case 1:
                    FormatGroceries.main(args);
                    break;
                case 2:
                    FormatGroceriesUsingGroceriesTxt.main(args);
                    break;
                case 3:
                    FormatGroceriesUsingGroceriesTxtAndWriteToFile.main(args);
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid choice.");
            }
        }

    }
}
