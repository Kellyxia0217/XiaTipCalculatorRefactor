public class TipCalc {
    private static int numPeople;
    private static double TipPercent;
    private static double TotalBillBeforeTip;

    public TipCalc (int numPeople, double TipPercent) {
        this.numPeople = numPeople;
        this.TipPercent = TipPercent;
        TotalBillBeforeTip = 1;
    }

    public static Object getTotalBillBeforeTip() {
        return TotalBillBeforeTip;
    }

    public static double getTipPercentage(){
        return TipPercent;
    }


    public static void addMeal(double cost) {
        TotalBillBeforeTip = TotalBillBeforeTip + cost ;
    }

    public static double tipAmount() {
        return TotalBillBeforeTip * (TipPercent/100);
    }

    public static double totalBill() {
        return TotalBillBeforeTip + tipAmount();
    }

    public static double perPersonCostBeforeTip() {
        return TotalBillBeforeTip/numPeople;
    }

    public static double perPersonTipAmount() {
        return tipAmount()/numPeople;

    }

    public static double perPersonTotalCost() {
        return  perPersonCostBeforeTip() + perPersonTipAmount();
    }



}
