import java.text.*;
public class SooriMesal8 {
   public static void main(String[] args)
   {
     NumberFormat formatter = NumberFormat.getNumberInstance();
     formatter.setMaximumFractionDigits(5);
     System.out.println("Truncated PI = "+formatter.format(Math.PI));
     formatter.setMinimumIntegerDigits(4);
     System.out.println("Truncated PI = "+formatter.format(Math.PI));
     NumberFormat money = NumberFormat.getCurrencyInstance();
     System.out.println("Money symbol usage:"+ money.format(3.53));
     NumberFormat percent = NumberFormat.getPercentInstance();
     System.out.println("Percent symbol usage:"+ percent.format(0.353));
     DecimalFormat formatting = (DecimalFormat)NumberFormat.getNumberInstance();
     formatting.setDecimalSeparatorAlwaysShown(true);
     System.out.println("Show decimal point always:"+formatting.format(3.0));
     formatting.setDecimalSeparatorAlwaysShown(false);
     System.out.println("Not show decimal point always:"+formatting.format(3.0));
   }
}
