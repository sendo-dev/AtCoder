import java.util.*;

public class Main {
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
        
		Integer N = sc.nextInt();
		Integer X = sc.nextInt();

		Map<Integer, List<Integer>> map = new HashMap<>();

		for (int i = 0; i < N; i++) {
			sc.next();
			List<String> strArray = new ArrayList<String>(Arrays.asList(sc.nextLine().split("\\s")));
			List<Integer> intArray = new ArrayList<Integer>();

	        for (int l = 1; l < strArray.size(); l++) {
    	        intArray.add(Integer.parseInt(strArray.get(l)));
        	}

			Collections.sort(intArray);
			map.put(i, intArray);
		}

		for (int i = 0; i < N; i++) {
			
          	System.out.println(map.get(i));


		}

	}
}