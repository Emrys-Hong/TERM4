import java.util.HashMap;
import java.util.Map;

public class WordFinder {
    public static Map<String, Integer> getSubstrings(String haystack, String[] needles) {
        HashMap<String, Integer> map = new HashMap<>();

        for (String neddle:needles) {
            if (haystack.contains(neddle)) {
                int idx = haystack.indexOf(neddle);
                map.put(neddle, idx);
            }
        }
        return map;

    }
}