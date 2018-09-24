import java.util.*;
class equ {
    public static boolean isPermutation(String sIn1, String sIn2) {
        boolean a = false;
        if (sIn1.length() != sIn2.length()) {
            return a;
        }
        for (int i = 0; i < sIn1.length(); i++) {
            for (int j = 0; j < sIn2.length(); j++) {
                if (sIn1.charAt(i) == sIn2.charAt(j)) {

                    sIn2 = sIn2.substring(0, j) + '*' + sIn2.substring(j + 1);
                    break;
                    //sIn2.charAt(j) = '*';break;}
                }
            }
            String news = "";
            for (int k = 0; k < sIn1.length(); k++) {
                if (sIn2.charAt(k) == '*') {
                    a = true;

                } else {
                    a = false;
                    break;
                }
            }
        }
        return a;
    }
}

public class isPermu {
    public static void main (String[] args) {
        System.out.println( equ.isPermutation("bbaa", "aabb"));
    }
}
