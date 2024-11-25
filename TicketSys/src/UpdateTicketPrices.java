import java.util.Scanner;


public class UpdateTicketPrices extends AddTicketPrices
{
    public static void updatePrices(Scanner scanner)
    {
        ListTicketPrices.listTicketPrices();
        System.out.println("Enter index of ticket price to update: ");
        int index = scanner.nextInt();

        if(index >= 0 && index < ticketPrices.size())
        {
            System.out.print("Enter new ticket price: ");
        }
    }
}
