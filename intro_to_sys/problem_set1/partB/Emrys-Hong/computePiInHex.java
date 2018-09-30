public class PiGenerator {
    public static int[] computePiInHex(int precision) {
    // Use PiDigit.piDigit() to call method piDigit()
        if (precision < 0) {
            return null;
        }else {
            int[] out = new int[precision];
            for(int i=1; i<=precision; i++) {
                out[i-1] = PiDigit.piDigit(i);
            }
            return out;
        }
    }

}
