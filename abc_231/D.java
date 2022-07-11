import java.util.*;
import java.util.stream.Stream;

	public class Main {
		public static void main(String[] args){

			Scanner sc = new Scanner(System.in);
			
			int N = sc.nextInt();
			int Q = sc.nextInt();

			List<Integer> integerList = new ArrayList();

			for (int i = 0; i < N; i++) {
				integerList.add(sc.nextInt());
			}

			long rtn = 0;
			for (int j = 0; j < Q; j++) {
				int target = sc.nextInt();
				rtn = integerList.stream().filter(k -> k >= target).count();
				System.out.println(rtn);
			}
		}
	}