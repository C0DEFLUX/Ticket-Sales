import java.util.ArrayList;
import java.util.Scanner;

public class AddTicketPrices
{
    //make an array list
    static ArrayList<Double> ticketPrices = new ArrayList<>();

    public static void  addTicket(Scanner scanner)
    {
        //add ticket prices to array
        System.out.println("Enter ticket price: ");
        double ticketPrice = scanner.nextDouble();

        //check if ticket prices are > 0
        if(ticketPrice > 0)
        {
            ticketPrices.add(ticketPrice);
            System.out.println("Ticket added!");
            return;
        }

        System.out.println("Price must be greater than 0.");

    }
}
