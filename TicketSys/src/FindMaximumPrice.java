public class FindMaximumPrice extends AddTicketPrices
{
    public static void displayMaximumPrice()
    {
        //checks if there are any ticket prices
        if (ticketPrices.isEmpty())
        {
            System.out.println("No ticket prices available to calculate maximum.");
            return;
        }

        double maxPrice = ticketPrices.get(0);

        //loop through the list to find the maximum price
        for (double price : ticketPrices)
        {
            if (price > maxPrice) //if the current price is greater than the maxPrice
            {
                maxPrice = price; //upadtes the maxPrice
            }
        }

        System.out.println("Maximum ticket price: $" + maxPrice);
    }
}
