import java.util.*;
public class Main {
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
        
		Integer N = sc.nextInt();
		Integer A = sc.nextInt();
		Integer B = sc.nextInt();

        int length = 0;
        int sum = 0;
        int rtn = 0;

        for (Integer i = 0; i <= N; i++) {
            length = String.valueOf(i).length();
            for (int j = 0; j < length; j++) {
                sum += Integer.parseInt(String.valueOf(i).substring(j, j+1));
            }
            if ((A <= sum) && (sum <= B)) {
                rtn += i;
            }
            sum = 0;
        }
		System.out.println(rtn);
	}
}