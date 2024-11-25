public class CalculateAveragePrice extends AddTicketPrices
{
    public static void displayAveragePrice()
    {
        if (ticketPrices.isEmpty())
        {
            System.out.println("No ticket prices available to calculate average.");
            return;
        }

        double averagePrice = ticketPrices.stream().mapToDouble(Double::doubleValue).average().orElse(0.0);
        System.out.println("Average ticket price: $" + averagePrice);
    }
}
