import java.util.Scanner;

public class DeleteTicketPrices extends AddTicketPrices
{
    public static void deleteTicket(Scanner scanner)
    {
        ListTicketPrices.listTicketPrices();
        System.out.println("Enter the index of ticket you want to delete");
        int index = scanner.nextInt();

        if(index >= 0 && index < ticketPrices.size())
        {
            ticketPrices.remove(index);
            System.out.println("Ticket deleted successfully");
            return;
        }

        System.out.println("Invalid index");
    }
}
