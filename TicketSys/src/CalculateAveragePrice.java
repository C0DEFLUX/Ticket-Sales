public class CalculateAveragePrice extends AddTicketPrices
{
    public static void displayAveragePrice()
    {
        //checks if there are no ticket prices
        if (ticketPrices.isEmpty())
        {
            System.out.println("No ticket prices available to calculate average.");
            return;
        }

        double totalPrice = 0.0;

        //loops through each ticket price and calculates the total
        for (double price : ticketPrices)
        {
            totalPrice += price; //add the current price to the total sales
        }

        //calculates the average price by dividing the total by the number of prices
        double averagePrice = totalPrice / ticketPrices.size();
        System.out.println("Average ticket price: $" + averagePrice);
    }
}
