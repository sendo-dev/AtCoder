import java.util.*;
public class Main {
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
        
        String arg10 = sc.next();
        String arg20 = sc.next();

		String arg11 = arg10.substring(0, 1);
		String arg12 = arg10.substring(1, 2);
		String arg21 = arg20.substring(0, 1);
		String arg22 = arg20.substring(1, 2);

        String rtn = "Yes";

        if (arg11.equals(".") && arg22.equals(".")) {
            rtn = "No";
        } else if (arg12.equals(".") && arg21.equals(".")) {
            rtn = "No";
        }

		System.out.println(rtn);
	}
}