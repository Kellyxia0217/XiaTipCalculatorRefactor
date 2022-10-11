import java.util.*;
public class TipCalcRunner {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Tip Calculator! " );


        System.out.print("How many people are in your group? " );
        int numPeople = input.nextInt();
        System.out.print("What is the Tip Percent? ");
        int TipPercent = input.nextInt();
        TipCalc order = new TipCalc(numPeople, TipPercent);
        double MealCost = 0;
        while (!(MealCost == -1)) {
            System.out.print("Enter a cost in dollars and cents, e.g. 12.50 (-1 to end): " );
             MealCost = input.nextDouble();
            TipCalc.addMeal(MealCost);

        }
        System.out.println("-------------------------");
        System.out.printf("Total Bill Before Tip: $%.2f\n", TipCalc.getTotalBillBeforeTip());
        System.out.println("Tip Percentage: "+ TipCalc.getTipPercentage());
        System.out.printf("Total Tip: $%.2f\n", TipCalc.tipAmount());
        System.out.printf("Total Bill With Tip: $%.2f\n", TipCalc.totalBill());
        System.out.printf("Per Person Cost Before Tip: $%.2f\n", TipCalc. perPersonCostBeforeTip());
        System.out.printf("Tip Per Person: $%.2f\n", TipCalc.perPersonTipAmount());
        System.out.printf("Total Cost Per Person: $%.2f\n", TipCalc.perPersonTotalCost());






    }

}
