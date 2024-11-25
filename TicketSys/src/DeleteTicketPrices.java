import java.util.Scanner;

public class DeleteTicketPrices extends AddTicketPrices
{
    public static void deleteTicket(Scanner scanner)
    {
        //get tge ticket list
        ListTicketPrices.listTicketPrices();
        System.out.println("Enter the index of ticket you want to delete");
        int index = scanner.nextInt();
        //check if index is > 0 check if index is within valid index range
        if(index >= 0 && index < ticketPrices.size())
        {
            //remove a ticket by index
            ticketPrices.remove(index);
            System.out.println("Ticket deleted successfully");
            return;
        }

        System.out.println("Invalid index");
    }
}
