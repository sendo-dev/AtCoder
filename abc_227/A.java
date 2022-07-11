import java.util.*;
public class Main {
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int K = sc.nextInt();
        int A = sc.nextInt();
        A--;

        for (int i = 0;i < K;i++) {
            A++;
            if (A > N) {
                A = 1;
            }
        }

		System.out.println(A);
	}
}