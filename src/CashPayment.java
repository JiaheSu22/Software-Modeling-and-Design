public class CashPayment extends Payment {

    public CashPayment( final double amount ){
        super( amount );
    }

    public void printPaymentDetails(){
        System.out.print("\n* Cash Payment: ");
        super.printPaymentDetails();
    }

    public String toString(){
        return "Amount: " + getAmount();
    }
}