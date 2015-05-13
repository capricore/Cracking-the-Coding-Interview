package BitManipulation;

public class DoubleToBinary {
	static String doubleToBinary(double num){
		if (num > 1 || num <= 0) {
			return "error";
		}
		StringBuilder string = new StringBuilder();
		string.append("0.");
		while (num > 0) {
			if (string.length() > 32) {
				return "error";
			}
			if (2 * num >= 1) {
				string.append('1');
				num = 2*num - 1;
			}else {
				string.append('0');
				num *= 2;
			}
		}
		return string.toString();
	}
	
	public static void main(String[] args) {
		System.out.println(doubleToBinary(0.5));
	}
}
