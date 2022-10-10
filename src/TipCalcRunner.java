import java.util.*;
public class TipCalcRunner {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int numPeople;
        int TipPercent;
        double TotalBillBeforeTip = 0;





        System.out.println("Welcome to the Tip Calculator! " );
        System.out.print("How many people are in your group? " );
        numPeople = input.nextInt();
        System.out.print("What is the Tip Percent? ");
        TipPercent = input.nextInt();
        while (input.nextDouble() > -1) {
            System.out.print("Enter a cost in dollars and cents, e.g. 12.50 (-1 to end): " );
            TotalBillBeforeTip =+ input.nextDouble();

        }
        System.out.println("-------------------------");
        System.out.print("Total Bill Before Tip: " );






    }

}
