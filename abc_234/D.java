import java.util.*;
import java.util.Collections;
import java.util.stream.Stream;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		Integer N = sc.nextInt();       
		Integer K = sc.nextInt();
		sc.nextLine();
		List<String> strArray = new ArrayList<String>(Arrays.asList(sc.nextLine().split("\\s")));

		List<String> subList = strArray.subList(0,K);

		for (int i=K-1; i<N; i++) {

		}

		Collections.sort(subList);
		System.out.println(subList.get(subList.size() - K));
	}
}