/*** This is the Business Class definition.
   * Each Bussiness object has a stock symbol,
   * its stock price from a month ago, a
   * current stock price, and a name.
   * @author Emily Louk
   * @since 3-17-2021
*/

public class Business
{
   private String name;
   private String symbol;
   private double lastPrice;
   private double currentPrice;
   
   public Business() //Default con
   {
      name = " ";
      symbol = " ";
      lastPrice = 0.00;
      currentPrice = 0.00;
   }
   
   
   public Business(String name, String symbol)//Symbol and name con
   {
      this.name = name; 
      this.symbol = symbol; 
   }
   
   
   public Business(String symbol, String name, double lastPrice, double currentPrice) //All attributes con
   {
      this.symbol = symbol;
      this.name = name;
      this.lastPrice = lastPrice;
      this.currentPrice = currentPrice;
   }

   public Business(Business copy) //Copy con
   {
      this.symbol = copy.symbol;
      this.name = copy.name;
      this.lastPrice = copy.lastPrice;
      this.currentPrice = copy.currentPrice;
   }
   
   
   //Methods----------------------------------
   
   //Accessor
   public String getName()
   {
      return name;
   }
   public String getSymbol()
   {
      return symbol;
   }
   public double getLast()
   {
      return lastPrice;
   }
   public double getCurrent()
   {
      return currentPrice;
   }
   
   //Mutator
   public void setName(String name)
   {
      this.name = name;
   }
   public void setSymbol(String symbol)
   {
      this.symbol = symbol;
   }
   public void setLast(double lastPrice)
   {
      this.lastPrice = lastPrice;
   }
   public void setCurrent(double currentPrice)
   {
      this.currentPrice = currentPrice;
   }
   
   //Equals 
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

}//end class