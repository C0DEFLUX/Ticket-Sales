public class FindMinimumPrice extends AddTicketPrices
{
    public static void displayMinimumPrice()
    {
        if (ticketPrices.isEmpty())
        {
            System.out.println("No ticket prices available to calculate minimum.");
            return;
        }

        double minPrice = ticketPrices.get(0);
        for (double price : ticketPrices)
        {
            if (price < minPrice)
            {
                minPrice = price;
            }
        }

        System.out.println("Minimum ticket price: $" + minPrice);
    }
}
