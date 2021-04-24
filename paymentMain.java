
import cleint.payment;
import authrize.authrizecredit2;
import Print.printNon;
public class paymentMain {
    public static void main(String[] args) {
     payment p = new payment(new authrizecredit2(), new printNon() );
        p.authored_behaviour();
        System.out.print("\n");
        p.print_behaviour();
}
}
