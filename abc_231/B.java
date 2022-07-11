import java.util.*;
import java.util.Map.Entry;

public class Main {
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
        
		Map<String, Integer> map = new HashMap<>();
		int N = sc.nextInt();
		String tmpStr = "";

		for (int i = 0; i < N; i++) {
			tmpStr = sc.next();
			if (map.containsKey(tmpStr)) {
				map.put(tmpStr, map.get(tmpStr) + 1);
			} else {
				map.put(tmpStr, 1);
			}
		}

		List<Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
		list.sort(Entry.comparingByValue());

		System.out.println(list.get(list.size()-1).getKey());

	}
}