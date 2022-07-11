import java.util.*;

public class abc237_B {
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		Integer H = sc.nextInt();
		Integer W = sc.nextInt();

		List<List<Integer>> list = new ArrayList<List<Integer>>();

		for (int j=0; j<W; j++) {
			List<Integer> listM = new ArrayList<Integer>();
			list.add(listM);
		}
		for (int i=0; i<H; i++) {
			for (int j=0; j<W; j++) {
				list.get(j).add(sc.nextInt());
			}
		}
		for (int i=0; i<W; i++) {
			for (int j=0; j<H; j++) {
				System.out.print(list.get(i).get(j));
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}