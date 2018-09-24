import java.util.Arrays;

public class Pset1 {	
	public static boolean isAllCharacterUnique(String sIn) {
	  //todo: add your implementation		
        for(int i = 0; i <= 127; i++) {
            String s = Character.toString((char) i);
            if(sIn.contains(s))
            sIn = sIn.replaceFirst(s, "");
        }
        if(sIn.length() == 0){
            return true;
        }else{
            return false;
        }
	}
	public static boolean isPermutation(String sIn1, String sIn2) {
	  //todo: add your implementation	
        char[] str1 = sIn1.toCharArray();
        char[] str2 = sIn2.toCharArray();
        
        Arrays.sort(str1);
        Arrays.sort(str2);
        
        return Arrays.equals(str1,str2);
	}
}

