public class CalculateAveragePrice extends AddTicketPrices
{
    public static void displayAveragePrice()
    {
        if (ticketPrices.isEmpty())
        {
            System.out.println("No ticket prices available to calculate average.");
            return;
        }

        double totalPrice = 0.0;
        for (double price : ticketPrices)
        {
            totalPrice += price;
        }

        double averagePrice = totalPrice / ticketPrices.size();
        System.out.println("Average ticket price: $" + averagePrice);
    }
}
