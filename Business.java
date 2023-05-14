/*** This is the Business Class definition.
   * Each Business object has a stock symbol,
   * its stock price from a month ago, a
   * current stock price, and a name.
   * @author Emily Louk
*/

public class Business
{
   private String name;
   private String symbol;
   private double lastPrice;
   private double currentPrice;
   
   public Business()
   {
      name = " ";
      symbol = " ";
      lastPrice = 0.00;
      currentPrice = 0.00;
   }
   
   
   /** Initializes Business with a name and stock symbol.
   *    @param name the name of the business 
   *    @param symbol the stock symbol to associate with the business 
   */
   public Business(String name, String symbol)
   {
      this.name = name; 
      this.symbol = symbol; 
   }
   
   /** Initializes Business with a name, stock symbol, last 
   *    stock price and current stock price.
   *    @param name the name of the business 
   *    @param symbol the stock symbol to associate with the business 
   *    @param lastPrice the business stock price of one month ago
   *    @param currentPrice the current stock price of the business
   */
   public Business(String symbol, String name, double lastPrice, double currentPrice)
   {
      this.symbol = symbol;
      this.name = name;
      this.lastPrice = lastPrice;
      this.currentPrice = currentPrice;
   }

   public Business(Business copy) 
   {
      this.symbol = copy.symbol;
      this.name = copy.name;
      this.lastPrice = copy.lastPrice;
      this.currentPrice = copy.currentPrice;
   }
   
   
   //Methods----------------------------------
   
   /** @return the name of the business */
   public String getName()
   {
      return name;
   }

   /** @return the stock symbol of the business */
   public String getSymbol()
   {
      return symbol;
   }
=
   /** @return the business's stock price last month */
   public double getLast()
   {
      return lastPrice;
   }

   /** @return the current stock price of the business */
   public double getCurrent()
   {
      return currentPrice;
   }
   
   /**  Changes the business name.
   *    @param name the name to set to */
   public void setName(String name)
   {
      this.name = name;
   }

   /**  Changes the business stock symbol.
   *    @param symbol the symbol to set as the stock symbol */
   public void setSymbol(String symbol)
   {
      this.symbol = symbol;
   }

   /** Changes the business's stock price of last month.
   *    @param lastPrice the price to set to */
   public void setLast(double lastPrice)
   {
      this.lastPrice = lastPrice;
   }

   
   /** Changes the business's current stock price.
   *    @param currentPrice the price to set to */
   public void setCurrent(double currentPrice)
   {
      this.currentPrice = currentPrice;
   }
   
   /** Tests two Businesses for equality based on 
   *   thier names, stock symbols, last stock price,
   *   and current stock price. 
   *   @return true if both businesses' attributes are equality
   */
   public boolean equals(Business test)
   {
      boolean same = false;
      if(name.equalsIgnoreCase(test.name) &&
         symbol.equalsIgnoreCase(test.symbol) &&
         lastPrice == test.lastPrice &&
         currentPrice == test.currentPrice)
         
         same = true;
         return same;   
   } 
   
   //toString
   public String toString()
   {
      String str = " ";
      
      str += "\nSymbol: " + symbol;
      str += "\nName: " + name;
      str += "\nLast Month Market Price: $" + lastPrice;
      str += "\nCurrent Month Market Price: $" + currentPrice;
      
      return str;
   }

}