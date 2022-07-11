import java.util.*;

public class abc238_A {
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		Boolean rtn = false;
        
		Integer n = sc.nextInt();
		long right = n*n;
		long left = 2;

		n--;
		for (int i=0; i<n; i++) {
			left = left * 2;
			if (left > right) {
				rtn = true;
				break;
			}
		}

		if (left > right) {
			rtn = true;
		}

		System.out.println(rtn ? "Yes" : "No");
	}
}