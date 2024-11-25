public class FindMaximumPrice extends AddTicketPrices
{
    public static void displayMaximumPrice()
    {
        if (ticketPrices.isEmpty())
        {
            System.out.println("No ticket prices available to calculate maximum.");
            return;
        }

        double maxPrice = ticketPrices.get(0);
        for (double price : ticketPrices)
        {
            if (price > maxPrice)
            {
                maxPrice = price;
            }
        }

        System.out.println("Maximum ticket price: $" + maxPrice);
    }
}
