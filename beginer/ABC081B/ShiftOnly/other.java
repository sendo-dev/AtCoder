import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {
		try(var sc = new Scanner(System.in)) {
			final int N = sc.nextInt();
			int[] arrays = IntStream.generate(() -> sc.nextInt()).limit(N).toArray();
			
			int i;
			for(i = 0; true; i++) {
				boolean odd = IntStream.of(arrays).anyMatch(j -> j % 2 == 1);
				if(odd) break;
				arrays = IntStream.of(arrays).map(j -> j / 2).toArray();
			}
			
			System.out.println(i);
			
		}
	}

}
