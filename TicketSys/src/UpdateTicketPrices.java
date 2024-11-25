import java.util.Scanner;


public class UpdateTicketPrices extends AddTicketPrices
{
    public static void updatePrices(Scanner scanner)
    {
        //get ticket list
        ListTicketPrices.listTicketPrices();
        System.out.println("Enter index of ticket price to update: ");
        int index = scanner.nextInt();

        //check if index is >= 0 and check if index is within valid range
        if(index >= 0 && index < ticketPrices.size())
        {
            System.out.print("Enter new ticket price: ");
            double newPrice = scanner.nextDouble();

            //check if price is > 0
            if(newPrice > 0)
            {
                //set the new price
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
