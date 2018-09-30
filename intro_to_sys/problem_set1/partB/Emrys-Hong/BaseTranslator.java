public class BaseTranslator {
     public static int[] convertBase(int[] digits, int baseA, int baseB, int precisionB) {
         if ((baseA < 2) || (baseB<2) || precisionB <1) {
            return null;

        } else {
            int[] out_arr = new int[precisionB];
            for (int i=0; i<precisionB; i++) {
                int carry = 0;
                for (int j=digits.length-1; j>=0; j--) {
                    if (digits[j]<0 || digits[j]>=baseA) {
                        return null;
                    } else {
                        int x = digits[j] * baseB + carry;
                        digits[j] = x % baseA;
                        carry = x / baseA;
                    }
                }
                out_arr[i] = carry;
            }
            return out_arr;
        }
    }
}

