import java.util.*;

public class A {
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
        
		String N = sc.next();
        Integer tmp1 = Integer.parseInt(N.substring(0, 1) + N.substring(1, 2) + N.substring(2, 3));
        Integer tmp2 = Integer.parseInt(N.substring(1, 2) + N.substring(2, 3) + N.substring(0, 1));
        Integer tmp3 = Integer.parseInt(N.substring(2, 3) + N.substring(0, 1) + N.substring(1, 2));



		System.out.println(tmp1 + tmp2 + tmp3);
	}
}