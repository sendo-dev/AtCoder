import java.util.*;

public class B {
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
        
		Integer N = sc.nextInt();
		List<Integer> intArray = new ArrayList<Integer>();
		Integer tmpInt = 0;

		for (int i=0; i<N; i++) {
			tmpInt = sc.nextInt();
			if (i != 0) {
				if (!(intArray.get(i-1) < tmpInt)) {
					break;
				}
			}
			intArray.add(tmpInt);
		}

		System.out.println(intArray.get(intArray.size()-1));
	}
}