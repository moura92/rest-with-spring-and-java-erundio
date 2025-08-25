package https.github.com.moura92.request.converters;

public class NumberConverter {

    public static Double convertToDouble(String strNumber) throws IllegalArgumentException {
        if (strNumber == null || strNumber.isEmpty()) throw new UnsupportedOperationException("Please set a numeric value!");
        String number = strNumber.replace(",", ".");// converte virgula em ponto.
        return Double.parseDouble(number);
    }

    public static boolean isNumeric(String strNumber) {
        if (strNumber == null || strNumber.isEmpty()) return false;
        String number = strNumber.replace(",", ".");// converte virgula em ponto.
        return  number.matches("[-+]?\\.?[0-9]+");
    }
}
