public class CreditCardPayment extends Payment {

    private String creditCardNumber;

    public  CreditCardPayment( final double amount , String cardNumber ){
        super(amount);
        creditCardNumber = cardNumber;
    }

    public void setCrNumber(String cardNumber){
        creditCardNumber = cardNumber;
    }

    public String getCreditCardNumber(){
        return creditCardNumber;
    }

    public void printPaymentDetails(){
        System.out.print("\n* Card payment: " + creditCardNumber + ". ");
        super.printPaymentDetails();
    }

    public String toString(){
        return "Amount: " + getAmount();
    }

}