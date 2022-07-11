import java.util.*;

public class Main {
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
        
		String S = sc.next();

		System.out.println(Integer.parseInt(S.substring(0, 1)) * Integer.parseInt(S.substring(2, 3)));
	}
}