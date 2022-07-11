import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		new Main().execute();
	}

	void execute() {
		int n = sc.nextInt(), k = sc.nextInt();

		int[] p = new int[n];
		for (int i = 0; i < n; i++) {
			p[i] = sc.nextInt() + sc.nextInt() + sc.nextInt();
		}

		int[] ps = p.clone();
		Arrays.sort(ps);

		for (int i = 0; i < n; i++) {
			System.out.println(ps[n - k] <= p[i] + 300 ? "Yes" : "No");
		}
	}
}
