import java.util.*;
public class Main {
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
        
        String argStr = sc.next();
        int rtn = 0;

        for (int i = 0; i < argStr.length(); i++) {
            if ("1".equals(argStr.substring(i, i+1))) {
                rtn++;
            }
        }

        System.out.print(rtn);
	}
}