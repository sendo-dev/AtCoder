import java.util.*;
public class Main {
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
        
		Integer N = sc.nextInt();
		Integer K = sc.nextInt();
        List<Integer> list = new ArrayList<Integer>();

        String rtn = "No";

        Integer sum = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 3; j++) {
                sum += sc.nextInt();
            }
            list.add(sum);
            sum = 0;
        }

        List<Integer> sortedlist = new ArrayList<Integer>(list);
        Collections.sort(sortedlist);
        Collections.reverse(sortedlist);

        Integer max = 0;

        for (int i = 0; i < N; i++) {
            max = list.get(i) + 300;
            if (sortedlist.get(K-1) <= max) {
                rtn = "Yes";
            } else {
                rtn = "No";
            }
    		System.out.println(rtn);
        }
        
        sc.close();
	}
}