package ScalabilityAndMemoryLimits;

public class DuplicatePrint {
	
	static void printDuplicate(byte[] bitset, int[] array){
		for (int i = 0; i < array.length; i++) {
			int pos = array[i] >> 3;
			int bit = array[i] % 8;
			if (((bitset[pos] >> bit) & 1) == 1 ) {
				System.out.println(pos * 8 + bit);
			}else {
				bitset[pos] |= 1 << bit;
			}
		}
	}
	
	
	public static void main(String[] args) {
		byte[] bitset = new byte[32000 >> 3 + 1];
		int[] array = {42,23,64,32,42};
		printDuplicate(bitset, array);
	}

}
