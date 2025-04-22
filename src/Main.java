//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        CreditPaymentService service = new CreditPaymentService();

        // сумма кредита в руб.
        int loanAmount = 1_000_000;

        // процентная ставка
        double percent = 9.99;

        // срок кредита в мес.
        int term = 36;

        int creditPayment = service.calculateCreditPayment(loanAmount, percent, term);
        System.out.println(creditPayment);
    }
}