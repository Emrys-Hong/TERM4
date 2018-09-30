public class DigitsToStringConverter {
    public static String convertDigitsToString(int[] digits, int base, char[] alphabet) {
        if (alphabet.length != base) {
            return null;
        }
        String out = "";
        for(int i:digits) {
            if(i>=base || i<0) {
                return null;
            }else {
                out += alphabet[i];
            }
        }
        return out;
    }
}
