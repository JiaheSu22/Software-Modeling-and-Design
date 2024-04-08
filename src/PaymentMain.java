import java.util.Arrays;
import java.util.Collections;

public class PaymentMain
{
    public static void main( String [] args ) {

        CreditCardPayment ccp1 = new CreditCardPayment(15 , "123-45-6");
        CreditCardPayment ccp2 = new CreditCardPayment(30.50, "678-545");
        CreditCardPayment ccp3 = new CreditCardPayment(60.00, "555FIN-748-111");

        CashPayment c1 = new CashPayment(10);
        CashPayment c2 = new CashPayment(20);
        CashPayment c3 = new CashPayment(50);

        Payment [] array = new Payment [] {c1, ccp1, c2, ccp2, c3, ccp3};

        printPayments(array);

        array[2].setAmount(200);
        System.out.println();
        printPayments(array);

        System.out.println();

        Arrays.sort(array, Collections.reverseOrder());
        printPayments(array);
    }

    public static void printPayments(Payment[] array){

        for (Payment p : array)
            printPayment(p);
    }

    public static void printPayment(Payment p){
        p.printPaymentDetails();
    }
}