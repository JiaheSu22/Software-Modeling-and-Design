public abstract class Payment implements Comparable<Payment> {

    private double amount;
    private static double total = 0.0;

    public Payment(final double amount){
        this.amount = amount;
        changeTotal(amount);
    }

    public void setAmount(final double amount_par){
        changeTotal((this.amount * -1));
        this.amount = amount_par;
        changeTotal(this.amount);
    }

    public double getAmount(){
        return amount;
    }

    public void printPaymentDetails(){
        System.out.print("Amount: " + amount + ", total: " + total);
    }

    public static double getTotal(){
        return total;
    }

    private static void changeTotal(double amount) {
        total += amount;
    }

    public int compareTo(Payment p) {
        return compare(p);
    }

    private int compare(Payment p){
        if (amount < p.getAmount())
            return -1;
        else if(amount > p.getAmount())
            return 1;
        else return 0;
    }

    public boolean equals(Object o){
        if(this == o)
            return true;
        if(!(o instanceof Payment))
            return false;
        return isTheSamePayment((Payment) o);
    }

    public int hashCode(){
        return (int)((long)amount ^ ((long)amount >>> 32));
    }

    public boolean isTheSamePayment(Object p){
        if (amount == ((Payment)p).getAmount())
            return true;
        else
            return false;
    }

    public String toString(){
        return ("Amount: " + amount);
    }
}