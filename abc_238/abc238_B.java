import java.util.*;

public class abc238_B {
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
        
		Integer n = sc.nextInt();
		List<Integer> list = new ArrayList<Integer>();
		int target = 0;
		int tmp = 0;
		int def = 0;
		int startPosition = 0;
		list.add(360);
		for (int i=0; i<n; i++) {
			tmp = sc.nextInt();
			startPosition += tmp;
			while (startPosition >= 360) {
				startPosition -= 360;
			}
			target = startPosition;
			if (target != 0) {
				for (int j=0; j<list.size(); j++) {
					if (list.get(j) > target) {
						def = list.get(j) - target;
						list.remove(j);
						list.add(j, target);
						list.add(j+1, def);
						break;
					} else if (list.get(j) < target) {
						target -= list.get(j);
					} else {
						break;
					}
				}
			}
		}
		Collections.sort(list, Collections.reverseOrder());
		System.out.println(list.get(0));
	}
}