public class PaymentCalculationService {
    public int calculate(int month, double percent, int summa) {
        double numerator = percent / 1200;
        double denominatorInBrackets = 1 + numerator;
        double denominatorInExponent = Math.pow(denominatorInBrackets, -month);
        double finalDenominator = 1 - denominatorInExponent;
        int paymant = (int) (numerator / finalDenominator * summa);
        return paymant;
    }
}
