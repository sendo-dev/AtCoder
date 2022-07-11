import java.util.*;
public class Main {
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
        
		String argStr = sc.next();

        String origin = "oxx";

        int repeatNum = argStr.length() / 3;

        String tmpStr = origin.repeat(repeatNum+2);

        if (tmpStr.contains(argStr)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
	}
}