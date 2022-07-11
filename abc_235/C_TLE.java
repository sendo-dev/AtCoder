import java.util.*;

public class C_TLE {
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
        
		Integer N = sc.nextInt();
		Integer Q = sc.nextInt();

		sc.nextLine();
		List<String> strArray = new ArrayList<String>(Arrays.asList(sc.nextLine().split("\\s")));

		for (int i=0; i<Q; i++) {
			String target = sc.next();
			Integer count = sc.nextInt();

			Integer index = 0;
			Integer sumIndex = 0;

			List<String> subList = strArray.subList(0,strArray.size());
			for (int j=0; j<count; j++) {
				index = subList.indexOf(target);
				if (index == -1) {
					break;
				} else if (index+1 != strArray.size()) {
					subList = subList.subList(index+1,subList.size());
					sumIndex += index;
					sumIndex++;
				} else {
					break;
				}
			}
			System.out.println(index == -1 ? index : sumIndex);
		}
	}
}