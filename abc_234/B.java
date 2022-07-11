import java.util.*;

public class Main {
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
        
		Integer N = sc.nextInt();

		Integer a;
		Integer b;
		double x = 0.0;
		double max = 0.0;

		List<List<Integer>> outerlist = new ArrayList<List<Integer>>();

		for (int i=0; i < N; i++) {
			List<Integer> innerlist = new ArrayList<Integer>(){
				{
					add(sc.nextInt());
					add(sc.nextInt());
				}
			};
			outerlist.add(innerlist);
		}

		for (int i=0; i<N-1; i++) {
			for (int j=i+1; j<N; j++) {
				a = outerlist.get(i).get(0) - outerlist.get(j).get(0);
				b = outerlist.get(i).get(1) - outerlist.get(j).get(1);

				x = Math.sqrt(a*a + b*b);
				if (i == 0) {
					max = x;
				} else {
					if (max < x) {
						max = x;
					}
				}
			}
		}
		System.out.println(max);
	}
}