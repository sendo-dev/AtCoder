import java.util.*;
public class Main {
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
        
		Integer S = sc.nextInt();
		Integer T = sc.nextInt();
		Integer X = sc.nextInt();
		String rtn = "No";

		if (S < T) {
			if (S <= X && X < T) {
				rtn = "Yes";
			}
		} else {
			T += 24;
			if (S <= X && X < T) {
				rtn = "Yes";
			} else if (S <= (X+24) && (X+24) < T) {
				rtn = "Yes";
            }
		}

		System.out.println(rtn);
	}
}