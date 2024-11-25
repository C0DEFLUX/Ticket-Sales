public class ListTicketPrices extends AddTicketPrices
{
    public static void listTicketPrices()
    {
        //checks if there are no ticket prices
        if (ticketPrices.isEmpty())
        {
            System.out.println("No ticket prices available.");
            return;
        }

        //display the current list of ticket prices
        System.out.println("Ticket Prices:");
        for (int i = 0; i < ticketPrices.size(); i++)
        {
            System.out.printf("[%d] %.2f%n", i, ticketPrices.get(i)); /// print each ticket price with its index
        }
        }
    }
}
