public class TipCalc {
    private int numPeople;
    private int TipPercent;
    private double TotalBillBeforeTip;

    public TipCalc (int numPeople, int TipPercent) {
        this.numPeople = numPeople;
        this.TipPercent = TipPercent;
        TotalBillBeforeTip = 0;
    }

    public double GetTotalBillBeforeTip (){
        return TotalBillBeforeTip;
    }
    public int GetTipPercent() {
        return TipPercent;
    }
    public void addMeal (double cost) {
        TotalBillBeforeTip = TotalBillBeforeTip + cost;
    }

    public double tipAmount() {
       return TotalBillBeforeTip * TipPercent;
    }

    public double totalBill() {
        return TotalBillBeforeTip + tipAmount();
    }

    public double perPersonCostBeforeTip() {
        return TotalBillBeforeTip/numPeople;
    }

    public double perPersonTipAmount() {
        return tipAmount()/numPeople;

    }

    public double perPersonTotalCost() {
        return  perPersonCostBeforeTip() + perPersonTipAmount();
    }



}
