package BitManipulation;

import java.util.ArrayList;


class BitInteger{
	static int INTEGER_SIZE = 32;
	int t;
	BitInteger(int t){
		this.t = t;
	}
	int fetch(int column){
		return t & (1 << column);
	}
}

public class FindMissingInteger {
	static int findMiss(ArrayList<BitInteger> list){
		return findMiss(list, 0);
	}
	
	static int findMiss(ArrayList<BitInteger> list, int column){
		if (column > BitInteger.INTEGER_SIZE) {
			return 0;
		}
		ArrayList<BitInteger> count0s = new ArrayList<>(list.size()/2);
		ArrayList<BitInteger> count1s = new ArrayList<>(list.size()/2);
		for (BitInteger bitInteger : list) {
			if (bitInteger.fetch(column) == 1) {
				count1s.add(bitInteger);
			}else {
				count0s.add(bitInteger);
			}
		}
		if (count0s.size() > count1s.size()) {
			int v = findMiss(count1s, column+1);
			return (v << 1) | 1;
		}else {
			int v = findMiss(count0s, column+1);
			return (v << 1) | 0;
		}
	}
	
	
	public static void main(String[] args) {
		ArrayList<BitInteger> list = new ArrayList<>();
		list.add(new BitInteger(0));
		list.add(new BitInteger(1));
		list.add(new BitInteger(2));
		list.add(new BitInteger(4));
		list.add(new BitInteger(5));
		System.out.println(findMiss(list));
	}
}
