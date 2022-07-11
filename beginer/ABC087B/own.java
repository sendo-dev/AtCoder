import java.util.*;
public class Main {
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
        int rtn = 0;
        
		Integer A = sc.nextInt();
        Integer B = sc.nextInt();
        Integer C = sc.nextInt();
        Integer X = sc.nextInt();

        for (int i = 0; i <= A; i++) {
            for (int j = 0; j <= B; j++) {
                for (int k = 0; k <= C; k++) {
                    if (500*i + 100*j + 50*k == X) {
                        rtn++;
                    }
                }
            }
        }
		System.out.println(rtn);
	}
}