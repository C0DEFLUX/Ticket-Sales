import java.util.ArrayList;
import java.util.Scanner;

public class AddTicketPrices
{
    static ArrayList<Double> ticketPrices = new ArrayList<>();

    public static void  addTicket(Scanner scanner)
    {
        System.out.println("Enter ticket price: ");
        double ticketPrice = scanner.nextDouble();

        if(ticketPrice > 0)
        {
            ticketPrices.add(ticketPrice);
            System.out.println("Ticket added!");
            return;
        }

        System.out.println("Price must be greater than 0.");

    }
}
