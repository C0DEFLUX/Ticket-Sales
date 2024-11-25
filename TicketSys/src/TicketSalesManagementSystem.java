import java.util.Scanner;

public class TicketSalesManagementSystem
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Welcome to the Ticket Sales Management System!");
            System.out.println("1. Add Ticket Prices");
            System.out.println("2. Update Tickets");
            System.out.println("3. Delete Tickets");
            System.out.println("4. Display Tickets");
            System.out.println("5. Calculate Total Sales");
            System.out.println("6. Calculate Average Price");
            System.out.println("7. Find Maximum Price");
            System.out.println("8. Find Minimum Price");
            System.out.println("9. Exit");
            choice = scanner.nextInt();
            switch (choice)
            {
                case 1 -> ;
                case 2 -> ;
                case 3 -> ;
                case 4 -> ;
                case 5 -> ;
                case 6 -> ;
                case 7 -> ;
                case 8 -> ;
                case 9 -> ;
                default -> System.out.println("Invalid choice");
            }

        } while(choice != 9);

        scanner.close();
    }
}