import java.util.*;

public class abc237_A {
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		Boolean rtn = true;
        
		String N = sc.next();
		Long myLong = Long.parseLong(N);
		if (myLong < -2147483648) {
			rtn = false;
		} else if (myLong > 2147483647) {
			rtn = false;
		}

		System.out.println(rtn ? "Yes" : "No");
	}
}