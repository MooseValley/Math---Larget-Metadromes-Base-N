/*
Six Sequences - Numberphile
https://youtu.be/VDD6FDhKCYA?t=404


Largest Metadrome is a number that appears in strict ascending order.
e.g. 123, 12345.

But we look at this Base N: 0, 1, 2, 3, 4, 5, 6 ...

And dislay the results as Base 10 (decimal).
0, 1, 5, 27, 194, 1865,



*** Sample Output:

Min Radix: 2
1, 5, 27, 194, 1865, 22875, 342391, 6053444, 123456789,
Exception in thread "main" java.lang.NumberFormatException: For input string: "00123456789A"
        at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
        at java.lang.Integer.parseInt(Integer.java:583)
        at LargestMetadromesBaseN.main(LargestMetadromesBaseN.java:44)
Press any key to continue . . .

*/
public class LargestMetadromesBaseN
{
   static String DIGITS_STR = "00123456789ABCDEF";
   public static void main(String[] args)
   {
      String numberStr = "";
      int increment    = 0;
      //int decimal = Integer.parseInt(hexNumber, 16); // Base 16

      System.out.println ("Min Radix: " + Character.MIN_RADIX);

      for (int base = 0; base <= 16; base++)
      {
         //numberStr += increment; // Append the next digit onto the String.
         numberStr += DIGITS_STR.charAt(base);

         if (base >= Character.MIN_RADIX)
         {
            int decimal = Integer.parseInt(numberStr, base);

            System.out.print (decimal + ", " );
         }

         //if (base > 0)
         //   increment++;
      }

      System.out.println ();
   }
}