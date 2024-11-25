public class FindMaximumPrice extends AddTicketPrices
{
    public static void displayMaximumPrice()
    {
        if (ticketPrices.isEmpty())
        {
            System.out.println("No ticket prices available to calculate maximum.");
            return;
        }

        double maxPrice = ticketPrices.stream().max(Double::compare).orElse(0.0);
        System.out.println("Maximum ticket price: $" + maxPrice);
    }
}
