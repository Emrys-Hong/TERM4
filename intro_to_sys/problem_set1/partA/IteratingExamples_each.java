// ATTENTION 
// just edit this file
// you need not edit Main.java


import java.util.*;

public class IteratingExamples {

      public static int Act2ForEach(List<Integer> integers) {
          int sum = 0;
          for (int i:integers) {
              sum += i;
          }
          return sum;
      }
}

/**
 * yy ans:
 */
public class IteratingExamples1 {
    public static int Act2ForEach(List<Integer> integers) {
        int sum=0;
        int a=integers.size();
        for(int i=0;i<a;i++){
            sum+=integers.get(i);
        }
        return sum;
    }
}
