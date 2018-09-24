public static int powerMod(int a, int b, int m) {
    // TODO: Implement (Problem a)
    if (a<0 || b<0 || m<= 0) {
        return -1;
    }else {
        return (int)(Math.pow(a, b)%m);
    }

}