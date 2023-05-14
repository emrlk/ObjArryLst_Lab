/*** Driver for the Business class.
   * @author Emily Louk
*/

import java.util.*;
import java.io.*;

public class BusinessDriver 
{
   public static void main(String[] args) throws IOException
   {
      File infile = new File("BusinessData.txt");
      Scanner scan = new Scanner(infile);
      
      ArrayList<Business> businesses = new ArrayList<Business>();
      
      setBusinessData(scan, businesses);
      System.out.println("Before Sort: -------------------");
      displayBusinessData(businesses);
      
      sortData(businesses);
      
      System.out.println("\nAfter Sort: ------------------");
      displayBusinessData(businesses);
      
      menu(businesses);
      
   }
   
   
   
   public static void setBusinessData(Scanner scan, ArrayList<Business> businesses) throws IOException
   {
      while(scan.hasNext())
      {
         String str = scan.nextLine();
         String str2 = scan.nextLine();
         String dob = scan.nextLine();
         String dob2 = scan.nextLine();
         businesses.add(new Business(str, str2, Double.parseDouble(dob), Double.parseDouble(dob2)));
      }//end while
      scan.close();
   }
   
   public static void displayBusinessData(ArrayList<Business> businesses)
   {
      for(Business b: businesses)
         System.out.println(b.toString());
   }
   
   public static void sortData(ArrayList<Business> businesses) //sorts by name
   {
      Business temp;
      
      for(int i = 0; i < businesses.size() - 1; i++)
         for(int j = 1; j < businesses.size(); j++)
            if(businesses.get(j - 1).getName().compareToIgnoreCase(businesses.get(j).getName()) > 0)
            {
               temp = businesses.get(j - 1);
               businesses.set((j - 1), businesses.get(j));
               businesses.set(j, temp);  
            }
   }
   
   
  //Menu------------------------------------------------------------
   public static void menu(ArrayList<Business> businesses)
   {
      Scanner scan = new Scanner(System.in);
      int option = 1;
      while(option >= 1 && option <= 5)
      {
         displayMenu();
         System.out.println("Enter an option (5 to exit): ");
         option = scan.nextInt();
         
         switch(option)
         {
            case 1: displayBusinessData(businesses);
               break;
            
            case 2: for(Business b: businesses)
                        System.out.println(b.getName());
               break;
            
            case 3: for(Business b: businesses)
                        System.out.println("Name: " + b.getName() + "  Current Stock Price: " + b.getCurrent());
               break;
            
            case 4: sortData(businesses);
                    displayBusinessData(businesses);
               break;
            case 5: System.exit(0);
               
               break;
         }
      }
   }
   
   public static void displayMenu()
   {
     System.out.println("\n1 = List all Business objects");
     System.out.println("2 = List Business names only");
     System.out.println("3 = List names and current stock price");
     System.out.println("4 = Sort Businesses by name");
   }

}//end class