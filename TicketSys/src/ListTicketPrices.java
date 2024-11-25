import java.util.List;

public class ListTicketPrices
{
    public static void listTicketPrice(List<Double> prices)
    {
        if (prices.isEmpty())
        {
            System.out.println("No tickets available.");
        } else {
            System.out.println("Ticket Prices:");
            prices.forEach(price -> System.out.println(" - $" + price));
        }
    }
}
