import java.util.*;

public class abc237_D {
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		List<String> list = new ArrayList<String>();

		list.add("0");

		Integer N = sc.nextInt();
		String str = sc.next();
		for (Integer i=1; i<=N; i++) {
			if ("L".equals(str.substring(i-1, i))) {
				list.add(list.indexOf(Integer.valueOf(i-1).toString()), i.toString());
			} else {
				list.add(list.indexOf(Integer.valueOf(i-1).toString()) + 1, i.toString());
			}
		}
		String rtn = String.join(" ", list);
		System.out.println(rtn);
	}
}