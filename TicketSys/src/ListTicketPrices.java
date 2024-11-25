public class ListTicketPrices extends AddTicketPrices
{
    public static void listTicketPrices()
    {
        if (ticketPrices.isEmpty())
        {
            System.out.println("No ticket prices available.");
            return;
        }

        System.out.println("Ticket Prices:");
        for (int i = 0; i < ticketPrices.size(); i++)
        {
            System.out.printf("[%d] %.2f%n", i, ticketPrices.get(i));
        }
    }
}
