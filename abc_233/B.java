import java.util.*;

public class Main {
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
        
		Integer L = sc.nextInt();
		Integer R = sc.nextInt();
        String S = sc.next();

        String rtn = "";

        StringBuilder sb = new StringBuilder(S.substring(L-1, R));
        sb.reverse();

        rtn = S.substring(0, L-1) + sb.toString() + S.substring(R, S.length());

		System.out.println(rtn);
	}
}