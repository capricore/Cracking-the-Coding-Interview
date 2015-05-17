package BitManipulation;


public class SwapOddEven {
	static int swapOddEven(int a){
		int odd = a & 0xaaaaaaaa;
		int even = a & 0x55555555;
		return even >> 1 | odd << 1;
	}
}
