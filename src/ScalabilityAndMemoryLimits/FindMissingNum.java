package ScalabilityAndMemoryLimits;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/**
 *  4 billion num with only 10MB memory.
 * @author admin
 *
 */
//10 megabytes roughly equals 2^23 bytes, an int is 4 bytes, so we can only store 2^21 elements, so arraySize = 2^32 / blockNum <= 2^21, blockNum >= 2^11.
// bitSize = arraySize*8 <= 2^26,so 2^11 <= bitSize <= 2^26
public class FindMissingNum {

	public static void main(String[] args) throws FileNotFoundException {
		int start = -1;
		int bitSize = 1048576; //2^20 bits ( 2^17 byte)
		int blockNum = 4096; // 2^12 
		byte[] bitfield = new byte[bitSize >> 3];
		int[] blocks = new int[blockNum];
		Scanner in = new Scanner(new FileReader("file.txt"));
		while (in.hasNext()) {
			int num = in.nextInt();
			blocks[num / bitSize] ++;
		}
		for (int i = 0; i < blocks.length; i++) {
			/*if value < 2^20, then at least 1 number is missing in the section*/
			if (blocks[i] < bitSize) {
				start = i;
				break;
			}
		}
		while (in.hasNext()) {
			int n = in.nextInt();
			/*if the number is inside the block that's missing number, record it*/
			if (n - bitSize*start < bitSize && n - bitSize*start >=0) {
				int pos = n % bitSize;
				bitfield[pos >> 3] |= 1 << (pos%8);
			}
		}
		
		for (int i = 0; i < bitfield.length; i++) {
			for (int j = 0; j < 8; j++) {
				if ((bitfield[i] & (1 << j))!= 1) {
					System.out.println(j+ i*8 + start*bitSize);
					return;
				}
			}
		}
		
	}
	
}
