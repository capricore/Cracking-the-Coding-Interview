package BitManipulation;

public class Convert {
	 static int convert(int a, int b){
		int count = 0;
		for (int c = a^b; c!= 0; c>>=1) {
			count += c & 1;
		}
		return count;
	}
	
	public static void main(String[] args) {
		System.out.println(convert(29, 15));
	}
}
