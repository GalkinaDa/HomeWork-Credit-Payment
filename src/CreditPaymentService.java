public class CreditPaymentService {

    public int calculate(int a, double b, int c) {

        int loanAmount = a;
        double percent = b;
        int term = c;

        // месячная процентная ставка
        double m = b / 100 / 12 ;

        // коэффициент аннуитета
        double k = (m * Math.pow((1 + m), c)) / (Math.pow((1 + m), c) - 1);

        double annuityPayment = a * k;
        return (int) annuityPayment;

    }

}
