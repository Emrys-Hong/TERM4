import java.util.Arrays;

public class Pset1 {	
	public static boolean isAllCharacterUnique(String sIn) {
        boolean[] dup = new boolean[65536];
        for (char i: sIn.toCharArray()) {
            if (dup[i] == true) {
                return false;
            }
            dup[i] = true;
        }
        return true;
	}
	public static boolean isPermutation(String sIn1, String sIn2) {
    int[] sIn1_array = new int[128];
    int[] sIn2_array = new int[128];
    Arrays.fill(sIn1_array, 0);	
    Arrays.fill(sIn2_array, 0);
    
    for (char i: sIn1.toCharArray()) {
        sIn1_array[i] ++;
    }
    for (char i: sIn2.toCharArray()) {
        sIn2_array[i] ++;
    }

    if (Arrays.equals(sIn1_array ,sIn2_array)) {
        return true;
    }else {
        return false;
    }
	}
}
