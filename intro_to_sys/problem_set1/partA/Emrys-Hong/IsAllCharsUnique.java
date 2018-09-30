public class UniqueChar {
    public static boolean isAllCharacterUnique(String sIn) {
        //todo: add your implementation
        if (sIn.length() > 127){
            return false;
        }
        boolean[] holder = new boolean[127];
        for(char c: sIn.toCharArray()){
            if(holder[c]){
                return false;
            } else{
                holder[c] = true;
            }
        }
        return true;
    }

    public static boolean isPermutation(String sIn1, String sIn2) {
        int[] holder1 = new int[127];
        for(char c:sIn1.toCharArray()){
            holder1[c] += 1;
        }

        int[] holder2 = new int[127];
        for(char c:sIn2.toCharArray()){
            holder2[c] += 1;
        }
        for(int i=0; i<127; i++){
            if(holder1[i] != holder2[i]){
                return false;
            }
        }
        return true;
    }

}
