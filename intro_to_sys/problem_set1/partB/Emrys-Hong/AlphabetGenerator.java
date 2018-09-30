import java.util.HashMap;
public class AlphabetGenerator {
    public static char[] generateFrequencyAlphabet(int base, String[] trainingData) {
        HashMap<Character, Float> map = new HashMap<>();

        int letterTotal = 0;
        for(String word:trainingData){
            char[] myChars = word.toCharArray();
            for(char c:myChars) {
                if(Character.isLetter(c) && Character.isLowerCase(c)) {
                    letterTotal ++;
                    if (map.get(c)==null) {
                        map.put(c, (float)1);
                    }else {
                        map.put(c, map.get(c)+1);
                    }
                }
            }
        }

        for(char key: map.keySet()) {
            map.put(key, map.get(key)/letterTotal*base);
        }

        char[] charArray = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        float accum = 0;
        for(char c:charArray) {
            accum += map.get(c) == null? 0:map.get(c);
            map.put(c, accum);
        }

        char[] out = new char[base];
        for(int l=charArray.length-1; l>=0; l--) {

            for(int i=0; i<map.get(charArray[l]); i++) {


                out[i] = charArray[l];

            }
        }

        return out;
    }
}
