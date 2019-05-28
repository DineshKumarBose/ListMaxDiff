import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListWithMaxDiff {
	
	int maxDiff;
	List<Integer> list;
	
	public ListWithMaxDiff() {
		list = new ArrayList<Integer>();
		maxDiff = 0;
	}
	
	public int getMaxDiff() {
		return maxDiff;
	}
	public void add(int number) {
		list.add(number);
		setMaxDiff();
	}
	
	private void setMaxDiff() {
		int last_value = list.get(list.size() -1);
		for(int i=0;i<list.size() -1;i++) {
			int current_value = list.get(i);
			if((last_value - list.get(i)) > maxDiff) {
				maxDiff = last_value - current_value;
			}
		}
	}
	
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);  
		int n = in.nextInt();
		ListWithMaxDiff l = new ListWithMaxDiff();
		for(int i=0;i<n;i++) {
			l.add(in.nextInt());
		}
		System.out.print(l.getMaxDiff());
		in.close();
	}
}
