public class FindMinimumPrice extends AddTicketPrices
{
    public static void displayMinimumPrice()
    {
        if (ticketPrices.isEmpty())
        {
            System.out.println("No ticket prices available to calculate minimum.");
            return;
        }

        double minPrice = ticketPrices.stream().min(Double::compare).orElse(0.0);
        System.out.println("Minimum ticket price: $" + minPrice);
    }
}
