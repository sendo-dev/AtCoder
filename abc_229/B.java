import java.util.*;
public class Main {
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
        
        String argA = sc.next();
        String argB = sc.next();

        int aLen = argA.length();
        int bLen = argB.length();

        // 桁が少ない方の桁数を返す
        int loop = aLen <= bLen ? aLen : bLen;

        String rtn = "Easy";

        for (int i=0; i < loop; i++) {
            if (Integer.parseInt(argA.substring(aLen-(i+1), aLen-i)) + Integer.parseInt(argB.substring(bLen-(i+1), bLen-i)) > 9) {
                rtn = "Hard";
                break;
            }
        }

		System.out.println(rtn);
	}
}