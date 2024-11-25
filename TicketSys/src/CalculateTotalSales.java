public class CalculateTotalSales extends AddTicketPrices
{
    public static void displayTotalSales()
    {
        if (ticketPrices.isEmpty())
        {
            System.out.println("No ticket prices available to calculate total sales.");
            return;
        }

        double totalSales = ticketPrices.stream().mapToDouble(Double::doubleValue).sum();
        System.out.println("Total sales from ticket prices: $" + totalSales);
    }
}
