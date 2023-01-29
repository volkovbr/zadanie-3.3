public class Main {
    public static void main(String[] args) {
        PaymentCalculationService service = new PaymentCalculationService();
        int paymant12month = service.calculate(12, 9.99, 1000000);
        System.out.println("ежемесячный платеж на 12 месяцев будет составлять:" + paymant12month + "рублей");

        int paymant24month = service.calculate(24, 9.99, 1000000);
        System.out.println("ежемесячный платеж на 24 месяца будет составлять:" + paymant24month + "рублей");

        int paymant36month = service.calculate(36, 9.99, 1000000);
        System.out.println("ежемесячный платеж на 36 месяцев будет составлять:" + paymant36month + "рублей");
    }
}
