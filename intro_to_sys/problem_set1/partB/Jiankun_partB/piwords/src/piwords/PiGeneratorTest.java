package piwords;

public class PiGeneratorTest {
	public static void main(String[] args) {
		
		/*
		int result = PiGenerator.powerMod(2, 3, 3);
		System.out.println("powerMod:"+result);
		
		int[] result2 = PiGenerator.computePiInHex(10);
		for(int i : result2) {
			System.out.print(i+",");
		}
		
		System.out.println("next: convertbase");
		*/
		
		int[] digits = {3,17,18,4};
		int baseA = 16;
		int baseB = 26;
		int precisionB = 5; 
		int[] bases = BaseTranslator.convertBase(digits, baseA, baseB, precisionB);
		System.out.println("here");
		
		for(int j : bases) {
			System.out.print(j+", ");
		}
		
		
		
	}
}

