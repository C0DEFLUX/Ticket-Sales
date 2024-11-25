public class CalculateTotalSales extends AddTicketPrices
{
    public static void displayTotalSales()
    {
        //checks if there are any ticket prices
        if (ticketPrices.isEmpty())
        {
            System.out.println("No ticket prices available to calculate total sales.");
            return;
        }

        double totalSales = 0.0;

        //loops through each ticket price and calculates the total
        for (double price : ticketPrices)
        {
            totalSales += price; //add the current price to the total sales
        }

        System.out.println("Total sales from ticket prices: $" + totalSales);
    }
}
