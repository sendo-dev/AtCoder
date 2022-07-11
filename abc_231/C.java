import java.util.*;
import java.util.stream.Stream;

	public class Main {
		public static void main(String[] args){

			Scanner sc = new Scanner(System.in);
			
			int N = sc.nextInt();
			int Q = sc.nextInt();

			sc.nextLine();

			List<String> strArray = new ArrayList<String>(Arrays.asList(sc.nextLine().split("\\s")));

			long rtn = 0;
			for (int j = 0; j < Q; j++) {
				int target = sc.nextInt();
				rtn = integerList.stream().filter(k -> Integer.parseInt(k) >= target).count();
				System.out.println(rtn);
			}
		}
	}