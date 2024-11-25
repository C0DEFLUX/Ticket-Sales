public class CalculateTotalSales extends AddTicketPrices
{
    public static void displayTotalSales()
    {
        if (ticketPrices.isEmpty())
        {
            System.out.println("No ticket prices available to calculate total sales.");
            return;
        }

        double totalSales = 0.0;
        for (double price : ticketPrices)
        {
            totalSales += price;
        }

        System.out.println("Total sales from ticket prices: $" + totalSales);
    }
}
