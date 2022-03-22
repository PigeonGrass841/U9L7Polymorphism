public class InsuredShippingItem extends ShippingItem
{
    private double insuredAmount;

    public InsuredShippingItem(double w, double insAmt)
    {
        super(w);
        this.insuredAmount = insAmt;
    }

    public double getCost()
    {
        return super.getCost() + this.insuredAmount;
    }

    public void addMoreInsurance(double amt)
    {
        insuredAmount += amt;
    }
}
