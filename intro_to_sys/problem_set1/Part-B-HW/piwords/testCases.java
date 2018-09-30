package piwords;

public class testCases {
    public static void main(String[] args) {
        String[] map = {"a", "a", "a", "b", "c", "d", "e", "f"};
        System.out.println(AlphabetGenerator.generateFrequencyAlphabet(4, map));
    }
}
