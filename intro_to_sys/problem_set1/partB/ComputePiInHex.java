public static int[] computePiInHex(int precision) {
    // TODO: Implement (Problem b)
    if (precision < 0) {
        return null;
    }else {
        System.out.println(precision);
        int[] out = new int[precision];
        for(int i=1; i<=precision; i++) {
            out[i] = piDigit(i);
        }
        return out;
    }
}