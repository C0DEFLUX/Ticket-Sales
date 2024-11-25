public class FindMinimumPrice extends AddTicketPrices
{
    public static void displayMinimumPrice()
    {
        //checks if there are any ticket prices
        if (ticketPrices.isEmpty())
        {
            System.out.println("No ticket prices available to calculate minimum.");
            return;
        }

        double minPrice = ticketPrices.get(0);

        //loops through the list to find the minimum price
        for (double price : ticketPrices)
        {
            if (price < minPrice) //if the current price is less than the minPrice
            {
                minPrice = price; //updates the minPrice
            }
        }

        System.out.println("Minimum ticket price: $" + minPrice);
    }
}
