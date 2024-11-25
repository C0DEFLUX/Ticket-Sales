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
            double newPrice = scanner.nextDouble();

            if(newPrice > 0)
            {
                ticketPrices.set(index, newPrice);
                System.out.println("Ticket price updated successfully. New price: " + newPrice);
                return;
            }

            System.out.println("Price must be greater than 0.");
            return;
        }
        System.out.println("Invalid index!");
    }
}
