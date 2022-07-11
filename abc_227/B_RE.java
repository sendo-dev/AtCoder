/**
 * ループに0を含んでいたことが原因では？？（解答例は計算量の考慮はなかったっぽい）
 */
import java.util.*;
public class Main {
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int seikai = 0;

        for (int i = 0;i < N;i++) {

            int target = sc.nextInt();

            for (int j = 0;j <= target / 7;j++) {
                for (int k = 0;k <= j;k++) {
                    if ((4 * j * k) + (3 * j) + (3 * k) == target) {
                        seikai++;
                        break;
                    }
                }
            }
        }
		System.out.println(N - seikai);
	}
}