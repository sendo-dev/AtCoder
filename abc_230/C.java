import java.util.*;
public class Main {
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
        
		Long N = Long.parseLong(sc.next());
		Long A = Long.parseLong(sc.next());
		Long B = Long.parseLong(sc.next());
		Long P = Long.parseLong(sc.next());
		Long Q = Long.parseLong(sc.next());
		Long R = Long.parseLong(sc.next());
		Long S = Long.parseLong(sc.next());

        String row = "";
        int already = 0;

        for (Long i = P; i <= Q; i++) {
            for (Long j = R; j <= S; j++) {
                if (already >= 2) {
                    break;
                }
                if ((Math.abs(A-i)) == (Math.abs(B-j))) {
                    row += "#";
                    already++;
                } else {
                    row += ".";
                }
            }
            System.out.println(row);
            row = "";
            already = 0;
        }
	}
}